public class AlreadyDeclaredVariableException extends Exception {
    @Override
    public String getMessage() {
        return "Error: Method already declared";
    }
}
