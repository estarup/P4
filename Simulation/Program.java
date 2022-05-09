package Simulation;
import java.util.ArrayList;
public class Program {
    Grid grid;
    ArrayList<Car> carList = new ArrayList<>();
    long startTime = System.currentTimeMillis();
    ArrayList<GridObject> list = new ArrayList<>();
    long interval = 1000;
    int carsPassed = 0;
    public void Run() {

grid = new Grid(10, 10);TrafficLight tf = new TrafficLight(2, 3, 10, "firstLight");grid.add(tf);CarSpawner spawnerSouth = new CarSpawner(2, 1, "South", 10, "southSpawner");grid.add(spawnerSouth);
        for(GridObject[] gridObject: grid.arr) {
            for(GridObject gridObject2: gridObject){
                if(gridObject2 != null) {
                    list.add(gridObject2);
                }
            }
        }

        while(true) {
            for (GridObject obj: list) {
                if (obj instanceof CarSpawner) {
                    if (System.currentTimeMillis() >= startTime + ((CarSpawner) obj).getInterval()) {
                        carList.add(((CarSpawner) obj).SpawnCar());
                        ((CarSpawner) obj).setInterval(((CarSpawner) obj).getInterval() + ((CarSpawner) obj).getFrequency());
                    }
                }
                if (obj instanceof TrafficLight) {
                    if (System.currentTimeMillis() >= startTime + ((TrafficLight) obj).getInterval()) {
                        ((TrafficLight) obj).SwitchLights();
                        ((TrafficLight) obj).setInterval((long) (((TrafficLight) obj).getInterval() + ((TrafficLight) obj).getFrequency()));
                    }
                    for (Car car: carList) {
                        switch (car.getDirection()) {
                            case "East":
                                if (car.getX() >= obj.getX() - 0.05 && car.getX() <= obj.getX()) {
                                    if (((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    }
                                    if (! car.hasPassedLight) {
                                        car.hasPassedLight = true;
                                        ((TrafficLight) obj).carPassed();
                                    }
                                }
                                break;
                            case "West":
                                if (car.getX() <= obj.getX() + 0.05 && car.getX() >= obj.getX()) {
                                    if (((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    }
                                    if (! car.hasPassedLight) {
                                        ((TrafficLight) obj).carPassed();
                                        car.hasPassedLight = true;
                                    }
                                }
                                break;
                            case "North":
                                if (car.getY() >= obj.getY() + 0.05 && car.getY() <= obj.getY()) {
                                    if (!((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    }
                                    if (! car.hasPassedLight) {
                                        ((TrafficLight) obj).carPassed();
                                        car.hasPassedLight = true;
                                    }
                                }
                                break;
                            case "South":
                                if (car.getY() <= obj.getY() - 0.05 && car.getY() <= obj.getY()) {
                                    if (!((TrafficLight) obj).isGreenNorth) {
                                        car.setSpeed(0);
                                    }
                                    if (! car.hasPassedLight) {
                                        ((TrafficLight) obj).carPassed();
                                        car.hasPassedLight = true;
                                    }
                                }
                                break;
                            default: System.out.println("Error: Car direction mismatch");
                        }
                    }
                }
            }
            if (System.currentTimeMillis() >= startTime + interval) {
                for (Car car: carList) {
                    car.Behavior();
                    car.setInterval(car.getInterval() + car.getFrequency());
                }
                interval += 1000;
            }
        }
    }
}

