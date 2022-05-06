package Simulation;

public class Grid extends GridObject{
    public Grid(int x, int y, String name) {
        super(x,y, name);
        arr = new GridObject[this.getX()][this.getY()];
    }

    public GridObject[][] arr;

    public void add(GridObject gridObject) {
        System.out.println(gridObject.getX() + "x" + gridObject.getY() + " " + gridObject.getName());
        arr[gridObject.getX()][gridObject.getY()] = gridObject;
    }
}