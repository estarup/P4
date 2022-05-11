package Simulation;
public class TrafficLight extends PositionedObject{

    public static int lightCount = 0;
    public TrafficLight(double x, double y, long frequency) {
        super(x,y);
        lightNumber = (lightCount += 1);
        setFrequency(frequency * 1000);
        setInterval(interval += getFrequency());
        isGreenNorth = true;
        isGreenEast = false;
    }

    private long carsPassed = 0;
    private int lightNumber;

    public void carPassed() {
        carsPassed++;
    }
    public long getCarsPassed() {
        return this.carsPassed;
    }

    public boolean isGreenNorth;
    public boolean isGreenEast;

    private long interval;
    private long frequency = 5000; // every 5 seconds

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public long getInterval() {
        return this.interval;
    }
    public void setInterval(long Interval){
        this.interval = Interval;
    }

    public long getFrequency() {
        return this.frequency;
    }



    public void SwitchLights() {
        if (isGreenNorth) {
            System.out.println(" ** TrafficLight " + lightNumber + " is green East/West | ");
            isGreenNorth = false;
        } else {
            System.out.println(" ** TrafficLight " + lightNumber + " is green North/South | ");
            isGreenNorth = true;
        }
    }


}
