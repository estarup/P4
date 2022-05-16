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

    public void Run() {
int j;String p;p = "hello"; 
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
                                if (!light.isGreenEast) {
                                    car.isDriving = false;
                                } else {
                                    car.isDriving = true;
                                }
                            }
                            if (car.getX() > light.getY() && !car.hasPassedLight) {
                                light.carPassed();
                                car.hasPassedLight = true;
                                car.isDriving = true;
                                totalPassedCars += 1;
                            }
                        }
                        case "West" -> {
                            if (car.getX() <= light.getX() + 0.05 && car.getX() >= light.getX() && car.getY() == light.getY()) {
                                if (!light.isGreenEast) {
                                    car.isDriving = false;
                                } else {
                                    car.isDriving = true;
                                }
                            }
                            if (car.getX() < light.getY() && !car.hasPassedLight) {
                                light.carPassed();
                                car.hasPassedLight = true;
                                car.isDriving = true;
                                totalPassedCars += 1;
                            }
                        }
                        case "North" -> {
                            if (car.getY() <= light.getY() + 0.05 && car.getY() >= light.getY() && car.getX() == light.getX()) {
                                if (!light.isGreenNorth) {
                                    car.isDriving = false;
                                } else {
                                    car.isDriving = true;
                                }
                            }
                            if (car.getY() < light.getY() && !car.hasPassedLight) {
                                light.carPassed();
                                car.hasPassedLight = true;
                                car.isDriving = true;
                                totalPassedCars += 1;
                            }
                        }
                        case "South" -> {
                            if (car.getY() >= light.getY() - 0.05 && car.getY() <= light.getY() && car.getX() == light.getX()) {
                                if (!light.isGreenNorth) {
                                    car.isDriving = false;
                                } else {
                                    car.isDriving = true;
                                }
                            }
                            if (car.getY() > light.getY() && !car.hasPassedLight) {
                                light.carPassed();
                                car.isDriving = true;
                                car.hasPassedLight = true;
                                totalPassedCars += 1;
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

