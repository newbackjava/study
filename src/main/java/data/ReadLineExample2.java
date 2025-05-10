package data;

import java.io.*;

public class ReadLineExample2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("c:/TEMP/Hello.java");
            BufferedReader bs = new BufferedReader(reader);

            //BufferedWriter bw = new BufferedWriter(new FileWriter("c:/TEMP/Hello2.java"));
            //buffer(버퍼, 임시기억장치, 많은 양을 넣을 수 있음.)
            while (true){
                //readLine()메서드 호출 전에
                //버퍼에 넣어줌.
                String str = bs.readLine();
                if(str == null) break;
                System.out.println(str);
            }
            reader.close();
            bs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("읽어올 때 에러발생함.");
        }
    }
}
