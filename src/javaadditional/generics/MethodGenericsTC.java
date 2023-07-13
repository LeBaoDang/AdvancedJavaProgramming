package javaadditional.generics;

import java.util.Scanner;

public class MethodGenericsTC {
    public <T> void display(T data){
        System.out.println(data);
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String text = sr.nextLine();
        Double number = sr.nextDouble();
        MethodGenerics mg = new MethodGenerics();
        mg.<String> display(text);
        mg.<Double> display(number);
        sr.close();
    }
}
