package calculations;

import domain.Cash;

interface CurrencyCalculator {

    Cash calculateCashDenominations(int amount);

}