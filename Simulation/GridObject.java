package Simulation;

public class GridObject {
    public GridObject(int X, int Y, String Name) {
        setX(X);
        setY(Y);
        setName(Name);
    }
    private String name;

    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name;
    }

    private int x;
    private int y;
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public void setX(int X) {
        this.x = X;
    }
    public void setY(int Y) {
        this.y = Y;
    }
}
