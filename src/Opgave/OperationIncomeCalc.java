package Opgave;

public class OperationIncomeCalc implements IStrategy {
    // her er num1: produktions omkostninger num2: salgspris
    @Override
    public double doOperation(double num1, double num2) {
        return num2-num1;
    }
}
