package javacollections.algorithm;

import java.util.HashMap;

public class AccessingAnElementOfAHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> song = new HashMap<>();
        song.put(1,"yesterday");
        song.put(2,"21 guns");
        System.out.println(song);
        String value = song.get(2);
        System.out.println(value);
    }
}
