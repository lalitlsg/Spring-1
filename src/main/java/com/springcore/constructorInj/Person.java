package com.springcore.constructorInj;

public class Person {
    private String name;
    private int personId;
    private Cert cert;

    public Person(String name, int personId, Cert cert) {
        this.name = name;
        this.personId = personId;
        this.cert = cert;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", cert=" + cert +
                '}';
    }
}
