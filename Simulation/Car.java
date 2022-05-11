package Simulation;
public class Car extends PositionedObject{
    public Car(double x, double y, double speed, String direction, int carNumber) {
        super(x,y);
        setSpeed(speed);
        setDirection(direction);
        setCarNumber(carNumber);
        isDriving = true;
    }

    public boolean isDriving = true;

    private void MoveCar() {
        double meterPerSec = getSpeed() / 3600; // 50km/h to m/s
        switch (getDirection()) {
            case "East" -> setX(getX() + meterPerSec );
            case "West" -> setX(getX() - meterPerSec);
            case "North" -> setY(getY() - meterPerSec);
            case "South" -> setY(getY() + meterPerSec);
        }
    }
    public void Stop() {
        if (getSpeed() > 0) {
            setSpeed(getSpeed() -8);
        } else {
            setSpeed(0);
        }
        if (getSpeed() < 0) {
            setSpeed(0);
        }
        MoveCar();
    }

    public void Drive() {
        if (getSpeed() < 50) {
            setSpeed(getSpeed() + 7.5);
        }
        if (getSpeed() > 50) {
            setSpeed(50);
        }
        MoveCar();
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    private int carNumber;

    public boolean hasPassedLight = false;
    private double speed;

    public void setSpeed(double speed) {
        if (this.speed > 50) {
            this.speed = 50;
        }
        if (this.speed < 0) {
            this.speed = 0;
        }
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
        System.out.println("Car " + carNumber + " | Position: " + getX() + "x" + getY() + " | Speed: " + getSpeed() + " | " + " Direction : " + getDirection() + " | " + " IsDriving: " + isDriving);
    }
}
