package javaadditional.enumm;

import java.util.Scanner;

public class PrintData <T> {
    PrintData(T data){
        System.out.println(data);
    }
}
class Main3{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int input1 = sr.nextInt();
        PrintData<Integer> data = new PrintData<>(input1);
        sr.close();
    }
}
