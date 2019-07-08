package domain;

public enum RandDenomination {

    HUNDRED_RAND("R100",10000),
    FIFTY_RAND("R50",5000),
    TWENTY_RAND("R20",2000),
    TEN_RAND("R10",1000),
    FIVE_RAND("R5",500),
    TWO_RAND("R2",200),
    ONE_RAND("R1",100),
    FIFTY_CENTS("50c",50),
    TWENTY_FIVE_CENTS("25c",25),
    TEN_CENTS("10c",10),
    FIVE_CENTS("5c",5);

    private String description;
    private int centValue;

    RandDenomination(String description, int centValue){
        this.description = description;
        this.centValue = centValue;
    }

    public String getDescription() {
        return description;
    }

    public int getCentValue() {
        return centValue;
    }

}
