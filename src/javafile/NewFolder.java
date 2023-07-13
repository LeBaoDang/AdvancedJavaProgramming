package javafile;

import java.io.File;

public class NewFolder {
    public static void main(String[] args) {
        // create object of file
        File file = new File("movies");
        // try to create a new directory
        boolean value = file.mkdir();
        if(value){
            System.out.println("The new directory is created");
        } else {
            System.out.println("The directory already exists.");
        }
    }
}
