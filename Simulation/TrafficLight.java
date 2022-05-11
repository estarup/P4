package Simulation; 
public class TrafficLight extends GridObject{

    public static int lightCount = 0;
    public TrafficLight(int X, int Y, long frequency) {
        super(X, Y);
        lightCount += 1;
        setFrequency(frequency * 1000);
        setInterval(interval += getFrequency());
        isGreenNorth = true;
    }

    private long carsPassed = 0;

    public void carPassed() {
        carsPassed++;
        System.out.println("Light " + lightCount + " has " + carsPassed + " cars passed");
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
            System.out.println("TrafficLight " + lightCount + " is green East/West");
            isGreenNorth = false;
        } else {
            System.out.println("TrafficLight " + lightCount + " is green North/South");
            isGreenNorth = true;
        }
    }


}
