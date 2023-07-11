package javacollections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChar {
    public static void main(String[] args) {
        //Viết chương trình tạo Arraylist lưu dữ liệu ký tự
        ArrayList<Character> charList = new ArrayList<>();

        Scanner sr = new Scanner(System.in);
        char a = sr.next().charAt(0);
        char b = sr.next().charAt(0);
        char c = sr.next().charAt(0);
        char d = sr.next().charAt(0);

        charList.add(a);
        charList.add(b);
        charList.add(c);
        charList.add(d);

        for ( int i = 0; i < charList.size(); i++){
            System.out.println(charList.get(i));
        }

        sr.close();

    }
}
