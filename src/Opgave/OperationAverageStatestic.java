package Opgave;

public class OperationAverageStatestic implements IStrategy {

    @Override
    // gennemsnits værdi udregnings metode
    // num1 er mængde inputs og num2 er den samlede værdi for de inputs
    public double doOperation(double num1, double num2) {
        return  num2/num1;
    }
}
