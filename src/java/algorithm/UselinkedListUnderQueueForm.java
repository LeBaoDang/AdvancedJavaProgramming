package java.algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class UselinkedListUnderQueueForm {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        int input1, input2, input3;
        Scanner sr = new Scanner(System.in);
        input1 = sr.nextInt();
        input2 = sr.nextInt();
        input3 = sr.nextInt();
        numberList.add(input1);
        numberList.add(input2);
        numberList.add(input3);
        System.out.println(numberList);
        numberList.poll();
        numberList.offer(20);
        System.out.println(numberList);
        sr.close();
    }
}
