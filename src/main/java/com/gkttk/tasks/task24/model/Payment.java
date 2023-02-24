package com.gkttk.tasks.task24.model;

public class Payment {



    private boolean paymentMade;
    private int amount;

    public boolean isPaymentMade() {

        return paymentMade;
    }

    public void setPaymentMade(boolean paymentMade) {

        this.paymentMade = paymentMade;
    }

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }
}
