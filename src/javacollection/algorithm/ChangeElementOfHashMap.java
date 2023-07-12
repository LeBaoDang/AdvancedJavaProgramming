package javacollection.algorithm;

import java.util.HashMap;

public class ChangeElementOfHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> name = new HashMap<>();
        name.put("Jimmy",1);
        name.put("Chandler", 2);
        System.out.println(name);
        name.replace("Jimmy",100);
        System.out.println(name);
    }
}
