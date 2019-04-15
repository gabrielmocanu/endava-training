package com.endava.java.demo.model;

public class Card {
    String owner;
    Integer id;
    double amount;

    @Override
    public String toString() {
        return "Card{" +
                "owner='" + owner + '\'' +
                ", id=" + id +
                ", amount=" + amount +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Card(String owner, Integer id, double amount) {
        this.owner = owner;
        this.id = id;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
