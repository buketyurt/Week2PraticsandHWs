package org.example.HW2;

public class PhoneApp {
    public static void main(String[] args) {
        SmartPhone smartPhone0 = new SmartPhone(1,"Samsung",500,"05435876564",52,6,true);
        SmartPhone smartPhone1 = new SmartPhone(2,"Apple",900,"01238124671",126,6,true);
        SmartPhone smartPhone2 = new SmartPhone(3,"Huawei",200,"03412746278",256,6,true);
        SmartPhone smartPhone3 = new SmartPhone(4,"Xiaomi",400,"0234346723",512,6,true);
        SmartPhone smartPhone4 = new SmartPhone(6,"Vestel",100,"0237623478",520,6,true);

        SmartPhone[] smartPhoneArray = {smartPhone0,smartPhone1,smartPhone2,smartPhone3,smartPhone4};

        double totalPrice = calculateTotalPrice(smartPhoneArray);
        System.out.println("Total price of all smartphones: $" + totalPrice);
    }



    static Double calculateTotalPrice(SmartPhone[] smartPhoneArray){
        double totalPrice = 0;
        for (int i = 0;i<smartPhoneArray.length;i++){
           totalPrice += smartPhoneArray[i].price;
        }
        return totalPrice;
    }
}
