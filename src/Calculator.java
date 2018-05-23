/*Calculator*/
public class Calculator {
    private IOCommand operator;

    public Calculator(IOCommand operator) {
        this.operator = operator;
    }

    public int execute(int firstOperand, int secondOperand) {
        return operator.execute(firstOperand, secondOperand);
    }
}
