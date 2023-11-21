package com.example;

public class Main {
    public static void main(String[] args) {
        TextBox textBox1 = new TextBox();
        textBox1.setText("Hello World");
        System.out.println(textBox1.text);
        textBox1.clear();

        var employee = new Employee(50_000, 200);
        employee.setName("Guido");
        System.out.println(employee.wage(42));
        employee.getBaseSalary();
        employee.getHourlyRate();
    }
}