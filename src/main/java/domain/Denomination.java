package domain;

public class Denomination {
    private RandDenomination denomination;
    private int count;

    public Denomination(RandDenomination denomination,int count){
        this.denomination = denomination;
        this.count = count;
    }

    public RandDenomination getDenomination() {
        return this.denomination;
    }

    public String getDescription() {
        return this.denomination.getDescription();
    }

    public int getCount() {
        return count;
    }

}