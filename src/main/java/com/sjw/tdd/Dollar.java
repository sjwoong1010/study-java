package com.sjw.tdd;

public class Dollar {
    public int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int number){
        amount = amount * number;
        return new Dollar(this.amount * number);
    }
}
