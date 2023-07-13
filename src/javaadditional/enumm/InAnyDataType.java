package javaadditional.enumm;

import java.util.Scanner;

public class InAnyDataType {
    <T> void display(T  data){
         System.out.println(data);
    }
}
class Main4{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String input = sr.next();
        InAnyDataType In = new InAnyDataType();
        In.<String>display(input);
    }
}