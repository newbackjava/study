package thread2;

public class ThreadUser {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
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
