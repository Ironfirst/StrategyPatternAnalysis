package Opgave;

public class Main {

    public static void main(String[] args) {
	    Context context = new Context(new OperationAverageStatestic());
        System.out.println("Gennemsnits værdi af 10 salg for total solgt 2500 = " + context.execureStrategy(10,2500));

        context = new Context(new OperationProcentageOfTotalSales());
        // første input: salg af valgte product, andet: totale salg
        System.out.println("Salgsprocent af totale salg for valgt product = " + context.execureStrategy(17,1250));

        context = new Context(new OperationIncomeCalc());
        // første input: produktions omkostninger, andet: salgspris
        System.out.println("indtægten på valgt product er= " + context.execureStrategy(1000,1400));

    }
}
