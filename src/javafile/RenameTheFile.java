package javafile;

import java.io.File;

public class RenameTheFile {
    public static void main(String[] args) {
        try {
            // create a file object
            File oldFile = new File("output.txt");
            // create an object that contains the new name of file
            File newFile = new File("newName.txt");
            //change the name of file
            boolean value = oldFile.renameTo(newFile);
            if(value){
                System.out.println("The name of the file is changed");
            } else {
                System.out.println("The name cannot be changed");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
