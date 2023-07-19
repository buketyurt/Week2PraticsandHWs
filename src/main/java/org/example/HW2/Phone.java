package org.example.HW2;

public class Phone extends Product{
    String phoneNumber;

    public Phone(){

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone(int id, String name, double price, String phoneNumber){
        super(id,name,price);

        this.phoneNumber =phoneNumber;
    }
}
