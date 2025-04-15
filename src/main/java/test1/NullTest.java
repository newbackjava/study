package test1;

public class NullTest {
    public static void main(String[] args) {
        String total = "";

        for (int i = 0; i < 3; i++) {
            total += i + " ";
        }//인 경우
        //null 0 1 2 3 이런식으로 붙어버리거든요.
        System.out.println(total);
    }
}
