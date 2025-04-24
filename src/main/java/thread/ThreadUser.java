package thread;

public class ThreadUser {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try{
                        System.out.println("신나신나신나.");
                        Thread.sleep(10);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

/*
신나신나신나.
감소: 100
감소: 99
증가: 0
감소: 98
신나신나신나.
증가: 1
증가: 2
감소: 97
증가: 3
감소: 96
증가: 4
증가: 5
감소: 95
신나신나신나.
*/
