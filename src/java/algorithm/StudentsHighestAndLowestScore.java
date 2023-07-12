package java.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentsHighestAndLowestScore {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int input1 = sr.nextInt();
        int input2 = sr.nextInt();
        int input3 = sr.nextInt();
        score.add(input1);
        score.add(input2);
        score.add(input3);
        System.out.println(score);
        int min = Collections.min(score);
        int max = Collections.max(score);
        System.out.println("Điểm thấp nhất là: " + min);
        System.out.println("Điểm cao nhất là: " + max);
        sr.close();
    }
}
