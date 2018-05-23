public class AddOperator implements IOCommand {
    @Override
    public int execute(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
