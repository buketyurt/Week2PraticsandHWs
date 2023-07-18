package org.example.Employee;

public class Employee {
    String name;
    int salary;
    double workHours;
    int hireYear;

    public Employee(String name ,int salary,double workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double Tax(){
        if(salary >1000){
            return 1000*0.03;
        }
        return 0;
    }
    public double Bonus(){
        if(workHours>40){
            return (workHours -40)*30;
        }
        return 0;
    }
    public double raiseSalary(){
        int workingHour;
        int currentYear = 2021 - hireYear;
        if(currentYear<10){
            return salary*0.05;
        } else if (20>currentYear && currentYear>9) {
            return salary*0.10;
        } else {
            return salary*0.15;
        }
    }
    public String toString(){
        double taxPlusBonus = this.Tax() + this.Bonus();
        double overallSalary = this.Tax() + this.Bonus()+ this.salary;
        String ehe = "Adı : "+ this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saati : " + this.workHours + "\nBaşlangıç Yılı :" + this.hireYear +"\nVergi : "+ this.Tax() + "\nBonus : " + this.Bonus() + "\nMaaşArtışı : " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : "+ taxPlusBonus + "\nToplam Maaş : "+ overallSalary;
        System.out.println(ehe);
        return ehe;
    }

}
