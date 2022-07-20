package com.springcore.constructorInj;

public class Cert {
    private String name;

    public Cert(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cert{" +
                "name='" + name + '\'' +
                '}';
    }
}
