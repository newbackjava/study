package thread;

public class ThreadUser2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Timer timer = new Timer();
        Images image = new Images();

        counter.start();
        timer.start();
        image.start();
    }
}

