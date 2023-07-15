package javaexception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        try {
            int numbers[] = {10,20,30};
            int index = sr.nextInt();
            System.out.println(numbers[index]);
        } catch (Exception e){
            System.out.println("Index is wrong");
        }

        sr.close();

    }
}
