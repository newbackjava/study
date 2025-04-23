package thread2;

public class ThreadUser2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Timer timer = new Timer();
        Image image = new Image();
        counter.start();
        timer.start();
        image.start();
    }
}

/*
음식이름: 감자.png
카운터: 500
현재: Wed Apr 23 19:01:34 KST 2025
카운터: 499
현재: Wed Apr 23 19:01:35 KST 2025
카운터: 498
현재: Wed Apr 23 19:01:36 KST 2025
음식이름: 고구마.png
카운터: 497
현재: Wed Apr 23 19:01:37 KST 2025
카운터: 496
현재: Wed Apr 23 19:01:38 KST 2025
카운터: 495
현재: Wed Apr 23 19:01:39 KST 2025
*/
