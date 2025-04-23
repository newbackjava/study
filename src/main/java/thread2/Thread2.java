package thread2;

public class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("감소: " + i);
        }
    }
}
