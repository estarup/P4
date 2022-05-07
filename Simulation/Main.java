import java.util.ArrayList;
package Simulation; 
public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10,10);
        ArrayList<Car> carList = new ArrayList<>();
        CarSpawner spawner = new CarSpawner(9,2, "East", 5, "eastSpawner ");
        CarSpawner spawnerSouth = new CarSpawner(0,1, "South", 2, "southSpawner");
        TrafficLight tf = new TrafficLight(2,3, 10, "firstLight");
        grid.add(spawner);
        grid.add(spawnerSouth);
        grid.add(tf);

        long startTime = System.currentTimeMillis();
        ArrayList<GridObject> list = new ArrayList<>();

        for(GridObject[] gridObject: grid.arr) {
            for(GridObject gridObject2: gridObject){
                if(gridObject2 != null) {
                    list.add(gridObject2);
                }
            }
        }
        long interval = 1000;
        int carsPassed = 0;
        while(true) {
            for (GridObject obj: list) {
                if (obj instanceof CarSpawner) {
                    if (System.currentTimeMillis() >= startTime + ((CarSpawner) obj).getInterval()) {
                        carList.add(((CarSpawner) obj).SpawnCar());
                        System.out.println("Spawn car: " + ((CarSpawner) obj).getDirection()) ;
                        ((CarSpawner) obj).setInterval(((CarSpawner) obj).getInterval() + ((CarSpawner) obj).getFrequency());
                    }
                }
                if (obj instanceof TrafficLight) {
                    if (System.currentTimeMillis() >= startTime + ((TrafficLight) obj).getInterval()) {
                        ((TrafficLight) obj).SwitchLights();
                        //System.out.println("TrafficLight switch: " + ((TrafficLight) obj).getInterval() / 1000 + "sec");
                        ((TrafficLight) obj).setInterval((long) (((TrafficLight) obj).getInterval() + ((TrafficLight) obj).getFrequency()));
                    }
                    for (Car car: carList) {
                        switch (car.getDirection()) {
                            case "East":
                              /*  if (car.getX() >= obj.getX()) {
                                    carList.remove(car);
                                    System.out.println("Car removed " + car.getDirection());
                                    break;
                                }*/
                                if (car.getX() >= obj.getX() - 0.05) {
                                    if (((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    }
                                }
                                if (car.getX() <= obj.getX() + 0.05 && ! car.hasPassedLight) {
                                    car.hasPassedLight = true;
                                    carsPassed++;
                                    System.out.println("Cars passed: " + carsPassed + " " + ((TrafficLight) obj).getName());
                                }
                                break;
                            case "West":
                               /* if (car.getX() <= 0) {
                                    carList.remove(car);
                                    System.out.println("Car removed " + car.getDirection());
                                    break;
                                }*/
                                if (car.getX() <= obj.getX() + 0.05) {
                                    if (((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    }
                                }
                                if (car.getX() >= obj.getX() - 0.05 && ! car.hasPassedLight) {
                                    car.hasPassedLight = true;
                                    carsPassed++;
                                    System.out.println("Cars passed: " + carsPassed + " " + ((TrafficLight) obj).getName());
                                }
                                break;
                            case "North":
                              /*  if (car.getY() <= 0) {
                                    carList.remove(car);
                                    System.out.println("Car removed " + car.getDirection());
                                    break;
                                }*/
                                if (car.getY() <= obj.getY() + 0.05) {
                                    if (!((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    }
                                }
                                if (car.getY() >= obj.getY() - 0.05 && ! car.hasPassedLight) {
                                    car.hasPassedLight = true;
                                    carsPassed++;
                                    System.out.println("Cars passed: " + carsPassed + " " + ((TrafficLight) obj).getName());
                                }
                                break;
                            case "South":
                               /* if (car.getY() >= grid.getY() -1) {
                                    carList.remove(car);
                                    System.out.println("Car removed " + car.getDirection());
                                    break;
                                }*/
                                if (car.getY() <= obj.getY() - 0.05) {
                                    if (!((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    }
                                }
                                if (car.getY() <= obj.getY() + 0.05 && ! car.hasPassedLight) {
                                    car.hasPassedLight = true;
                                    carsPassed++;
                                    System.out.println("Cars passed: " + carsPassed + " " + ((TrafficLight) obj).getName());
                                }
                                break;
                            default: System.out.println("Error: Car direction mismatch");
                        }
                    }
                }
            }
           /* if (System.currentTimeMillis() >= startTime + interval) {
                for (Car car: carList) {
                        car.Behavior();
                        car.setInterval(car.getInterval() + car.getFrequency());
                        if (car.getX() > grid.getX() -1 || car.getY() > grid.getY() -1 ) {
                            carList.remove(car);
                            System.out.println("Car removed " + car.getDirection());
                            break;
                        }
                }
                interval += 1000;
            }*/
        }

    }
}
