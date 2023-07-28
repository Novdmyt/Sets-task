package app.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static Set<String> getData() {
        Set<String> data = new HashSet<>();
        data.add("orange");
        data.add("apple");
        data.add("kiwi");
        data.add("strawberry");
        data.add("mango");
        return data;
    }

    public static Set<String> getAddition(Set<String> addition) {
        Set<String> data = new HashSet<>();
        data.add("grape");
        addition.addAll(data);
        return addition;
    }

    public static String showList(Set<String> list) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (String name : list) {
            count++;
            result.append(count).append(") ").append(name).append(" \n");
        }
        return result.toString();
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}