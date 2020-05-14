package com.company;

public class Clothes extends Product{
    private sizeClothes size;


    public Clothes(int id, Money price, int qty, sizeClothes size) {
        super(id, price, qty);
        this.size = size;
    }
}

enum sizeClothes {
    S,
    M,
    L,
    XL
}
