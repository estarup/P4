import javax.swing.plaf.nimbus.State;

abstract class StatementNode {}
abstract class Method extends StatementNode
{
}
abstract class If_statement extends StatementNode {}
abstract class Else_statement extends StatementNode {}
abstract class While_statement extends StatementNode {}
abstract class Create_statement extends StatementNode{}
abstract class Declaration extends StatementNode {}
abstract class Assignment extends StatementNode {}

abstract class ExpressionNode extends StatementNode
{
    private StatementNode Left;
    public StatementNode GetLeftNode() {
        return Left;
    }
    public void SetLeftNode(StatementNode node) {
        Left = node;
    }
    private StatementNode Right;
    public StatementNode GetRightNode() {
        return Right;
    }
    public void SetRightNode(StatementNode node) {
        Right = node;
    }
}
abstract class AddNode extends ExpressionNode{}
abstract class SubtractNode extends  ExpressionNode {}
abstract class MultiplyNode extends ExpressionNode {}
abstract class DivideNode extends ExpressionNode {}

abstract class NegativeNode extends StatementNode {
    private StatementNode InnerNode;
    public StatementNode GetInnerNode() {
        return InnerNode;
    }
    public void SetInnerNode(StatementNode node) {
        InnerNode = node;
    }
}
abstract class NumberNode extends StatementNode {
    private double number;
    public double GetNumber() {
        return number;
    }
    public void SetNumber(double value){
        number = value;
    }
}
