abstract class StatementNode {}
abstract class Method extends StatementNode{}
abstract class If_statement extends StatementNode {}
abstract class Else_statement extends StatementNode {}
abstract class While_statement extends StatementNode {}
abstract class Create_statement extends StatementNode{}
abstract class Declaration extends StatementNode {}
abstract class Assignment extends StatementNode {}

abstract class ExpressionNode extends StatementNode {}
abstract class AddNode extends ExpressionNode{}
abstract class SubtractNode extends  ExpressionNode {}
abstract class MultiplyNode extends ExpressionNode {}
abstract class DivideNode extends ExpressionNode {}

