package javacollection.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class AccessingAnElementOfAHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> numMap = new HashMap<>();
        numMap.put(1,"One");
        numMap.put(2,"Two");
        Scanner sr = new Scanner(System.in);
        int index = sr.nextInt();
        String value = numMap.get(index);
        System.out.println(value);
    }
}
