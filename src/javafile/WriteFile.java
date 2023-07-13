package javafile;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        //Có hai điều cần nhớ khi ghi file:
        //Nếu ghi nội dung vào file không tồn tại, một file mới sẽ được tạo.
        //Nếu file đã tồn tại, nội dung cũ của file sẽ bị xóa và nội dung mới sẽ được thêm vào file.
        String data = "I am learning Java. And I am loving it.";
        try {
            // create a Writer using FileWrite
            FileWriter output = new FileWriter("newFile.txt");
            // Write String to the file
            output.write(data);
            System.out.println("Data is written to the file");
            // close FileWrite
            output.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
