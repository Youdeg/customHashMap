package ru.dima;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> f = new HashMap<>();
        Map<String, Integer> n = new customHashMap<>();
        n.put("c", 13);
        System.out.println(n.get("c"));
        n.remove("c");
        System.out.println(n.get("c"));
        System.out.println(n.isEmpty());
    }
}
