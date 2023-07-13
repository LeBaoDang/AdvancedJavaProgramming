package javafile;

import java.io.File;

public class RemoveFile {
    public static void main(String[] args) {
        // create a file object
        File file = new File("Test.txt");
        try {
            // delete the file
            boolean value = file.delete();
            if(value){
                System.out.println("The file is deleted");
            } else {
                System.out.println("The file is not deleted");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
