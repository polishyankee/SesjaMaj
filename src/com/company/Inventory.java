package com.company;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<Integer,Product> stock;

    public Inventory() {
        this.stock = new HashMap<>();
    }

    public boolean addProduct(int id, Money price, int qty){
        if (this.stock.containsKey(id)){
            return false;
        } else {
            this.stock.put(id, new Product(id, price, qty));
            return true;
        }
    }

    public boolean addClothes(int id, Money price, int qty, sizeClothes sizeClothes, String manufacturer){
        if (this.stock.containsKey(id)){
            return false;
        } else {
            this.stock.put(id, new Clothes(id, price, qty, sizeClothes));
            return true;
        }
    }

    public boolean addStock(int id, int howMany){
        if (this.stock.containsKey(id)) {
            this.stock.get(id).addStock(howMany);
            return true;
        } else {
            return false;
        }

    }

    public boolean reduceStock(int id, int howMany){
        if (this.stock.containsKey(id)) {
            return this.stock.get(id).removeStock(howMany);
        }
        return false;

    }

    public boolean removeProduct(int id){
        if (this.stock.containsKey(id)) {
            this.stock.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public void printTotalValueProduct(int id){
        if (!this.stock.containsKey(id)){
            System.out.println("No product found.");
        }
        else {
            System.out.println("Product id: " + id +
                    " Available: " + this.stock.get(id).getQty() +
                    " Total value: " + this.stock.get(id).getTotalValue());
        }
    }

    public void printTotalValueStocks(){
        Money total = new Money(0, 0);

        for (Product aProduct: this.stock.values()){
            total = total.plus(aProduct.getTotalValue());
        }

        System.out.println("Total value of all stocks: " + total);
    }
}

