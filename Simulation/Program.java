package Simulation; 
import java.util.ArrayList;

public class Program {
    int totalSpawnedCars = 0;
    int totalPassedCars = 0;
    long interval = 1000;
    long minuteInterval = 60000;
    boolean isFirstCar = true;
    long startTime = System.currentTimeMillis();
    ArrayList<Car> carList = new ArrayList<>();
    ArrayList<TrafficLight> trafficLights = new ArrayList<>();
    ArrayList<CarSpawner> carSpawners = new ArrayList<>();
void Lights(){TrafficLight tf2 = new TrafficLight(2.0, 3.7, 20);trafficLights.add(tf2);TrafficLight tf3 = new TrafficLight(2.0, 3.8, 30);trafficLights.add(tf3);TrafficLight tf4 = new TrafficLight(2.0, 3.9, 20);trafficLights.add(tf4);}void Carspawner(){CarSpawner spawnerSouth = new CarSpawner(2.0, 3.5, "South", 120);carSpawners.add(spawnerSouth);}
    public void Run() {
int j;j = 2*2; Lights();Carspawner();
        while(true) {
            for (CarSpawner spawner: carSpawners) {
                if (isFirstCar) {
                    carList.add(spawner.SpawnCar());
                    isFirstCar = false;
                    totalSpawnedCars = 1;
                } else if (System.currentTimeMillis() >= startTime + spawner.getInterval()) {
                    carList.add(spawner.SpawnCar());
                    spawner.setInterval(spawner.getInterval() + spawner.getFrequency());
                    totalSpawnedCars += 1;
                }
            }
            for (TrafficLight light: trafficLights) {
                for (Car car: carList) {
                    switch (car.getDirection()) {
                        case "East" -> {
                            if (car.getX() >= light.getX() - 0.05 && car.getX() <= light.getX() && car.getY() == light.getY()) {
                                if (!car.hasPassedLight) {
                                    car.hasPassedLight = true;
                                    light.carPassed();
                                    totalPassedCars += 1;
                                }
                                if (!light.isGreenEast) {
                                    car.isDriving = false;
                                } else {
                                    car.isDriving = true;
                                }
                            }
                            if (car.getX() > light.getY() && car.hasPassedLight) {
                                car.hasPassedLight = false;
                                car.isDriving = true;
                            }
                        }
                        case "West" -> {
                            if (car.getX() <= light.getX() + 0.05 && car.getX() >= light.getX() && car.getY() == light.getY()) {
                                if (!car.hasPassedLight) {
                                    car.hasPassedLight = true;
                                    light.carPassed();
                                    totalPassedCars += 1;
                                }
                                if (!light.isGreenEast) {
                                    car.isDriving = false;
                                } else {
                                    car.isDriving = true;
                                }
                            }
                            if (car.getX() < light.getY() && car.hasPassedLight) {
                                car.hasPassedLight = false;
                                car.isDriving = true;
                            }
                        }
                        case "North" -> {
                            if (car.getY() <= light.getY() + 0.05 && car.getY() >= light.getY() && car.getX() == light.getX()) {
                                if (!car.hasPassedLight) {
                                    car.hasPassedLight = true;
                                    light.carPassed();
                                    totalPassedCars += 1;
                                }
                                if (!light.isGreenNorth) {
                                    car.isDriving = false;
                                } else {
                                    car.isDriving = true;
                                }
                            }
                            if (car.getY() < light.getY() && car.hasPassedLight) {
                                car.hasPassedLight = false;
                                car.isDriving = true;
                            }
                        }
                        case "South" -> {
                            if (car.getY() >= light.getY() - 0.05 && car.getY() <= light.getY() && car.getX() == light.getX()) {
                                if (!car.hasPassedLight) {
                                    car.hasPassedLight = true;
                                    light.carPassed();
                                    totalPassedCars += 1;
                                }
                                if (!light.isGreenNorth) {
                                    car.isDriving = false;
                                } else {
                                    car.isDriving = true;
                                }
                            }
                            if (car.getY() > light.getY() && car.hasPassedLight) {
                                car.hasPassedLight = false;
                                car.isDriving = true;
                            }
                        }
                        default -> System.out.println("Error: Car direction mismatch");
                    }
                }
            }
            if (System.currentTimeMillis() >= startTime + interval) {
                System.out.print("Time: " + interval / 1000 + "sec | ");
                for (Car car: carList) {
                    if (car.isDriving) {
                        car.Drive();
                    } else {
                        car.Stop();
                    }
                    car.Info();
                }
                for (TrafficLight light: trafficLights) {
                    if (System.currentTimeMillis() >= startTime + light.getInterval()){
                        light.SwitchLights();
                        light.setInterval(light.getInterval() + light.getFrequency());
                    }
                }
                interval += 1000;
            }
            if (System.currentTimeMillis() >= startTime + minuteInterval) {
                System.out.println();
                System.out.println("** Total cars passed: " + totalPassedCars + " **" );
                System.out.println("** Total spawned cars: " + totalSpawnedCars + " **");
                System.out.println();
                minuteInterval += 30000;
            }
        }
    }
}

