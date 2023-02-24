package com.gkttk.tasks.task24.chaincreator;

import com.gkttk.tasks.task24.model.Order;
import com.gkttk.tasks.task24.action.DoublePurchaseAction;
import com.gkttk.tasks.task24.action.PurchaseAction;
import com.gkttk.tasks.task24.action.TerminatePurchaseAction;

public class PurchaseOrderProvider {

    public PurchaseAction<Order> getPurchaseAction() {

        PurchaseAction<Order> fifthCheck = new DoublePurchaseAction(
                order -> order.getWarehouse().hasInStock(order.getProduct().getId())
                , new TerminatePurchaseAction(order -> System.out.println("Place order from warehouse"))
                , getErrorTerminateAction("Out of stock"));

        PurchaseAction<Order> forthCheck = new DoublePurchaseAction(
                order -> order.getStore().hasInStock(order.getProduct().getId())
                , order -> System.out.println("Place order from store"), fifthCheck);

        PurchaseAction<Order> thirdCheck = new DoublePurchaseAction(
                order -> order.getPayment().getAmount() >= order.getProduct().getPrice(),
                forthCheck, getErrorTerminateAction("Insufficient funds"));

        PurchaseAction<Order> secondCheck = new DoublePurchaseAction(order -> order.getPayment().isPaymentMade(),
                thirdCheck, getErrorTerminateAction("Ask for payment"));

        return new DoublePurchaseAction(order -> order.getProduct().isAvailableForSale(),
                secondCheck, getErrorTerminateAction("Product is not available"));

    }

    private PurchaseAction<Order> getErrorTerminateAction(String errorValue) {

        return new TerminatePurchaseAction(order -> order.getErrors().add(errorValue));
    }

}
