package stream2;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageTest {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        int[] n2 = new int[0];

        //방법1 -> 있는지 없는지 체크해서 다르게 처리
        OptionalDouble result = Arrays.stream(n2)
                .average(); //OptionalDouble[0.0]

        System.out.println(result); //OptionalDouble[0.0]

        //average()함수는 결과값이 없을 수도 있음.
        if (result.isPresent()) {
            //OptionalDouble에서 double값을 꺼내야한다.
            System.out.println("평균: " + result.getAsDouble()); //0.0
        } else {
            System.out.println("평균 : 0.0");
        }

        //방법2 -> 없는 경우 기본값을 설정
        double result2 = Arrays.stream(n2)
                .average()
                .orElse(0.0);
        System.out.println("평균: " + result2);

        //방법3 -> 있는 경우만 프린트
        Arrays.stream(n2)
                .average()
                .ifPresent(x -> System.out.println("평균: " + x));

    }
}
