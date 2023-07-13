package javafile;

import java.io.FileWriter;

public class WriteContentToAnExistingFile {
    public static void main(String[] args) {
        String data = "I love java. files are easy.";
        try {
            // create a writer using FileWrite
            FileWriter output = new FileWriter("newFile.txt");
            // write string to the file
            output.write(data);
            System.out.println("Data is written to the file");
            // close fileWrite
            output.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
