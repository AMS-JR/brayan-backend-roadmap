package org.example.functional_interfaces;

@FunctionalInterface
public interface Discount {
     double applyDiscount(double price);
     default String describe() {
         return " Applying Discount";
     }
     static double noDiscount(double price) {
         return price;
     }
}
