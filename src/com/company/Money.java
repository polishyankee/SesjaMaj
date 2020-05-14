package com.company;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents;
    }

    public Money plus(Money added){
        int euro_helper = 0;
        int cent_helper = 0;
        if ((this.cents() + added.cents()) > 100)
        {
            euro_helper = 1;
            cent_helper = (this.cents() + added.cents()) - 100;
        }
        else
            cent_helper = this.cents() + added.cents();

        return new Money(this.euros() + added.euros() + euro_helper,
                cent_helper);
    }

    public Money multiplyBy(int qty){
        Money total = new Money(this.euros, this.cents);

        for (int i = 1; i<qty; i++){
            total = total.plus(this);
        }
        return total;
    }

}
