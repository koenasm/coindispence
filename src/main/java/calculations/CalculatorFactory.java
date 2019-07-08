package calculations;

public class CalculatorFactory {

    public static CurrencyCalculator createCurrencyCalculator(CurrencyType currencyType){

        switch (currencyType){
            case RAND:
                return new RandCurrencyCalculator();
            case DOLLAR:
                return null; // Return instance of the relevant curr calc
            default:
                return null;
        }
    }

}
