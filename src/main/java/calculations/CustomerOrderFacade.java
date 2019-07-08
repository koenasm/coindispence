package calculations;

import domain.Cash;
import order.Order;

import javax.ejb.Stateful;

@Stateful
public class CustomerOrderFacade {

    private Order order = new Order();
    private CurrencyCalculator currencyCalculator = CalculatorFactory.createCurrencyCalculator(CurrencyType.RAND);

    public double getCashAmountDue(){
        return order.getTotalAmount();
    }

    public Cash makePayment(double amount){

        int amountDue = (int) (order.getTotalAmount() * 100);
        int amountPaid = (int) (amount * 100);
        int change = amountPaid - amountDue;

        return currencyCalculator.calculateCashDenominations(change);
    }

}