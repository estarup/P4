package Simulation;
public class Grid extends GridObject{
    public Grid(int x, int y) {
        super(x,y);
        arr = new GridObject[this.getX()][this.getY()];
    }

    public GridObject[][] arr;

    public void add(GridObject gridObject) {
        System.out.println(gridObject.getX() + "x" + gridObject.getY() + " " + gridObject.getName());
        arr[gridObject.getX()][gridObject.getY()] = gridObject;
    }
}