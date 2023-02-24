package com.gkttk.tasks.task24.model;

import java.util.List;

public class Order {

    private Product product;
    private Payment payment;
    private Store store;
    private Warehouse warehouse;
    private List<String> errors;

    public Order(Product product, Payment payment, Store store, Warehouse warehouse, List<String> errors) {

        this.product = product;
        this.payment = payment;
        this.store = store;
        this.warehouse = warehouse;
        this.errors = errors;
    }

    public Product getProduct() {

        return product;
    }

    public void setProduct(Product product) {

        this.product = product;
    }

    public Payment getPayment() {

        return payment;
    }

    public void setPayment(Payment payment) {

        this.payment = payment;
    }

    public Store getStore() {

        return store;
    }

    public void setStore(Store store) {

        this.store = store;
    }

    public Warehouse getWarehouse() {

        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {

        this.warehouse = warehouse;
    }

    public List<String> getErrors() {

        return errors;
    }

    public void setErrors(List<String> errors) {

        this.errors = errors;
    }
}
