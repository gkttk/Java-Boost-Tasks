package com.gkttk.tasks.task24.action;

import java.util.function.Predicate;

import com.gkttk.tasks.task24.model.Order;

public class DoublePurchaseAction implements PurchaseAction<Order> {

    private final Predicate<Order> predicate;
    private final PurchaseAction<Order> trueAction;
    private final PurchaseAction<Order> falseAction;

    public DoublePurchaseAction(Predicate<Order> predicate, PurchaseAction<Order> trueAction, PurchaseAction<Order> falseAction) {

        this.predicate = predicate;
        this.trueAction = trueAction;
        this.falseAction = falseAction;
    }

    @Override
    public void doAction(Order order) {

        if (predicate.test(order)) {
            trueAction.doAction(order);
        } else {
            falseAction.doAction(order);
        }


    }
}
