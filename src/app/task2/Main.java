package app.task2;

import java.util.HashSet;

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

}
