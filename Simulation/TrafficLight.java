package Simulation;
public class TrafficLight extends GridObject{

    public TrafficLight(int X, int Y, long frequency, String Name) {
        super(X, Y, Name);
        setFrequency(frequency * 1000);
        setInterval(this.interval += getFrequency());
        isGreenNorth = true;
    }


    private long carsPassed = 0;

    public void carPassed() {
        carsPassed++;
        System.out.println("Cars passed: " + carsPassed );
    }
    public long getCarsPassed() {
        return this.carsPassed;
    }

    public boolean isGreenNorth;

    private long interval;
    private long frequency = 5000; // every 5 seconds

    public void setFrequency(long Frequency) {
        this.frequency = Frequency;
    }

    public long getInterval() {
        return this.interval;
    }
    public void setInterval(long Interval){
        this.interval = Interval;
    }

    public double getFrequency() {
        return this.frequency;
    }



    public void SwitchLights() {
        if (isGreenNorth) {
            System.out.println("Green East/West");
            isGreenNorth = false;
        } else {
            System.out.println("Green North/South");
            isGreenNorth = true;
        }
    }


}
