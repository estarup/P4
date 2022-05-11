package Simulation;
public class CarSpawner extends PositionedObject{
    public static int carNumber = 0;

    public CarSpawner(double x, double y, String direction, long frequency) {
        super(x, y);
        setDirection(direction);
        setFrequency(frequency * 1000);
        setInterval(getFrequency());
    }

    private long interval;

    public long getInterval() {
        return this.interval;
    }
    public void setInterval(long interval){
        this.interval = interval;
    }
    private String direction;
    private long frequency = 100000; // every 10 seconds

    public long getFrequency() {
        return this.frequency;
    }

    public Car SpawnCar(){
        carNumber++;
        return new Car(getX(), getY(), 0, getDirection(), carNumber); // Spawn car with 50km/h
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
