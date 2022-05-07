package Simulation;
public class CarSpawner extends GridObject{

    public CarSpawner(int x, int y, String direction, long frequency, String name) {
        super(x, y, name);
        setDirection(direction);
        setFrequency(frequency * 1000);
        setInterval(this.getFrequency());
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
       return new Car(this.getX(), this.getY(), 50, this.getDirection()); // Spawn car with 50km/h
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
