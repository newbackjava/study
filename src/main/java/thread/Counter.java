package thread;

public class Counter extends Thread {
    //재정의하는 경우에는 원본 모양을 변경하면 XXXX
    //public void run() throws Exception  XXXX
    @Override
    public void run(){
        for (int i = 500; i >= 0; i--) {
            System.out.println("카운터: " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }    }		}
