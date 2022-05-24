import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CodeGeneratorVisitor extends ASTVisitor<GraphNode>{

    String code = "";
    String declaration = "";

    public void addCode(String c){
        if (isDeclaringMethod) {
            declaration = declaration + c;
        } else {
            code = code + c;
        }
    }
    public boolean isDeclaringMethod = false;


    @Override
    public GraphNode visit(AddNode node) {
        return node;
    }

    @Override
    public GraphNode visit(AssignmentNode node) {
        addCode(node.ID);
        addCode(" = ");
        if (node.value instanceof BinaryOperatorNode b) {
            visit(b);
        } else if (node.value instanceof SimpleExpressionNode s){
            visit(s);
        } else if (node.value instanceof StringNode s) {
            visit(s);
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
                } else if (n instanceof MethodCallNode) {
                    visit((MethodCallNode) n);
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
                    "\n" +
                    "public class Program {\n" +
                    "    int totalSpawnedCars = 0;\n" +
                    "    int totalPassedCars = 0;\n" +
                    "    long interval = 1000;\n" +
                    "    long minuteInterval = 60000;\n" +
                    "    boolean isFirstCar = true;\n" +
                    "    long startTime = System.currentTimeMillis();\n" +
                    "    ArrayList<Car> carList = new ArrayList<>();\n" +
                    "    ArrayList<TrafficLight> trafficLights = new ArrayList<>();\n" +
                    "    ArrayList<CarSpawner> carSpawners = new ArrayList<>();\n" + declaration + "\n" +
                    "    public void Run() {\n" + code + "\n" +
                    "        while(true) {\n" +
                    "            for (CarSpawner spawner: carSpawners) {\n" +
                    "                if (isFirstCar) {\n" +
                    "                    carList.add(spawner.SpawnCar());\n" +
                    "                    isFirstCar = false;\n" +
                    "                    totalSpawnedCars = 1;\n" +
                    "                } else if (System.currentTimeMillis() >= startTime + spawner.getInterval()) {\n" +
                    "                    carList.add(spawner.SpawnCar());\n" +
                    "                    spawner.setInterval(spawner.getInterval() + spawner.getFrequency());\n" +
                    "                    totalSpawnedCars += 1;\n" +
                    "                }\n" +
                    "            }\n" +
                    "            for (TrafficLight light: trafficLights) {\n" +
                    "                for (Car car: carList) {\n" +
                    "                    switch (car.getDirection()) {\n" +
                    "                        case \"East\" -> {\n" +
                    "                            if (car.getX() >= light.getX() - 0.05 && car.getX() <= light.getX() && car.getY() == light.getY()) {\n" +
                    "                                if (!car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = true;\n" +
                    "                                    light.carPassed();\n" +
                    "                                    totalPassedCars += 1;\n" +
                    "                                }\n" +
                    "                                if (!light.isGreenEast) {\n" +
                    "                                    car.isDriving = false;\n" +
                    "                                } else {\n" +
                    "                                    car.isDriving = true;\n" +
                    "                                }\n" +
                    "                            }\n" +
                    "                            if (car.getX() > light.getY() && car.hasPassedLight) {\n" +
                    "                                car.hasPassedLight = false;\n" +
                    "                                car.isDriving = true;\n" +
                    "                            }\n" +
                    "                        }\n" +
                    "                        case \"West\" -> {\n" +
                    "                            if (car.getX() <= light.getX() + 0.05 && car.getX() >= light.getX() && car.getY() == light.getY()) {\n" +
                    "                                if (!car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = true;\n" +
                    "                                    light.carPassed();\n" +
                    "                                    totalPassedCars += 1;\n" +
                    "                                }\n" +
                    "                                if (!light.isGreenEast) {\n" +
                    "                                    car.isDriving = false;\n" +
                    "                                } else {\n" +
                    "                                    car.isDriving = true;\n" +
                    "                                }\n" +
                    "                            }\n" +
                    "                            if (car.getX() < light.getY() && car.hasPassedLight) {\n" +
                    "                                car.hasPassedLight = false;\n" +
                    "                                car.isDriving = true;\n" +
                    "                            }\n" +
                    "                        }\n" +
                    "                        case \"North\" -> {\n" +
                    "                            if (car.getY() <= light.getY() + 0.05 && car.getY() >= light.getY() && car.getX() == light.getX()) {\n" +
                    "                                if (!car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = true;\n" +
                    "                                    light.carPassed();\n" +
                    "                                    totalPassedCars += 1;\n" +
                    "                                }\n" +
                    "                                if (!light.isGreenNorth) {\n" +
                    "                                    car.isDriving = false;\n" +
                    "                                } else {\n" +
                    "                                    car.isDriving = true;\n" +
                    "                                }\n" +
                    "                            }\n" +
                    "                            if (car.getY() < light.getY() && car.hasPassedLight) {\n" +
                    "                                car.hasPassedLight = false;\n" +
                    "                                car.isDriving = true;\n" +
                    "                            }\n" +
                    "                        }\n" +
                    "                        case \"South\" -> {\n" +
                    "                            if (car.getY() >= light.getY() - 0.05 && car.getY() <= light.getY() && car.getX() == light.getX()) {\n" +
                    "                                if (!car.hasPassedLight) {\n" +
                    "                                    car.hasPassedLight = true;\n" +
                    "                                    light.carPassed();\n" +
                    "                                    totalPassedCars += 1;\n" +
                    "                                }\n" +
                    "                                if (!light.isGreenNorth) {\n" +
                    "                                    car.isDriving = false;\n" +
                    "                                } else {\n" +
                    "                                    car.isDriving = true;\n" +
                    "                                }\n" +
                    "                            }\n" +
                    "                            if (car.getY() > light.getY() && car.hasPassedLight) {\n" +
                    "                                car.hasPassedLight = false;\n" +
                    "                                car.isDriving = true;\n" +
                    "                            }\n" +
                    "                        }\n" +
                    "                        default -> System.out.println(\"Error: Car direction mismatch\");\n" +
                    "                    }\n" +
                    "                }\n" +
                    "            }\n" +
                    "            if (System.currentTimeMillis() >= startTime + interval) {\n" +
                    "                System.out.print(\"Time: \" + interval / 1000 + \"sec | \");\n" +
                    "                for (Car car: carList) {\n" +
                    "                    if (car.isDriving) {\n" +
                    "                        car.Drive();\n" +
                    "                    } else {\n" +
                    "                        car.Stop();\n" +
                    "                    }\n" +
                    "                    car.Info();\n" +
                    "                }\n" +
                    "                for (TrafficLight light: trafficLights) {\n" +
                    "                    if (System.currentTimeMillis() >= startTime + light.getInterval()){\n" +
                    "                        light.SwitchLights();\n" +
                    "                        light.setInterval(light.getInterval() + light.getFrequency());\n" +
                    "                    }\n" +
                    "                }\n" +
                    "                interval += 1000;\n" +
                    "            }\n" +
                    "            if (System.currentTimeMillis() >= startTime + minuteInterval) {\n" +
                    "                System.out.println();\n" +
                    "                System.out.println(\"** Total cars passed: \" + totalPassedCars + \" **\" );\n" +
                    "                System.out.println(\"** Total spawned cars: \" + totalSpawnedCars + \" **\");\n" +
                    "                System.out.println();\n" +
                    "                minuteInterval += 30000;\n" +
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

    public void createCarClass() {
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/Car.java");
            FileWriter writer = new FileWriter(file);
            writer.write("package Simulation;\n" +
                    "public class Car extends PositionedObject{\n" +
                    "    public Car(double x, double y, double speed, String direction, int carNumber) {\n" +
                    "        super(x,y);\n" +
                    "        setSpeed(speed);\n" +
                    "        setDirection(direction);\n" +
                    "        setCarNumber(carNumber);\n" +
                    "        isDriving = true;\n" +
                    "    }\n" +
                    "\n" +
                    "    public boolean isDriving = true;\n" +
                    "\n" +
                    "    private void MoveCar() {\n" +
                    "        double meterPerSec = getSpeed() / 3600; // 50km/h to m/s\n" +
                    "        switch (getDirection()) {\n" +
                    "            case \"East\" -> setX(getX() + meterPerSec );\n" +
                    "            case \"West\" -> setX(getX() - meterPerSec);\n" +
                    "            case \"North\" -> setY(getY() - meterPerSec);\n" +
                    "            case \"South\" -> setY(getY() + meterPerSec);\n" +
                    "        }\n" +
                    "    }\n" +
                    "    public void Stop() {\n" +
                    "        if (getSpeed() > 0) {\n" +
                    "            setSpeed(getSpeed() -8);\n" +
                    "        } else {\n" +
                    "            setSpeed(0);\n" +
                    "        }\n" +
                    "        if (getSpeed() < 0) {\n" +
                    "            setSpeed(0);\n" +
                    "        }\n" +
                    "        MoveCar();\n" +
                    "    }\n" +
                    "\n" +
                    "    public void Drive() {\n" +
                    "        if (getSpeed() < 50) {\n" +
                    "            setSpeed(getSpeed() + 7.5);\n" +
                    "        }\n" +
                    "        if (getSpeed() > 50) {\n" +
                    "            setSpeed(50);\n" +
                    "        }\n" +
                    "        MoveCar();\n" +
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
                    "    private double speed;\n" +
                    "\n" +
                    "    public void setSpeed(double speed) {\n" +
                    "        if (this.speed > 50) {\n" +
                    "            this.speed = 50;\n" +
                    "        }\n" +
                    "        if (this.speed < 0) {\n" +
                    "            this.speed = 0;\n" +
                    "        }\n" +
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
                    "    public void Info() { // run every second\n" +
                    "        System.out.println(\"Car \" + carNumber + \" | Position: \" + getX() + \"x\" + getY() + \" | Speed: \" + getSpeed() + \" | \" + \" Direction : \" + getDirection() + \" | \" + \" IsDriving: \" + isDriving);\n" +
                    "    }\n" +
                    "}\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot create Car class.");
            e.printStackTrace();
        }
    }

    public void createPositionedObjectClass() {
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/PositionedObject.java");
            FileWriter writer = new FileWriter(file);
            writer.write("package Simulation; \n" +
                    "public abstract class PositionedObject {\n" +
                    "    public PositionedObject (double x, double y) {\n" +
                    "        setX(x);\n" +
                    "        setY(y);\n" +
                    "    }\n" +
                    "\n" +
                    "    public double getX() {\n" +
                    "        return x;\n" +
                    "    }\n" +
                    "\n" +
                    "    public void setX(double x) {\n" +
                    "        this.x = x;\n" +
                    "    }\n" +
                    "\n" +
                    "    private double x;\n" +
                    "\n" +
                    "    public double getY() {\n" +
                    "        return y;\n" +
                    "    }\n" +
                    "\n" +
                    "    public void setY(double y) {\n" +
                    "        this.y = y;\n" +
                    "    }\n" +
                    "\n" +
                    "    private double y;\n" +
                    "}\n");
            writer.close();
                } catch (IOException e) {
            System.out.println("Error: Cannot create PositionedObject class.");
            e.printStackTrace();        }
    }

    public void createCarSpawnerClass() {
        try {
            File file = new File("/Users/emil/IdeaProjects/P4/Simulation/CarSpawner.java");
            FileWriter writer = new FileWriter(file);
            writer.write("package Simulation;\n" +
                    "public class CarSpawner extends PositionedObject{\n" +
                    "    public static int carNumber = 0;\n" +
                    "\n" +
                    "    public CarSpawner(double x, double y, String direction, long frequency) {\n" +
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
                    "        carNumber++;\n" +
                    "        return new Car(getX(), getY(), 0, getDirection(), carNumber); // Spawn car with 50km/h\n" +
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
                    "public class TrafficLight extends PositionedObject{\n" +
                    "\n" +
                    "    public static int lightCount = 0;\n" +
                    "    public TrafficLight(double x, double y, long frequency) {\n" +
                    "        super(x,y);\n" +
                    "        lightNumber = (lightCount += 1);\n" +
                    "        setFrequency(frequency * 1000);\n" +
                    "        setInterval(interval += getFrequency());\n" +
                    "        isGreenNorth = true;\n" +
                    "        isGreenEast = false;\n" +
                    "    }\n" +
                    "\n" +
                    "    private long carsPassed = 0;\n" +
                    "    private int lightNumber;\n" +
                    "\n" +
                    "    public void carPassed() {\n" +
                    "        carsPassed++;\n" +
                    "    }\n" +
                    "    public long getCarsPassed() {\n" +
                    "        return this.carsPassed;\n" +
                    "    }\n" +
                    "\n" +
                    "    public boolean isGreenNorth;\n" +
                    "    public boolean isGreenEast;\n" +
                    "\n" +
                    "    private long interval;\n" +
                    "    private long frequency = 5000; // every 5 seconds\n" +
                    "\n" +
                    "    public void setFrequency(long frequency) {\n" +
                    "        this.frequency = frequency;\n" +
                    "    }\n" +
                    "\n" +
                    "    public long getInterval() {\n" +
                    "        return this.interval;\n" +
                    "    }\n" +
                    "    public void setInterval(long Interval){\n" +
                    "        this.interval = Interval;\n" +
                    "    }\n" +
                    "\n" +
                    "    public long getFrequency() {\n" +
                    "        return this.frequency;\n" +
                    "    }\n" +
                    "    public void SwitchLights() {\n" +
                    "        if (isGreenNorth) {\n" +
                    "            System.out.println(\" ** TrafficLight \" + lightNumber + \" is green East/West | \");\n" +
                    "            isGreenNorth = false;\n" +
                    "        } else {\n" +
                    "            System.out.println(\" ** TrafficLight \" + lightNumber + \" is green North/South | \");\n" +
                    "            isGreenNorth = true;\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot create TrafficLight class.");
            e.printStackTrace();
        }

    }



    @Override
    public GraphNode visit(CreateNode node) {
        createPositionedObjectClass();
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
                addCode("carSpawners.add(" + node.ID + ");");
                break;
            case GraphNode.TRAFFICLIGHTTYPE:
                addCode("TrafficLight " + node.ID + " = new TrafficLight("
                        + node.constructor.x + ", "
                        + node.constructor.y + ", " + node.constructor.frequency + ");");
                addCode("trafficLights.add(" + node.ID + ");");
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
        } else if (node.type == GraphNode.STRING) {
            addCode("String ");
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
        addCode(node.ID);
        addCode("(");
        if (node.parameter != null){
            addCode(node.parameter);
        }
        addCode(");");
        return node;
    }

    @Override
    public GraphNode visit(MethodInitNode node) {
        isDeclaringMethod = true;
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
        isDeclaringMethod = false;
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
        addCode(node.string);
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
