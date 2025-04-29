package thread2;


//하나의 소스파일(java파일)에는 여러개의 클래스를 넣을 수 있음.
//단 하나만 public이여야 함. main이 있는 클래스에 public
class Thread11 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("어제는 월요일!");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadUser3 {

    public static void main(String[] args) {
        Thread thread11 = new Thread11();
        thread11.start();
        
        //Thread객체 생성하는 방법 2가지
        //방법 1.
        //Thread객체 생성 시 입력매개변수로 Runnable인터페이스에 선언된
        //run()메서드가 재정의된 객체를 넣는 방법
        //익명클래스 사용하면 더 빠르고 간단하게 만들 수 있음.
        //new이후의 Runnable부터가 익명클래스 부분임.
        //new Runnable처럼 new 이후의 단어가 인터페이스인 경우
        //이 인터페이스를 구현한 익명클래스가 됨.
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("내일은 화요일!");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread2.start();

        //방법 2.
        //Thread를 상속받아 클래스를 만들면 됨.
        //익명클래스인 경우
        //new Thread처럼 new 이후의 단어가 클래스인 경우
        //이 클래스를 상속받은 익명클래스가 됨.
        Thread thread3 = new Thread(){
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("오늘은 화요일!");
                    try {
                         Thread.sleep(1000);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread3.start();
    }
}

/*
감소: 100
감소: 99
증가: 0
감소: 98
증가: 1
증가: 2
감소: 97
증가: 3
감소: 96
증가: 4
증가: 5
감소: 95
*/
