public class UndeclaredVariableException extends Exception{
    @Override
    public String getMessage() {
        return "Error: Variable has not been declared";
    }
}
