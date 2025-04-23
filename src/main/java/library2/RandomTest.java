package library2;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(100)); //0~99
        System.out.println(r.nextInt(100) + 1); //1~100, +1은 최소값

        System.out.println(r.nextBoolean());
        System.out.println(r.nextFloat()); //0~0.9999
        System.out.println(r.nextFloat() + 1); //1~1.9999
    }
}
