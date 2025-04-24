package thread;

public class Images extends Thread {
    String[] s = {"감자.png", "고구마.png", "양파.png", "국수.png", "자장면.png"};

    @Override
    public void run() {
        for (int i = 0; i < s.length; i++) {
            System.out.println("음식이름: " + s[i]);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
