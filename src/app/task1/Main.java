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

    public static Set<String> getAddition(Set<String> addition){
        Set<String> data = new HashSet<>();
        data.add("grape");
        addition.addAll(data);
        return addition;
    }


}