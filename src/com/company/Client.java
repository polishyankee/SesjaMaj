package com.company;



public class Client {

    private int NIP, REGON;
    private String name, lastName;

    public Client(String name, String lastName, int NIP, int REGON) {
        this.name = name;
        this.lastName = lastName;
        this.NIP = NIP;
        this.REGON = REGON;
    }
    @Override
    public String toString() {
        return "Client {" +
                "NIP=" + NIP +
                ", REGON=" + REGON +
                ", name='" + name + '\'' +
                ", last name='" + lastName + '\'' +
                '}';
    }
}