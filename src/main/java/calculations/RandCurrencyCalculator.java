package calculations;

import domain.Cash;
import domain.Denomination;
import domain.RandDenomination;

import java.util.ArrayList;
import java.util.Collection;

public class RandCurrencyCalculator implements CurrencyCalculator {

    public Cash calculateCashDenominations(int amount) {

        Collection<Denomination> denominations = new ArrayList<Denomination>();
        int totalAmount=0;
        for( RandDenomination randDenomination: RandDenomination.values()){
            int remainder = amount % randDenomination.getCentValue();
            if (remainder < amount) {
                Denomination denomination = new Denomination(randDenomination,(amount - remainder) / randDenomination.getCentValue());
                denominations.add(denomination);
                amount = remainder;
                totalAmount+=(randDenomination.getCentValue()*denomination.getCount());
            }
        }

        return new Cash(denominations,totalAmount);
    }

}
