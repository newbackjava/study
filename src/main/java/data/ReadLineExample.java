package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("c:/TEMP/Hello.java");
            while (true){
                int data = reader.read();
                if(data == -1) break;
                System.out.println((char)data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("읽어올 때 에러발생함.");
        }
    }
}
