package org.example.Switch;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        var status = Status.TODO;
        switch (status) {
            case TODO -> System.out.println("Task is new");
            case IN_PROGRESS -> System.out.println("Task is in progress");
            case COMPLETED -> System.out.println("Task is completed");
        }
    }
}
