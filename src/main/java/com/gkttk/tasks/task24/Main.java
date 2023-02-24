package com.gkttk.tasks.task24;

import java.util.Map;

import com.gkttk.tasks.task24.model.Payment;
import com.gkttk.tasks.task24.model.Product;
import com.gkttk.tasks.task24.model.Store;
import com.gkttk.tasks.task24.model.Warehouse;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.setPaymentMade(true);
        payment.setAmount(100);

        Product product = new Product();
        product.setId(1001);
        product.setAvailableForSale(true);
        product.setPrice(50);

        Product product2 = new Product();
        product2.setId(2001);
        product2.setAvailableForSale(false);
        product2.setPrice(80);

        Store store = new Store(Map.of(1001L, product, 2001L, product2));

        Product product3 = new Product();
        product3.setId(3001);
        product3.setAvailableForSale(true);
        product3.setPrice(120);

        Product product4 = new Product();
        product4.setId(4001);
        product4.setAvailableForSale(false);
        product4.setPrice(120);

        Warehouse warehouse = new Warehouse(Map.of(3001L, product3, 4001L, product4));

        Product product5 = new Product();
        product5.setId(6001);
        product5.setAvailableForSale(true);
        product5.setPrice(90);

        ProductService service = new ProductService(payment, store, warehouse);
        service.purchase(product5);

    }

}
