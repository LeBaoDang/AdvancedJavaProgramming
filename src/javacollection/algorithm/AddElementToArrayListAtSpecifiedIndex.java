package javacollection.algorithm;

import java.util.ArrayList;

public class AddElementToArrayListAtSpecifiedIndex {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Catch me if you can");
        System.out.println(movies);
        movies.add(1,"Batman");
        System.out.println(movies);
    }
}
