package com.gkttk.tasks.task24.model;

import java.util.Map;

public class Warehouse {

    private final Map<Long, Product> productMap;

    public Warehouse(Map<Long, Product> productMap) {

        this.productMap = productMap;
    }

    public boolean hasInStock(long id) {

        return productMap.containsKey(id);

    }

}
