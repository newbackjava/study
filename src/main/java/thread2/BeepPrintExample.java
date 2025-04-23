package thread2;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기

        for (int i = 0; i < 5; i++) {
            toolkit.beep();                            // 비프음 발생
            try {
                Thread.sleep(500);                     // 0.5초간 일시 정지
            } catch (Exception e) {}
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);                     // 0.5초간 일시 정지
            } catch (Exception e) {}
        }
    }
}

/*
소리가 5번 난 후
다음이 프린트

띵
띵
띵
띵
띵

 */

