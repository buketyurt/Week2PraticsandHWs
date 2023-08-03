package org.example.InsuranceManagementSystem;

import java.util.Date;

abstract class Insurance {
    private String insuranceName;
    private double insuranceFee;
    private Date startDate;
    private Date endDate;

    abstract double calculate();

    // Constructor, getters, setters, and other methods
}