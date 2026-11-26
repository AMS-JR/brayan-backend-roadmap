package org.example.functional_interfaces;

import java.util.Random;
import java.util.function.*;

public class Demo implements Runnable {
    public static void main(String[] args) {
        Discount discount = price -> price * 0.9;
        System.out.println(discount.describe());
        System.out.println(discount.applyDiscount(100.0));
        System.out.println(Discount.noDiscount(300));

        Runnable runnable = new Demo();
        runnable.run();

        BiPredicate<String, Integer> lengthOf = (word, number) -> word.length() > number;
        System.out.println(lengthOf.test("Brayan",9));

        Function<String, Integer> stringToInteger = Integer::valueOf;
        System.out.println(stringToInteger.apply("1234"));

        Consumer<String> stringConsumer = (s) -> System.out.println(s.toUpperCase());

        Random random = new Random();
        Supplier<Integer> stringSupplier = () -> random.nextInt(100);
        System.out.println(stringSupplier.get());

        Predicate<String> isLongerThan5 = (s) -> s.length() > 5;
        Predicate<String> isShorterThan10 = (s) -> s.length() < 10;
        Predicate<String> startsWithA = (s) -> s.startsWith("A");
        System.out.println(isLongerThan5.and(isShorterThan10).and(startsWithA).test("Applee"));

        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("hello world"));
    }

    @Override
    public void run() {
        System.out.println("Running in a separate thread");
    }
}
