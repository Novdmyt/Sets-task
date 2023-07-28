package app.task2;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static HashSet<String> getData(){
        HashSet<String> data = new HashSet<>();
        data.add("orange");
        data.add("apple");
        data.add("kiwi");
        data.add("strawberry");
        data.add("mango");
        return data;
    }

    public static HashSet<String> getRemove(HashSet<String> data){
        data.remove("kiwi");
        return data;
    }
    public static String showList(HashSet<String> list) {
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
