package java.queue;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedList<Integer> numbersList = new LinkedList<>();
        Scanner sr = new Scanner(System.in);

        numbersList.add(5);
        numbersList.add(10);
        numbersList.add(15);

        numbersList.poll();

        int number1 =  sr.nextInt();
        numbersList.offer(number1);

        System.out.println(numbersList);

        sr.close();

    }
}
