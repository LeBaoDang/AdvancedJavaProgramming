package javafile;

import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        // to store newFile of file
        char[] newFile = new char[100];
        try {
            //create a reader using the FileReader
            FileReader input = new FileReader("newFile.txt");
            //read characters
            input.read(newFile);
            //print newFile of file
            System.out.println(newFile);
            //close FileReader
            input.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
