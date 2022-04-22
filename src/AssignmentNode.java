public class AssignmentNode extends StatementNode {
    String ID;
    AST Value;

    void Assigning(String id, AST value){
        ID = id;
        Value = value;
    }
}
