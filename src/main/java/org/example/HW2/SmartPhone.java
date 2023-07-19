package org.example.HW2;

public class SmartPhone extends Phone{
    int storage;
    int ram;
    boolean camera;

    public SmartPhone(){ //no args constructor

    }
    public SmartPhone(int id, String name, double price, String phoneNumber, int storage, int ram, boolean camera) { //all args constructor
        super(id, name, price, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
}
