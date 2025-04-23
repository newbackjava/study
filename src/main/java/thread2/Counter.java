package thread2;

public class Counter extends Thread {
    @Override
    public void run() {
        for (int i = 500; i >= 0; i--) {
            System.out.println("카운터: " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
