package com.gkttk.tasks.task42;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "individual")
@XmlType(propOrder = {"name", "address"})
public class Individual {

    private String name;

    private Address address;

    public Individual() {

    }

    public Individual(String name, Address address) {

        this.name = name;
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    @Override
    public String toString() {

        return "Individual{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
