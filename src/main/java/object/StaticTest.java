package object;

import java.util.Arrays;

public class StaticTest {
    public static void main(String[] args) {
        System.out.println(Cal2.PI);
        System.out.println(Cal2.company);

        Cal2.sum(100, 200);

        //실무에서 유용하게 사용할 수 있는 static변수, 메서드

        System.out.println(Math.PI); //final static
        System.out.println(Math.max(100, 200));
        System.out.println(Math.min(100, 200));
        System.out.println(Math.random()); //랜덤한 값
        //0.0 ~ 0.99999
        //Random r = new Random(); //정수 랜덤값
        System.out.println(Integer.parseInt("100"));
        System.out.println(String.valueOf(100));

        int[] scores = {10, 30, 20};
        System.out.println(Arrays.toString(scores)); //[10, 30, 20]
        //함수를 쓸 때 원본을 파괴하는 함수 --> 파괴함수
        //함수를 쓸 때 원본을 파괴하지 않는 함수 --> 비파괴함수
        Arrays.sort(scores); //오름차순 정렬, {10, 20, 30}, 파괴함수
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.binarySearch(scores, 10)); //0
        //없으면 음수
    }
}
