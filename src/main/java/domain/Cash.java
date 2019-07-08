package domain;

import java.util.Collection;

public class Cash {

    private Collection<Denomination> denominations;
    private int totalAmount;

    public Cash(Collection<Denomination> denominations,int totalAmount){
        this.denominations = denominations;
        this.totalAmount=totalAmount/100;
    }

    public Collection<Denomination> getDenominations() {
        return denominations;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public String toString(){
        return totalAmount+"";
    }
}
