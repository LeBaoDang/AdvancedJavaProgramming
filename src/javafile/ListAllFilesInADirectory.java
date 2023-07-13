package javafile;

import java.io.File;

public class ListAllFilesInADirectory {
    public static void main(String[] args) {
        try {
            // creates a file object
            File file = new File("movies");
            //returns an array of all files
            String[] fileList = file.list();
            for (String str : fileList) {
                System.out.println(str);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
