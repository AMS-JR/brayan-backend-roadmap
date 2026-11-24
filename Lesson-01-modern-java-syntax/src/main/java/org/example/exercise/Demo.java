package org.example.exercise;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "john.doe@example.com");
        Customer customer2 = new Customer("Jane Smith", "jane.smith@example.com");

        System.out.println(customer1);
        System.out.println(customer2);

        Money money1 = new Money(100.0, "USD");
        Money money2 = new Money(200.0, "EUR");

        System.out.println(money1);
        System.out.println(money2);
    }
}
