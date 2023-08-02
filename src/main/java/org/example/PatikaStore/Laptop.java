package org.example.PatikaStore;

class Laptop extends Product {
    int ramGB;
    int storageGB;
    double screenSize;

    public Laptop(int id, double unitPrice, double discountRate, int stockAmount, String name, String brand,
                  int ramGB, int storageGB, double screenSize) {
        super(id, unitPrice, discountRate, stockAmount, name, brand);
        this.ramGB = ramGB;
        this.storageGB = storageGB;
        this.screenSize = screenSize;
    }

    public String getDetails() {
        return super.getDetails() + String.format(" %d GB | %d GB SSD | %.1f inç |", ramGB, storageGB, screenSize);
    }
}
