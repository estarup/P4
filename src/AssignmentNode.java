public class AssignmentNode extends StatementNode {
    String ID;
    GraphNode Value;

    void Assigning(String id, GraphNode value){
        ID = id;
        Value = value;
    }
}
