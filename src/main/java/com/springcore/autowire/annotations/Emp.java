package com.springcore.autowire.annotations;

import com.springcore.autowire.annotations.Address;
import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
    @Autowired
    private com.springcore.autowire.annotations.Address address;

    public com.springcore.autowire.annotations.Address getAddress() {
        return address;
    }

    public void setAddress(com.springcore.autowire.annotations.Address address) {
        this.address = address;
    }

    public Emp() {
    }

    public Emp(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
