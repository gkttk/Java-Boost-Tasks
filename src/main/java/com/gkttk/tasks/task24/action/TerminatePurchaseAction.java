package com.gkttk.tasks.task24.action;

import java.util.function.Consumer;

import com.gkttk.tasks.task24.model.Order;

public class TerminatePurchaseAction implements PurchaseAction<Order> {

    private final Consumer<Order> action;

    public TerminatePurchaseAction(Consumer<Order> action) {

        this.action = action;
    }

    @Override
    public void doAction(Order order) {

        action.accept(order);

    }
}
