package org.example.lambdas;

import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare("a", "b"));

        Comparator<String> stringComparator = ( a,  b) -> {
            System.out.println("Comparing " + a + " and " + b);
          return  Integer.compare(a.length(), b.length());
        };
        System.out.println(stringComparator.compare("abc", "bx"));

        Comparator.comparingInt(String::length);
        System.out.println(stringComparator.compare("abc", "bx"));


    }
}
