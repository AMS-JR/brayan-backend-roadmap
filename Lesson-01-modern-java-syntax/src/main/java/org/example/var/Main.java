package org.example.var;

public class Main {
    public static void main(String[] args) {
        var names = new String[]{"Alice", "Bob", "Charlie"};
        var num = 0;
        for (var name : names) {
            System.out.println(name);
        }
        String jsob = """
                {
                    "name": "Alice",
                    "age": 30
                }
                """;
        System.out.println(jsob);

    }
}
