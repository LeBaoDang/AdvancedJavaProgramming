package java.hashmap;

import java.util.HashMap;

public class PrintTheElementsOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1,"Jack");
        students.put(5,"Emily");
        students.put(3,"Zayn");
        for (Integer key : students.keySet()){
            System.out.println(students.get(key));
        }
    }
}
