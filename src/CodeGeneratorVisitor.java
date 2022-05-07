import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CodeGeneratorVisitor extends ASTVisitor<GraphNode>{

    String code = "";

    public void addCode(String c){
        code = code + c;
    }

    //FileWriter writer = new FileWriter("YourFile.txt");

    @Override
    public GraphNode visit(AddNode node) {
        return node;
    }

    @Override
    public GraphNode visit(AssignmentNode node) {
        addCode(node.ID);
        addCode(" = ");
        if (node.value instanceof BinaryOperatorNode) {
            visit((BinaryOperatorNode) node.value);
        } else if (node.value instanceof SimpleExpressionNode){
            visit((SimpleExpressionNode) node.value);
        }
        addCode("; ");
        return node;
    }



    @Override
    public BinaryOperatorNode visit(BinaryOperatorNode n) {
         if (n instanceof MultiplyNode) {
             visit((MultiplyNode) n);
             return n;
         } else if (n instanceof DivideNode) {
             visit((DivideNode) n);
             return n;
         }
        if (n.left instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.left);
        } else {
            visit((BinaryOperatorNode) n.left);
        }
        if (n.right instanceof SimpleExpressionNode) {
            addCode(n.getOperatorCharacter());
            visit((SimpleExpressionNode) n.right);
        } else {
            visit((BinaryOperatorNode) n.right);
        }
        return n;
    }

    @Override
    public BlockNode visit(BlockNode node) {
        for (GraphNode n: node.childrenList) {
            if (n != null) {
                if (n instanceof AssignmentNode) {
                    visit((AssignmentNode) n);
                } else if (n instanceof SimpleExpressionNode) {
                    visit((SimpleExpressionNode) n);
                } else if (n instanceof MultiplyNode) {
                    visit((MultiplyNode) n);
                } else if (n instanceof DivideNode) {
                    visit((DivideNode) n);
                } else if (n instanceof BinaryOperatorNode) {
                    visit((BinaryOperatorNode) n);
                } else if (n instanceof CreateNode) {
                    visit((CreateNode) n);
                } else if (n instanceof DeclarationNode) {
                    visit((DeclarationNode) n);
                }  else if (n instanceof If_Then_ElseNode){
                    visit((If_Then_ElseNode) n);
                } else if (n instanceof WhileStmNode) {
                    visit((WhileStmNode) n);
                } else if (n instanceof MethodInitNode) {
                    visit((MethodInitNode) n);
                } else if (n instanceof ReturnNode) {
                    visit((ReturnNode) n);
                } else if (n instanceof BlockNode) {
                    visit((BlockNode) n);
                }
            }
        }
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/Main.java");
            FileWriter writer = new FileWriter(file);
            writer.write("import java.util.ArrayList;\n" +
                    "package Simulation; \n" +
                    "public class Main {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Grid grid = new Grid(10,10);\n" +
                    "        ArrayList<Car> carList = new ArrayList<>();\n" +
                    "        CarSpawner spawner = new CarSpawner(9,2, \"East\", 5, \"eastSpawner \");\n" +
                    "        CarSpawner spawnerSouth = new CarSpawner(0,1, \"South\", 2, \"southSpawner\");\n" +
                    "        TrafficLight tf = new TrafficLight(2,3, 10, \"firstLight\");\n" +
                    "        grid.add(spawner);\n" +
                    "        grid.add(spawnerSouth);\n" +
                    "        grid.add(tf);\n" +
                    "\n" +
                    "        long startTime = System.currentTimeMillis();\n" +
                    "        ArrayList<GridObject> list = new ArrayList<>();\n" +
                    "\n" +
                    "        for(GridObject[] gridObject: grid.arr) {\n" +
                    "            for(GridObject gridObject2: gridObject){\n" +
                    "                if(gridObject2 != null) {\n" +
                    "                    list.add(gridObject2);\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "        long interval = 1000;\n" +
                    "        int carsPassed = 0;\n" +
                    "        while(true) {\n" +
                    "            for (GridObject obj: list) {\n" +
                    "                if (obj instanceof CarSpawner) {\n" +
                    "                    if (System.currentTimeMillis() >= startTime + ((CarSpawner) obj).getInterval()) {\n" +
                    "                        carList.add(((CarSpawner) obj).SpawnCar());\n" +
                    "                        System.out.println(\"Spawn car: \" + ((CarSpawner) obj).getDirection()) ;\n" +
                    "                        ((CarSpawner) obj).setInterval(((CarSpawner) obj).getInterval() + ((CarSpawner) obj).getFrequency());\n" +
                    "                    }\n" +
                    "                }\n" +
                    "                if (obj instanceof TrafficLight) {\n" +
                    "                    if (System.currentTimeMillis() >= startTime + ((TrafficLight) obj).getInterval()) {\n" +
                    "                        ((TrafficLight) obj).SwitchLights();\n" +
                    "                        //System.out.println(\"TrafficLight switch: \" + ((TrafficLight) obj).getInterval() / 1000 + \"sec\");\n" +
                    "                        ((TrafficLight) obj).setInterval((long) (((TrafficLight) obj).getInterval() + ((TrafficLight) obj).getFrequency()));\n" +
                    "                    }\n" +
                    "                    for (Car car: carList) {\n" +
                    "                        switch (car.getDirection()) {\n" +
                    "                            case \"East\":\n" +
                    "                              /*  if (car.getX() >= obj.getX()) {\n" +
                    "                                    carList.remove(car);\n" +
                    "                                    System.out.println(\"Car removed \" + car.getDirection());\n" +
                    "                                    break;\n" +
                    "                                }*/\n" +
                    "                                if (car.getX() >= obj.getX() - 0.05) {\n" +
                    "                                    if (((TrafficLight) obj).isGreenNorth) {\n" +
                    "                                        car.setSpeed(0);\n" +
                    "                                    }\n" +
                    "                                }\n" +
                    "                                if (car.getX() <= obj.getX() + 0.05 && ! car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = true;\n" +
                    "                                    carsPassed++;\n" +
                    "                                    System.out.println(\"Cars passed: \" + carsPassed + \" \" + ((TrafficLight) obj).getName());\n" +
                    "                                }\n" +
                    "                                break;\n" +
                    "                            case \"West\":\n" +
                    "                               /* if (car.getX() <= 0) {\n" +
                    "                                    carList.remove(car);\n" +
                    "                                    System.out.println(\"Car removed \" + car.getDirection());\n" +
                    "                                    break;\n" +
                    "                                }*/\n" +
                    "                                if (car.getX() <= obj.getX() + 0.05) {\n" +
                    "                                    if (((TrafficLight) obj).isGreenNorth) {\n" +
                    "                                        car.setSpeed(0);\n" +
                    "                                    }\n" +
                    "                                }\n" +
                    "                                if (car.getX() >= obj.getX() - 0.05 && ! car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = true;\n" +
                    "                                    carsPassed++;\n" +
                    "                                    System.out.println(\"Cars passed: \" + carsPassed + \" \" + ((TrafficLight) obj).getName());\n" +
                    "                                }\n" +
                    "                                break;\n" +
                    "                            case \"North\":\n" +
                    "                              /*  if (car.getY() <= 0) {\n" +
                    "                                    carList.remove(car);\n" +
                    "                                    System.out.println(\"Car removed \" + car.getDirection());\n" +
                    "                                    break;\n" +
                    "                                }*/\n" +
                    "                                if (car.getY() <= obj.getY() + 0.05) {\n" +
                    "                                    if (!((TrafficLight) obj).isGreenNorth) {\n" +
                    "                                        car.setSpeed(0);\n" +
                    "                                    }\n" +
                    "                                }\n" +
                    "                                if (car.getY() >= obj.getY() - 0.05 && ! car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = true;\n" +
                    "                                    carsPassed++;\n" +
                    "                                    System.out.println(\"Cars passed: \" + carsPassed + \" \" + ((TrafficLight) obj).getName());\n" +
                    "                                }\n" +
                    "                                break;\n" +
                    "                            case \"South\":\n" +
                    "                               /* if (car.getY() >= grid.getY() -1) {\n" +
                    "                                    carList.remove(car);\n" +
                    "                                    System.out.println(\"Car removed \" + car.getDirection());\n" +
                    "                                    break;\n" +
                    "                                }*/\n" +
                    "                                if (car.getY() <= obj.getY() - 0.05) {\n" +
                    "                                    if (!((TrafficLight) obj).isGreenNorth) {\n" +
                    "                                        car.setSpeed(0);\n" +
                    "                                    }\n" +
                    "                                }\n" +
                    "                                if (car.getY() <= obj.getY() + 0.05 && ! car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = true;\n" +
                    "                                    carsPassed++;\n" +
                    "                                    System.out.println(\"Cars passed: \" + carsPassed + \" \" + ((TrafficLight) obj).getName());\n" +
                    "                                }\n" +
                    "                                break;\n" +
                    "                            default: System.out.println(\"Error: Car direction mismatch\");\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                }\n" +
                    "            }\n" +
                    "           /* if (System.currentTimeMillis() >= startTime + interval) {\n" +
                    "                for (Car car: carList) {\n" +
                    "                        car.Behavior();\n" +
                    "                        car.setInterval(car.getInterval() + car.getFrequency());\n" +
                    "                        if (car.getX() > grid.getX() -1 || car.getY() > grid.getY() -1 ) {\n" +
                    "                            carList.remove(car);\n" +
                    "                            System.out.println(\"Car removed \" + car.getDirection());\n" +
                    "                            break;\n" +
                    "                        }\n" +
                    "                }\n" +
                    "                interval += 1000;\n" +
                    "            }*/\n" +
                    "        }\n" +
                    "\n" +
                    "    }\n" +
                    "}\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot create GridObjectclass");
            e.printStackTrace();
        }
        return node;
    }

    private void createGridObjectClass() {
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/GridObject.java");
            FileWriter writer = new FileWriter(file);
            writer.write("package Simulation;\n" +
                    "\n" +
                    "public class GridObject {\n" +
                    "    public GridObject(int X, int Y, String Name) {\n" +
                    "        setX(X);\n" +
                    "        setY(Y);\n" +
                    "        setName(Name);\n" +
                    "    }\n" +
                    "    private String name;\n" +
                    "\n" +
                    "    public void setName(String Name) {\n" +
                    "        this.name = Name;\n" +
                    "    }\n" +
                    "\n" +
                    "    public String getName() {\n" +
                    "        return this.name;\n" +
                    "    }\n" +
                    "\n" +
                    "    private int x;\n" +
                    "    private int y;\n" +
                    "    public int getX() {\n" +
                    "        return this.x;\n" +
                    "    }\n" +
                    "    public int getY() {\n" +
                    "        return this.y;\n" +
                    "    }\n" +
                    "\n" +
                    "    public void setX(int X) {\n" +
                    "        this.x = X;\n" +
                    "    }\n" +
                    "    public void setY(int Y) {\n" +
                    "        this.y = Y;\n" +
                    "    }\n" +
                    "}\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot create GridObjectclass");
            e.printStackTrace();
        }
    }

    private void createGridClass() {
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/Grid.java");
            FileWriter writer = new FileWriter(file);
            writer.write("package Simulation;\n" +
                    "\n" +
                    "public class Grid extends GridObject{\n" +
                    "    public Grid(int x, int y, String name) {\n" +
                    "        super(x,y, name);\n" +
                    "        arr = new GridObject[this.getX()][this.getY()];\n" +
                    "    }\n" +
                    "\n" +
                    "    public GridObject[][] arr;\n" +
                    "\n" +
                    "    public void add(GridObject gridObject) {\n" +
                    "        System.out.println(gridObject.getX() + \"x\" + gridObject.getY() + \" \" + gridObject.getName());\n" +
                    "        arr[gridObject.getX()][gridObject.getY()] = gridObject;\n" +
                    "    }\n" +
                    "}");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot create GridObject class.");
            e.printStackTrace();
        }
    }

    public void createCarClass() {
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/Car.java");
            FileWriter writer = new FileWriter(file);
            writer.write("package Simulation; \n" +
                    "public class Car{\n" +
                    "    public Car(double x, double y, double speed, String direction) {\n" +
                    "        this.setX(x);\n" +
                    "        this.setY(y);\n" +
                    "        setSpeed(speed);\n" +
                    "        setDirection(direction);\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "    public boolean hasPassedLight = false;\n" +
                    "\n" +
                    "    private double x;\n" +
                    "    private double y;\n" +
                    "\n" +
                    "    public void setX(double x) {\n" +
                    "        this.x = x;\n" +
                    "    }\n" +
                    "\n" +
                    "    public double getX() {\n" +
                    "        return this.x;\n" +
                    "    }\n" +
                    "\n" +
                    "    public double getY() {\n" +
                    "        return this.y;\n" +
                    "    }\n" +
                    "\n" +
                    "    public void setY(double y) {\n" +
                    "        this.y = y;\n" +
                    "    }\n" +
                    "\n" +
                    "    private double speed;\n" +
                    "\n" +
                    "    public void setSpeed(double speed) {\n" +
                    "        this.speed = speed;\n" +
                    "    }\n" +
                    "    public double getSpeed() {\n" +
                    "        return this.speed;\n" +
                    "    }\n" +
                    "\n" +
                    "    private long interval = 1000;\n" +
                    "\n" +
                    "    public long getFrequency() {\n" +
                    "        return 1000;\n" +
                    "    }\n" +
                    "    public long getInterval(){\n" +
                    "        return this.interval;\n" +
                    "    }\n" +
                    "    public void setInterval(long interval) {\n" +
                    "        this.interval = interval;\n" +
                    "    }\n" +
                    "\n" +
                    "    private String direction;\n" +
                    "    public void setDirection(String direction) {\n" +
                    "        this.direction = direction;\n" +
                    "    }\n" +
                    "    public String getDirection() {\n" +
                    "        return this.direction;\n" +
                    "    }\n" +
                    "\n" +
                    "    public void Behavior() { // run every second\n" +
                    "        double ms = getSpeed() / 3600 ; // 50km/h to m/s\n" +
                    "        switch (getDirection()) {\n" +
                    "            case \"East\" -> setX(getX() + ms);\n" +
                    "            case \"West\" -> setX(getX() - ms);\n" +
                    "            case \"North\" -> setY(getY() - ms);\n" +
                    "            case \"South\" -> setY(getY() + ms);\n" +
                    "        }\n" +
                    "        System.out.println(\"Car pos: \" + this.getX() + \"x\" + this.getY());\n" +
                    "    }\n" +
                    "}\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot create Car class.");
            e.printStackTrace();
        }
    }

    public void createCarSpawnerClass() {
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/CarSpawner.java");
            FileWriter writer = new FileWriter(file);
            writer.write("package Simulation;\n" +
                    "public class CarSpawner extends GridObject{\n" +
                    "\n" +
                    "    public CarSpawner(int x, int y, String direction, long frequency, String name) {\n" +
                    "        super(x, y, name);\n" +
                    "        setDirection(direction);\n" +
                    "        setFrequency(frequency * 1000);\n" +
                    "        setInterval(this.getFrequency());\n" +
                    "    }\n" +
                    "\n" +
                    "    private long interval;\n" +
                    "\n" +
                    "    public long getInterval() {\n" +
                    "        return this.interval;\n" +
                    "    }\n" +
                    "    public void setInterval(long interval){\n" +
                    "        this.interval = interval;\n" +
                    "    }\n" +
                    "    private String direction;\n" +
                    "    private long frequency = 100000; // every 10 seconds\n" +
                    "\n" +
                    "    public long getFrequency() {\n" +
                    "        return this.frequency;\n" +
                    "    }\n" +
                    "\n" +
                    "    public Car SpawnCar(){\n" +
                    "       return new Car(this.getX(), this.getY(), 50, this.getDirection()); // Spawn car with 50km/h\n" +
                    "    }\n" +
                    "\n" +
                    "    public void setFrequency(long frequency) {\n" +
                    "        this.frequency = frequency;\n" +
                    "    }\n" +
                    "\n" +
                    "    public String getDirection() {\n" +
                    "        return this.direction;\n" +
                    "    }\n" +
                    "\n" +
                    "    public void setDirection(String direction) {\n" +
                    "        this.direction = direction;\n" +
                    "    }\n" +
                    "}\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot create CarSpawner class.");
            e.printStackTrace();
        }
    }

    public void createTrafficLightClass() {
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/TrafficLight.java");
            FileWriter writer = new FileWriter(file);
            writer.write("package Simulation;\n" +
                    "public class TrafficLight extends GridObject{\n" +
                    "\n" +
                    "    public TrafficLight(int X, int Y, long frequency, String Name) {\n" +
                    "        super(X, Y, Name);\n" +
                    "        setFrequency(frequency * 1000);\n" +
                    "        setInterval(this.interval += getFrequency());\n" +
                    "        isGreenNorth = true;\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "    private long carsPassed = 0;\n" +
                    "\n" +
                    "    public void carPassed() {\n" +
                    "        carsPassed++;\n" +
                    "        System.out.println(\"Cars passed: \" + carsPassed );\n" +
                    "    }\n" +
                    "    public long getCarsPassed() {\n" +
                    "        return this.carsPassed;\n" +
                    "    }\n" +
                    "\n" +
                    "    public boolean isGreenNorth;\n" +
                    "\n" +
                    "    private long interval;\n" +
                    "    private long frequency = 5000; // every 5 seconds\n" +
                    "\n" +
                    "    public void setFrequency(long Frequency) {\n" +
                    "        this.frequency = Frequency;\n" +
                    "    }\n" +
                    "\n" +
                    "    public long getInterval() {\n" +
                    "        return this.interval;\n" +
                    "    }\n" +
                    "    public void setInterval(long Interval){\n" +
                    "        this.interval = Interval;\n" +
                    "    }\n" +
                    "\n" +
                    "    public double getFrequency() {\n" +
                    "        return this.frequency;\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "    public void SwitchLights() {\n" +
                    "        if (isGreenNorth) {\n" +
                    "            System.out.println(\"Green East/West\");\n" +
                    "            isGreenNorth = false;\n" +
                    "        } else {\n" +
                    "            System.out.println(\"Green North/South\");\n" +
                    "            isGreenNorth = true;\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "}\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot create TrafficLight class.");
            e.printStackTrace();
        }

    }



    @Override
    public GraphNode visit(CreateNode node) {
        createGridObjectClass();
        createGridClass();
        createCarClass();
        createCarSpawnerClass();
        createTrafficLightClass();

        switch (node.type) {
            case GraphNode.CARTYPE:
                System.out.println("Error: Only CarSpawner can create single car");
                break;
            case GraphNode.CARSPAWNERTYPE:
                addCode("CarSpawner " + node.ID + " = new CarSpawner(" + node.constructor.x
                        + ", " + node.constructor.y
                        + ", " + node.constructor.direction + ", "
                        + node.constructor.frequency + ", " + node.constructor.name +
                        ");");
                visit(node.body);
                addCode("grid.add(" + node.ID + ");");
                break;
            case GraphNode.GRIDTYPE:
                addCode("Grid grid = Grid(" + node.constructor.x + ", " + node.constructor.y + ");");
                visit(node.body);
                break;
            case GraphNode.TRAFFICLIGHTTYPE:
                addCode("TrafficLight " + node.ID + " = TrafficLight("
                        + node.constructor.x + ", "
                        + node.constructor.y + ", " + node.constructor.frequency + ", "
                        + node.constructor.name + ");");
                visit(node.body);
                addCode("grid.add(" + node.ID + ");");
                break;
            default:
                System.out.println("Error: Default cartype");
                break;
        }
        return node;
    }

    @Override
    public GraphNode visit(DeclarationNode node) {
        if (node.type == GraphNode.DBLTYPE) {
            addCode("double ");
        } else if (node.type == GraphNode.INTTYPE) {
            addCode("int ");
        }
        addCode(node.ID);
        addCode(";");
        return node;
    }

    @Override
    public GraphNode visit(DivideNode n) {
        if (n.left instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.left);
            addCode(n.getOperatorCharacter());
        } else {
            evaluateExpression((BinaryOperatorNode) n.left);
            addCode(n.getOperatorCharacter());
        }
        if (n.right instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.right);
        } else  {
            evaluateExpression((BinaryOperatorNode) n.right);
        }
        return n;
    }

    @Override
    public GraphNode visit(EqualNode node) {
        return node;
    }

    @Override
    public GraphNode visit(ExpressionNode node) {
        return node;
    }

    @Override
    public GraphNode visit(If_Then_ElseNode node) {
        addCode("if ");
        addCode("(");
        if (node.condition != null) {
            visit(node.condition);
        } else if (node.condition_bool != null) {
            addCode(node.condition_bool);
        }
        addCode(")");

        addCode("{");
        if (node.if_body != null) {
            visit(node.if_body);
            if (node.else_body != null) {
                visit(node.else_body);
            }
        }
        addCode("}");
        return node;
    }

    @Override
    public GraphNode visit(LessOrEqualNode node) {
        return node;
    }

    @Override
    public GraphNode visit(LessThanNode node) {
        return node;
    }

    @Override
    public GraphNode visit(MethodCallNode node) {
        return node;
    }

    @Override
    public GraphNode visit(MethodInitNode node) {
        visit(node.declaration);
        addCode("(");
        if (node.parameter.ID != null) {
            addCode(convertIntType(node.parameter.type) + " ");
            addCode(node.parameter.ID);
        }
        addCode(")");

        addCode("{");
        if (node.body != null) {
            visit(node.body);
        }
        addCode("}");

        System.out.println(code);
        return node;
    }

    private String convertIntType(int returnType) {

        if (returnType == 0) {
            return "double";
        } else if (returnType == 1) {
            return "int";
        }
        return null;
    }

    private String convertStringType(String returnType) {
        if (returnType.equals("void")) {
            return "void";
        } else if (returnType.equals("Int")) {
            return "int ";
        } else if (returnType.equals("Double")) {
            return "double ";
        }
        return null;
    }

    @Override
    public GraphNode visit(MethodDeclarationNode node) {
        addCode(convertStringType(node.returnType));
        addCode(" ");
        addCode(node.name);
        return node;
    }

    @Override
    public GraphNode visit(MoreOrEqualNode node) {
        return node;
    }

    @Override
    public GraphNode visit(MoreThanNode node) {
        return node;
    }

    private void evaluateExpression(BinaryOperatorNode n) {
        if (n instanceof AddNode || n instanceof SubtractNode) {
            addCode("(");
            visit((BinaryOperatorNode) n);
            addCode(")");
        }
        else {
            visit(n);
        }
    }
    @Override
    public GraphNode visit(MultiplyNode n) {
        if (n.left instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.left);
            addCode(n.getOperatorCharacter());
        } else {
            evaluateExpression((BinaryOperatorNode) n.left);
            addCode(n.getOperatorCharacter());
        }
        if (n.right instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.right);
        } else  {
            evaluateExpression((BinaryOperatorNode) n.right);
        }
        return n;
    }

    @Override
    public GraphNode visit(NegateNode node) {
        return node;
    }

    @Override
    public GraphNode visit(NotEqualNode node) {
        return node;
    }

    @Override
    public GraphNode visit(ReturnNode node) {
        addCode("return ");
        addCode(node.ID + ";");
        return node;
    }

    @Override
    public GraphNode visit(SimpleExpressionNode node) {
        addCode(node.value);
        return node;
    }

    @Override
    public GraphNode visit(StatementNode node) {
        return node;
    }

    @Override
    public GraphNode visit(StringNode node) {
        return node;
    }

    @Override
    public GraphNode visit(SubtractNode node) {
        return node;
    }

    @Override
    public GraphNode visit(WhileStmNode node) {
        addCode("while ");
        addCode("(");
        if (node.condition != null) {
            visit(node.condition);
        } else if (node.condition_bool != null) {
            addCode(node.condition_bool);
        }
        addCode(")");

        addCode("{");
        if (node.body != null) {
            visit(node.body);
        }
        addCode("}");
        return node;
    }
}
