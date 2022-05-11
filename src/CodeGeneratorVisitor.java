import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CodeGeneratorVisitor extends ASTVisitor<GraphNode>{

    String code = "";

    public void addCode(String c){
        code = code + c;
    }


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


        if (node == null) {return null;}
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
                } else if (n instanceof PrintNode) {
                    visit((PrintNode) n);
                } else if (n instanceof BlockNode) {
                    visit((BlockNode) n);
                }
            }
        }
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/Program.java");
            FileWriter writer = new FileWriter(file);
            writer.write("package Simulation; \n" +
                    "import java.util.ArrayList;\n" +
                    "public class Program {\n" +
                    "    int totalSpawnedCars = 0;\n" +
                    "    int totalPassedCars = 0;\n" +
                    "    long interval = 1000;\n" +
                    "    long minuteInterval = 60000;\n" +
                    "    boolean isFirstCar = true;\n" +
                    "    long startTime = System.currentTimeMillis();\n" +
                    "    ArrayList<GridObject> list = new ArrayList<>();\n" +
                    "    ArrayList<Car> carList = new ArrayList<>();\n" +
                    "    Grid grid;\n" +
                    "\n" +
                    "    public void Run() {\n" + code +
                    "\n" +
                    "\n" +
                    "        for (GridObject[] gridObject : grid.arr) {\n" +
                    "            for (GridObject gridObject2 : gridObject) {\n" +
                    "                if (gridObject2 != null) {\n" +
                    "                    list.add(gridObject2);\n" +
                    "                }\n" +
                    "            }\n" +
                    "        }\n" +
                    "\n" +
                    "\n" +
                    "        while(true) {\n" +
                    "            for (GridObject obj: list) {\n" +
                    "                if (obj instanceof CarSpawner) {\n" +
                    "                    if (isFirstCar) {\n" +
                    "                        carList.add(((CarSpawner) obj).SpawnCar());\n" +
                    "                        ((CarSpawner) obj).setInterval(((CarSpawner) obj).getInterval() + ((CarSpawner) obj).getFrequency());\n" +
                    "                        isFirstCar = false;\n" +
                    "                        totalSpawnedCars = 1;\n" +
                    "                    } else if (System.currentTimeMillis() >= startTime + ((CarSpawner) obj).getInterval()) {\n" +
                    "                        carList.add(((CarSpawner) obj).SpawnCar());\n" +
                    "                        ((CarSpawner) obj).setInterval(((CarSpawner) obj).getInterval() + ((CarSpawner) obj).getFrequency());\n" +
                    "                        totalSpawnedCars += 1;\n" +
                    "                    }\n" +
                    "                }\n" +
                    "                if (obj instanceof TrafficLight) {\n" +
                    "                    if (System.currentTimeMillis() >= startTime + ((TrafficLight) obj).getInterval()) {\n" +
                    "                        ((TrafficLight) obj).SwitchLights();\n" +
                    "                        ((TrafficLight) obj).setInterval((long) (((TrafficLight) obj).getInterval() + ((TrafficLight) obj).getFrequency()));\n" +
                    "                    }\n" +
                    "                    for (Car car: carList) {\n" +
                    "                        switch (car.getDirection()) {\n" +
                    "                            case \"East\" -> {\n" +
                    "                                if (car.getX() >= obj.getX() - 0.03 && car.getX() <= obj.getX()) {\n" +
                    "                                    if (((TrafficLight) obj).isGreenNorth) {\n" +
                    "                                        car.setSpeed(0);\n" +
                    "                                    } else {\n" +
                    "                                        car.setSpeed(50);\n" +
                    "                                    }\n" +
                    "                                    if (!car.hasPassedLight) {\n" +
                    "                                        car.hasPassedLight = true;\n" +
                    "                                        ((TrafficLight) obj).carPassed();\n" +
                    "                                        totalPassedCars += 1;\n" +
                    "                                    }\n" +
                    "                                }\n" +
                    "                                if (car.getX() > obj.getX()) {\n" +
                    "                                    car.hasPassedLight = false;\n" +
                    "                                }\n" +
                    "                            }\n" +
                    "                            case \"West\" -> {\n" +
                    "                                if (car.getX() <= obj.getX() + 0.03 && car.getX() >= obj.getX()) {\n" +
                    "                                    if (((TrafficLight) obj).isGreenNorth) {\n" +
                    "                                        car.setSpeed(0);\n" +
                    "                                    } else {\n" +
                    "                                        car.setSpeed(50);\n" +
                    "                                    }\n" +
                    "                                    if (!car.hasPassedLight) {\n" +
                    "                                        ((TrafficLight) obj).carPassed();\n" +
                    "                                        car.hasPassedLight = true;\n" +
                    "                                        totalPassedCars += 1;\n" +
                    "                                    }\n" +
                    "                                }\n" +
                    "                                if (car.getX() <= obj.getX()) {\n" +
                    "                                    car.hasPassedLight = false;\n" +
                    "                                }\n" +
                    "                            }\n" +
                    "                            case \"North\" -> {\n" +
                    "                                if (car.getY() >= obj.getY() + 0.03 && car.getY() <= obj.getY()) {\n" +
                    "                                    if (!((TrafficLight) obj).isGreenNorth) {\n" +
                    "                                        car.setSpeed(0);\n" +
                    "                                    } else {\n" +
                    "                                        car.setSpeed(50);\n" +
                    "                                    }\n" +
                    "\n" +
                    "                                    if (!car.hasPassedLight) {\n" +
                    "                                        ((TrafficLight) obj).carPassed();\n" +
                    "                                        car.hasPassedLight = true;\n" +
                    "                                        totalPassedCars += 1;\n" +
                    "                                    }\n" +
                    "                                }\n" +
                    "                                if (car.getY() < obj.getY() && car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = false;\n" +
                    "                                }\n" +
                    "                            }\n" +
                    "                            case \"South\" -> {\n" +
                    "                                if (car.getY() >= obj.getY() - 0.03 && car.getY() <= obj.getY()) {\n" +
                    "                                    if (!((TrafficLight) obj).isGreenNorth) {\n" +
                    "                                        car.setSpeed(0);\n" +
                    "                                    } else {\n" +
                    "                                        car.setSpeed(50);\n" +
                    "                                    }\n" +
                    "                                    if (!car.hasPassedLight) {\n" +
                    "                                        ((TrafficLight) obj).carPassed();\n" +
                    "                                        car.hasPassedLight = true;\n" +
                    "                                        totalPassedCars += 1;\n" +
                    "                                    }\n" +
                    "                                }\n" +
                    "                                if (car.getY() > obj.getY() && car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = false;\n" +
                    "                                }\n" +
                    "                            }\n" +
                    "                            default -> System.out.println(\"Error: Car direction mismatch\");\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                }\n" +
                    "            }\n" +
                    "            if (System.currentTimeMillis() >= startTime + interval) {\n" +
                    "                System.out.print(\"Time: \" + interval / 1000 + \"sec | \");\n" +
                    "                for (Car car: carList) {\n" +
                    "                    car.Behavior();\n" +
                    "                    car.setInterval(car.getInterval() + car.getFrequency());\n" +
                    "                }\n" +
                    "                interval += 1000;\n" +
                    "            }\n" +
                    "\n" +
                    "            if (System.currentTimeMillis() >= startTime + minuteInterval) {\n" +
                    "                System.out.println(\"** Total cars passed: \" + totalPassedCars + \" **\");\n" +
                    "                System.out.println(\"** Total spawned cars: \" + totalSpawnedCars + \" **\");\n" +
                    "                minuteInterval += 60000;\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot create Program class");
            e.printStackTrace();
        }

        return node;
    }

    private void createGridObjectClass() {
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/GridObject.java");
            FileWriter writer = new FileWriter(file);
            writer.write("\n" +
                    "package Simulation;\n" +
                    "public class GridObject {\n" +
                    "    public GridObject(int X, int Y) {\n" +
                    "        setX(X);\n" +
                    "        setY(Y);\n" +
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
            writer.write("package Simulation; \n" +
                    "public class Grid extends GridObject{\n" +
                    "    public Grid(int x, int y) {\n" +
                    "        super(x,y);\n" +
                    "        arr = new GridObject[this.getX()][this.getY()];\n" +
                    "    }\n" +
                    "\n" +
                    "    public GridObject[][] arr;\n" +
                    "\n" +
                    "    public void add(GridObject gridObject) {\n" +
                    "        System.out.println(gridObject.getX() + \"x\" + gridObject.getY() + \" \" + gridObject);\n" +
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
            writer.write("package Simulation;\n" +
                    "public class Car{\n" +
                    "    public Car(double x, double y, double speed, String direction, int carNumber) {\n" +
                    "        setX(x);\n" +
                    "        setY(y);\n" +
                    "        setSpeed(speed);\n" +
                    "        setDirection(direction);\n" +
                    "        setCarNumber(carNumber);\n" +
                    "    }\n" +
                    "\n" +
                    "    public int getCarNumber() {\n" +
                    "        return carNumber;\n" +
                    "    }\n" +
                    "\n" +
                    "    public void setCarNumber(int carNumber) {\n" +
                    "        this.carNumber = carNumber;\n" +
                    "    }\n" +
                    "\n" +
                    "    private int carNumber;\n" +
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
                    "            case \"East\" -> setX(getX() + ms );\n" +
                    "            case \"West\" -> setX(getX() - ms);\n" +
                    "            case \"North\" -> setY(getY() - ms);\n" +
                    "            case \"South\" -> setY(getY() + ms);\n" +
                    "        }\n" +
                    "        System.out.println(\"Car \" + carNumber + \" pos:\" + getX() + \"x\" + getY());\n" +
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
            writer.write("package Simulation; \n" +
                    "public class CarSpawner extends GridObject{\n" +
                    "    public static int carNumber = 0;\n" +
                    "\n" +
                    "    public CarSpawner(int x, int y, String direction, long frequency) {\n" +
                    "        super(x, y);\n" +
                    "        setDirection(direction);\n" +
                    "        setFrequency(frequency * 1000);\n" +
                    "        setInterval(getFrequency());\n" +
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
                    "        return new Car(getX(), getY(), 50, getDirection(), carNumber); // Spawn car with 50km/h\n" +
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
            writer.write("package Simulation; \n" +
                    "public class TrafficLight extends GridObject{\n" +
                    "\n" +
                    "    public static int lightCount = 0;\n" +
                    "    public TrafficLight(int X, int Y, long frequency) {\n" +
                    "        super(X, Y);\n" +
                    "        lightCount += 1;\n" +
                    "        setFrequency(frequency * 1000);\n" +
                    "        setInterval(interval += getFrequency());\n" +
                    "        isGreenNorth = true;\n" +
                    "    }\n" +
                    "\n" +
                    "    private long carsPassed = 0;\n" +
                    "\n" +
                    "    public void carPassed() {\n" +
                    "        carsPassed++;\n" +
                    "        System.out.println(\"Light \" + lightCount + \" has \" + carsPassed + \" cars passed\");\n" +
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
                    "            System.out.println(\"TrafficLight \" + lightCount + \" is green East/West\");\n" +
                    "            isGreenNorth = false;\n" +
                    "        } else {\n" +
                    "            System.out.println(\"TrafficLight \" + lightCount + \" is green North/South\");\n" +
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
                        + node.constructor.frequency + ");");
                addCode("grid.add(" + node.ID + ");");
                break;
            case GraphNode.GRIDTYPE:
                addCode("grid = new Grid(" + node.constructor.x + ", " + node.constructor.y + ");");
                break;
            case GraphNode.TRAFFICLIGHTTYPE:
                addCode("TrafficLight " + node.ID + " = new TrafficLight("
                        + node.constructor.x + ", "
                        + node.constructor.y + ", " + node.constructor.frequency + ");");
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
    public GraphNode visit(PrintNode node) {
        addCode("System.out.println(" + node.string + ");");
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
