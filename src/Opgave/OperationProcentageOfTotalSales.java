package Opgave;

public class OperationProcentageOfTotalSales implements IStrategy {
    // udregner procent for salg af product sammenligned med totale salg
    // num1: er salg af specifik product num2: totalt salg af alle producter
    @Override
    public double doOperation(double num1, double num2) {

        return (num1 / num2) * 100;
    }
}
