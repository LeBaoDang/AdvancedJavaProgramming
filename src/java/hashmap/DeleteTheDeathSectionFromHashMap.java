package java.hashmap;

import java.util.HashMap;

public class DeleteTheDeathSectionFromHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> name = new HashMap<>();
        name.put("Patrick",1);
        name.put("SpongeBob",2);
        System.out.println(name);
        name.remove("Patrick");
        System.out.println(name);
    }
}
