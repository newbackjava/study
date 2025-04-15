package test2;

import java.util.Arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
        //✅ 배열의 복사

        //🔹1. 얕은 복사
        int[] num3 = {100, 200, 300};
        int[] num4 = num3;  // 참조형의 복사
        num3[0] = 999; //num3만 값을 수정

        System.out.println("주소 비교 " + (num3 == num4));
        System.out.println(Arrays.toString(num3));
        System.out.println(Arrays.toString(num4));

//      num3, num4 둘다 변경된 이상한 현상이 발생함.
//      주소 비교 true
//      [999, 200, 300]
//      [999, 200, 300]

        System.out.println("------------------");

        //🔹2. 깊은 복사(더 많이 씀)
        int[] num33 = {100, 200, 300};
        int[] num44 = num33.clone();  // 참조형의 복사
        num33[0] = 999; //num33만 값을 수정

        System.out.println("주소 비교 " + (num33 == num44));
        System.out.println(Arrays.toString(num33));
        System.out.println(Arrays.toString(num44));

//      num33만 제대로 수정되고, num44는 영향을 주지 않음.
//      주소 비교 false
//      [999, 200, 300]
//      [100, 200, 300]
    }
}
