package com.gkttk.tasks.task24;

import java.util.ArrayList;
import java.util.List;

import com.gkttk.tasks.task24.action.PurchaseAction;
import com.gkttk.tasks.task24.chaincreator.PurchaseOrderProvider;
import com.gkttk.tasks.task24.model.Order;
import com.gkttk.tasks.task24.model.Payment;
import com.gkttk.tasks.task24.model.Product;
import com.gkttk.tasks.task24.model.Store;
import com.gkttk.tasks.task24.model.Warehouse;

public class ProductService {

    private final Payment payment;
    private final Store store;
    private final Warehouse warehouse;
    private final PurchaseOrderProvider orderProvider = new PurchaseOrderProvider();

    public ProductService(Payment payment, Store store, Warehouse warehouse) {

        this.payment = payment;
        this.store = store;
        this.warehouse = warehouse;
    }

    public void purchase(Product product) {

        Order order = new Order(product, this.payment, this.store, this.warehouse, new ArrayList<>());

        PurchaseAction<Order> purchaseAction = this.orderProvider.getPurchaseAction();

        purchaseAction.doAction(order);

        List<String> errors = order.getErrors();

        if (!errors.isEmpty()) {
            throw new IllegalStateException(String.join("\n", errors));
        }

      /*  // Check if product is available for sale
        if (product.isAvailableForSale()) {
            // Check if payment has been made
            if (payment.isPaymentMade()) {
                // Check if amount paid is sufficient
                if (payment.getAmount() >= product.getPrice()) {
                    // Check if the product has stock in store
                    if (store.hasInStock(product.getId())) {
                        // Place order from store
                    } else {
                        // Check if the product has stock in warehouse
                        if (warehouse.hasInStock(product.getId())) {
                            // Place order from warehouse
                        } else {
                            // Out of stock
                        }
                    }
                } else {
                    // Insufficient funds
                }
            } else {
                // Ask for payment
            }
        } else {
            // Product is not available
        }*/
    }


}
