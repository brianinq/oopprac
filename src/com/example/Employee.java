package com.example;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private String name;

    public Employee(int baseSalary, int hourlyRate){
        setHourlyRate(hourlyRate);
        setBaseSalary(baseSalary);
    }

    public int wage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be less than 0");
        }
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate cannot be less than 0");
        }
        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
