package com.gkttk.tasks.task30;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Resposibility> resposibilities1 = List.of(new Resposibility(1), new Resposibility(2));
        Address address1 = new Address("100");
        Employee employee1 = new Employee("Name1", 25, address1, resposibilities1);
        System.out.println("-----------");
        System.out.println(employee1);

        Address address2 = employee1.getAddress();
        System.out.println("Address2 - " + address2);

        List<Resposibility> responsibilities2 = employee1.getResponsibilities();
        System.out.println("Resp2 - " + responsibilities2);
        System.out.println("-----------");

        responsibilities2.get(0).setNotNumber(5);
        System.out.println(responsibilities2);

        System.out.println(employee1.getResponsibilities().get(0));


    }

}
