package javaadditional.lambda;

import java.util.Scanner;

public interface MultiplyNumbers {
    void multiply(int x, int y);
}
class Main1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int x = sr.nextInt();
        int y = sr.nextInt();
        MultiplyNumbers obj = (a,b) -> {
            System.out.println(x-y);
        };
        obj.multiply(x,y);
    }
}
