package javacollections.hashmap;

import java.util.HashMap;

public class ChangeElementOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> numMap = new HashMap<>();
        numMap.put(1,"One");
        numMap.put(2,"Two");
        System.out.println(numMap);
        numMap.replace(1,"100");
        System.out.println(numMap);
    }
}
