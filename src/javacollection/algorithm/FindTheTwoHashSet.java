package javacollection.algorithm;

import java.util.HashSet;
import java.util.Scanner;

public class FindTheTwoHashSet {
    public static void main(String[] args) {
        HashSet<String> wildAnimal = new HashSet<>();
        Scanner sr = new Scanner(System.in);
        String input1 = sr.nextLine();
        String input2 = sr.nextLine();
        String input3 = sr.nextLine();
        wildAnimal.add(input1);
        wildAnimal.add(input2);
        wildAnimal.add(input3);
        HashSet<String> domesticAnimal = new HashSet<>();
        String input4 = sr.nextLine();
        String input5 = sr.nextLine();
        String input6 = sr.nextLine();
        domesticAnimal.add(input4);
        domesticAnimal.add(input5);
        domesticAnimal.add(input6);
        wildAnimal.retainAll(domesticAnimal);
        System.out.println(wildAnimal);
        sr.close();
    }
}
