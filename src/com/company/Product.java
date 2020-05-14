package com.company;

public class Product {
    private final int id;
    private Money price;
    private int qty;

    public Product(int id, Money price, int qty) {
        this.id = id;
        this.price = price;
        this.qty = qty;
    }

    public void addStock(int howMany){
        this.qty += howMany;
    }

    public boolean removeStock(int howMany){
        if (howMany > this.qty){
            return false;
        }
        else{
            this.qty -= howMany;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Product" +
                "id=" + id ;
    }


    public Money getTotalValue(){
        return this.price.multiplyBy(this.qty);
    }

    public void updatePrice(Money newPrice){
        this.price = newPrice;
    }

    public int getQty() {
        return qty;
    }


}
