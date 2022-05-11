package Simulation; 
import java.util.ArrayList;
public class Program {
    int totalSpawnedCars = 0;
    int totalPassedCars = 0;
    long interval = 1000;
    long minuteInterval = 60000;
    boolean isFirstCar = true;
    long startTime = System.currentTimeMillis();
    ArrayList<GridObject> list = new ArrayList<>();
    ArrayList<Car> carList = new ArrayList<>();
    Grid grid;

    public void Run() {
grid = new Grid(10, 10);CarSpawner spawnerSouth = new CarSpawner(2, 2, "South", 10);grid.add(spawnerSouth);TrafficLight tf = new TrafficLight(2, 3, 10);grid.add(tf);if (totalSpawnedCars>2){System.out.println("hello there");}if (totalPassedCars>1){System.out.println("2 cars passed");}

        for (GridObject[] gridObject : grid.arr) {
            for (GridObject gridObject2 : gridObject) {
                if (gridObject2 != null) {
                    list.add(gridObject2);
                }
            }
        }


        while(true) {
            for (GridObject obj: list) {
                if (obj instanceof CarSpawner) {
                    if (isFirstCar) {
                        carList.add(((CarSpawner) obj).SpawnCar());
                        ((CarSpawner) obj).setInterval(((CarSpawner) obj).getInterval() + ((CarSpawner) obj).getFrequency());
                        isFirstCar = false;
                        totalSpawnedCars = 1;
                    } else if (System.currentTimeMillis() >= startTime + ((CarSpawner) obj).getInterval()) {
                        carList.add(((CarSpawner) obj).SpawnCar());
                        ((CarSpawner) obj).setInterval(((CarSpawner) obj).getInterval() + ((CarSpawner) obj).getFrequency());
                        totalSpawnedCars += 1;
                    }
                }
                if (obj instanceof TrafficLight) {
                    if (System.currentTimeMillis() >= startTime + ((TrafficLight) obj).getInterval()) {
                        ((TrafficLight) obj).SwitchLights();
                        ((TrafficLight) obj).setInterval((long) (((TrafficLight) obj).getInterval() + ((TrafficLight) obj).getFrequency()));
                    }
                    for (Car car: carList) {
                        switch (car.getDirection()) {
                            case "East" -> {
                                if (car.getX() >= obj.getX() - 0.03 && car.getX() <= obj.getX()) {
                                    if (((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    } else {
                                        car.setSpeed(50);
                                    }
                                    if (!car.hasPassedLight) {
                                        car.hasPassedLight = true;
                                        ((TrafficLight) obj).carPassed();
                                        totalPassedCars += 1;
                                    }
                                }
                                if (car.getX() > obj.getX()) {
                                    car.hasPassedLight = false;
                                }
                            }
                            case "West" -> {
                                if (car.getX() <= obj.getX() + 0.03 && car.getX() >= obj.getX()) {
                                    if (((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    } else {
                                        car.setSpeed(50);
                                    }
                                    if (!car.hasPassedLight) {
                                        ((TrafficLight) obj).carPassed();
                                        car.hasPassedLight = true;
                                        totalPassedCars += 1;
                                    }
                                }
                                if (car.getX() <= obj.getX()) {
                                    car.hasPassedLight = false;
                                }
                            }
                            case "North" -> {
                                if (car.getY() >= obj.getY() + 0.03 && car.getY() <= obj.getY()) {
                                    if (!((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    } else {
                                        car.setSpeed(50);
                                    }

                                    if (!car.hasPassedLight) {
                                        ((TrafficLight) obj).carPassed();
                                        car.hasPassedLight = true;
                                        totalPassedCars += 1;
                                    }
                                }
                                if (car.getY() < obj.getY() && car.hasPassedLight) {
                                    car.hasPassedLight = false;
                                }
                            }
                            case "South" -> {
                                if (car.getY() >= obj.getY() - 0.03 && car.getY() <= obj.getY()) {
                                    if (!((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    } else {
                                        car.setSpeed(50);
                                    }
                                    if (!car.hasPassedLight) {
                                        ((TrafficLight) obj).carPassed();
                                        car.hasPassedLight = true;
                                        totalPassedCars += 1;
                                    }
                                }
                                if (car.getY() > obj.getY() && car.hasPassedLight) {
                                    car.hasPassedLight = false;
                                }
                            }
                            default -> System.out.println("Error: Car direction mismatch");
                        }
                    }
                }
            }
            if (System.currentTimeMillis() >= startTime + interval) {
                System.out.print("Time: " + interval / 1000 + "sec | ");
                for (Car car: carList) {
                    car.Behavior();
                    car.setInterval(car.getInterval() + car.getFrequency());
                }
                interval += 1000;
            }

            if (System.currentTimeMillis() >= startTime + minuteInterval) {
                System.out.println("** Total cars passed: " + totalPassedCars + " **");
                System.out.println("** Total spawned cars: " + totalSpawnedCars + " **");
                minuteInterval += 60000;
            }
        }
    }
}

