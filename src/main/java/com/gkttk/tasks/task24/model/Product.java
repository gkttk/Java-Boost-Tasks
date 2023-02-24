package com.gkttk.tasks.task24.model;

public class Product {

    private long id;
    private boolean availableForSale;
    private int price;

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public boolean isAvailableForSale() {

        return availableForSale;
    }

    public void setAvailableForSale(boolean availableForSale) {

        this.availableForSale = availableForSale;
    }


    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }
}
