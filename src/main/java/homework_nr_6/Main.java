package homework_nr_6;

public class Main {
    public static void main(String[] args) {
        // Employee
        Employee employee = new Employee("Evghenii Salamandic", 24, "IT");

        // Invoice
        Invoice invoice = new Invoice("Lenovo IdeaPad Gaming", "Laptop", 2, 17000.0);

        // Date
        Date date = new Date(5, 4, 1999);

        System.out.println("Employee:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Department: " + employee.getDepartment());

        System.out.println("\nInvoice:");
        System.out.println("Model: " + invoice.getModel());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price: " + invoice.getPrice());
        System.out.println("Amount: " + invoice.getAmount());

        System.out.println("\nDate:");
        date.displayDate();
    }
}
