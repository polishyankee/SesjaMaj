package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Clients {


    Deque<Client> set = new ArrayDeque<Client>();
    public Clients() {

        Client c1 = new Client("Andrzej", "Duda", 39377456, 917735826);
        Client c2 = new Client("Adrian", "Pykacz", 53573231, 917735826);
        Client c3 = new Client("Karolina", "Handerek", 37677677, 455942178);
        this.set.add(c1);
        this.set.add(c2);
        this.set.add(c3);
        }

    public void showClients() {
        this.set.forEach(client -> {
            System.out.println(client.toString());

        });
    }
}

