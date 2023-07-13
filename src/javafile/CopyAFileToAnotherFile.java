package javafile;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyAFileToAnotherFile {
    public static void main(String[] args) {
        /* Để sao chép nội dung của file này sang file khác:
        chúng ta đọc nội dung của file cần sao chép
        sau đó ghi nội dung của file vào file khác */

        char[] contents = new char[1000];
        try {
            FileReader copy = new FileReader("newFile.txt");
            copy.read(contents);
            FileWriter paste = new FileWriter("output.txt");
            //writes all data to newFile
            paste.write(contents);
            // close
            copy.close();
            paste.close();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
