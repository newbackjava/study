package test2;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //같은 타입의 데이터를 많이 사용하고 하는 경우
        //배열을 가장 많이 사용함.
        //고정길이 : 처음에 정한 크기 변경 불가
        //✅ 배열 만드는 방법
        //🔹1. 배열을 만드는 시점에 값목록을 알고 있는 경우
        int[] y = {1, 2, 3};

        //🔹2. 배열을 만드는 시점에 값목록을 모르다가 나중에 넣는 경우
        int[] x = new int[3];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        System.out.println("배열의 원소의 개수 : " + x.length); //3(읽기 전용변수)

        //🔹타입별 배열 만들기
        //주제 - 가족(나이)
        int[] ages = {50, 45, 35, 25};

        //✅ c타입의 for문
        System.out.println("--- c타입의 for출력 ---");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        //✅ for-each문(자동으로 반복해서 꺼내옴)
        System.out.println("--- for-each출력 ---");
        for(int one : ages){
            //ages배열에서 하나씩 꺼내 one이라는 변수에 넣어 출력
            //one이라는 변수에는 ages의 원소 개수만큼 저장되었다가 출력 처리함.
            System.out.println(one);
        }

        //✅ 출력(제일 간단)
        System.out.println("--- Arrays.toString()출력 ---");
        System.out.println(Arrays.toString(ages));

        //✅ 주제 - 가족(몸무게)
        double[] w = {88.1, 52.2, 63.3, 77.2};
        System.out.println("--- 몸무게 출력 ---");
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }
        for(double one : w){
            System.out.println(one);
        }

        double sum = 0.0;
        for (double one : w) {
            sum += one;
        }
        System.out.println("---------------");
        System.out.println("몸무게 평균 " + sum / w.length);

//        배열의 원소의 개수 : 3
//        --- c타입의 for출력 ---
//        50
//        45
//        35
//        25
//        --- for-each출력 ---
//        50
//        45
//        35
//        25
//        --- Arrays.toString()출력 ---
//        [50, 45, 35, 25]
//        --- 몸무게 출력 ---
//        88.1
//        52.2
//        63.3
//        77.2
//        88.1
//        52.2
//        63.3
//        77.2
//        ---------------
//        몸무게 평균 70.2

    }
}
