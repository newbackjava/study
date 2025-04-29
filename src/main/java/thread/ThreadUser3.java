package thread;

//하나의 java소스파일에는 여러개의 클래스를 정의가능하다.
class Thread11 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("어제는 월요일");
            //해당 스레드를 1초가 일시정지시켜줘.
            try {
                Thread.sleep(1000);
                //cpu핸들링(외부 자원에 해당)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //자바이외의 자원, 네트워크, 파일연결 등은 반드시 예외처리
        } //for
    } //run
} //class

public class ThreadUser3 {
    public static void main(String[] args) {
        Thread thread11 = new Thread11();
        thread11.start(); //실행대기줄에 넣어줘.
        //멀티스레드 3개를 만들어서 동시에 돌리자.
        //1. Runnable인터페이스의 run()메서드를 재정의한 클래스 생성
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("오늘은 화요일");
                    //해당 스레드를 1초가 일시정지시켜줘.
                    try {
                        Thread.sleep(1000);
                        //cpu핸들링(외부 자원에 해당)
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //자바이외의 자원, 네트워크, 파일연결 등은 반드시 예외처리
                } //for
            } //run
        }); //class
        thread2.start();

        //2. Thread상속해서 run()메서드 재정의한 클래스 생성
        //익명클래스 
        Thread thread3 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("내일은 수요일");
                    //해당 스레드를 1초가 일시정지시켜줘.
                    try {
                        Thread.sleep(1000);
                        //cpu핸들링(외부 자원에 해당)
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //자바이외의 자원, 네트워크, 파일연결 등은 반드시 예외처리
                } //for
            } //run
        }; //익명클래스
        thread3.start(); //실행대기 상태로 감.
    }
}
