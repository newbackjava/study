package thread;

//동시에 증가, 감소처리를 하고 싶은 경우
//각각을 스레드클래스로 만드세요.!!
//상속을 이용하면 동시처리기능을 가진 class를 만들 수 있다.

public class Thread1 extends Thread {
   //부모인 Thread클래스의 메서드 중
    // run()메서드에 내가 동시에 처리하고 싶은 내용을 재정의

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("증가: " + i);
        }
    }
}
