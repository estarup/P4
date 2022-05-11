package Simulation;
public class Car{
    public Car(double x, double y, double speed, String direction, int carNumber) {
        setX(x);
        setY(y);
        setSpeed(speed);
        setDirection(direction);
        setCarNumber(carNumber);
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    private int carNumber;

    public boolean hasPassedLight = false;

    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double speed;

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getSpeed() {
        return this.speed;
    }

    private long interval = 1000;

    public long getFrequency() {
        return 1000;
    }
    public long getInterval(){
        return this.interval;
    }
    public void setInterval(long interval) {
        this.interval = interval;
    }

    private String direction;
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public String getDirection() {
        return this.direction;
    }

    public void Behavior() { // run every second
        double ms = getSpeed() / 3600 ; // 50km/h to m/s
        switch (getDirection()) {
            case "East" -> setX(getX() + ms );
            case "West" -> setX(getX() - ms);
            case "North" -> setY(getY() - ms);
            case "South" -> setY(getY() + ms);
        }
        System.out.println("Car " + carNumber + " pos:" + getX() + "x" + getY());
    }
}
