package org.example.PatikaStore;

class Phone extends Product {
    int storageGB;
    double screenSize;
    int cameraMP;
    double batteryPower;
    int ramGB;
    String color;

    public Phone(int id, double unitPrice, double discountRate, int stockAmount, String name, String brand,
                 int storageGB, double screenSize, int cameraMP, double batteryPower, int ramGB, String color) {
        super(id, unitPrice, discountRate, stockAmount, name, brand);
        this.storageGB = storageGB;
        this.screenSize = screenSize;
        this.cameraMP = cameraMP;
        this.batteryPower = batteryPower;
        this.ramGB = ramGB;
        this.color = color;
    }

    public String getDetails() {
        return super.getDetails() + String.format(" %d GB | %.1f Inc | %d MP | %.1f | %d GB | %s |",
                storageGB, screenSize, cameraMP, batteryPower, ramGB, color);
    }
}
