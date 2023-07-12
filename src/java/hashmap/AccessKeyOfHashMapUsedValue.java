package java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AccessKeyOfHashMapUsedValue {
    public static void main(String[] args) {
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1,"Ryan");
        names.put(2,"Jeff");
        names.put(3,"Tim");
        String value = "Tim";
        for(Map.Entry<Integer,String> entry : names.entrySet()) {
            if (entry.getValue() == value) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
