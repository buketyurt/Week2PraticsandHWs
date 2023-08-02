package org.example.PatikaStore;

import java.util.*;

class Product {
    int id;
    double unitPrice;
    double discountRate;
    int stockAmount;
    String name;
    String brand;

    public Product(int id, double unitPrice, double discountRate, int stockAmount, String name, String brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
    }

    public String getDetails() {
        return String.format("| %d | %-30s | %.2f TL | %-10s |", id, name, unitPrice, brand);
    }
}

