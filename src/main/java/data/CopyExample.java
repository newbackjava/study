package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) {
        String oriName = "c:/TEMP/test.jpg";
        String targetName = "c:/TEMP/test2.jpg";

        //파일입출력 --> 반드시 예외처리!
        try(
                InputStream is = new FileInputStream(oriName);
                OutputStream os = new FileOutputStream(targetName);
        ){

            //읽고 쓸때 기본은 1byte단위로 처리!
            //읽고 쓸때 byte[]을 사용해서 조금더 큰 단위로 처리가능!
            byte[] data = new byte[1024];

            while(true){
                //무한루프를 일단 돌리고
                //더이상 읽어올 것이 없을때 중단한다.
                int num = is.read(data); //입력스트림에 들어있는 1024개를 읽어와서
                //data배열에 집어넣어라. return값은 읽어온 바이트수인 1024가 됨.
                //num에 저장된 값이 -1이면 더이상 읽어올 값이 없다라는 의미임.
                if(num == -1) break; //if문은 자체 break가 있어서
                //if문 안의 break는 if를 포함하고 있는 반복문으로 중단하라는 의미!

                os.write(data, 0, num);
            }
            os.flush();
            System.out.println("복사완료!!!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
