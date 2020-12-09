package Opgave;

public class Context {
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy){
        this.iStrategy= iStrategy;
    }

    public double execureStrategy(double num1, double num2){
        return iStrategy.doOperation(num1, num2);
    }
}
