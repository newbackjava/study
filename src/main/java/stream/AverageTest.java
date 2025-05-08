package stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageTest {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        int[] n2 = new int[0]; //값이 없는 배열

        OptionalDouble result = Arrays.stream(n2).average();
        //필드가 isPresent, value에 결과 내용을 넣어줌.

        //1. if문으로 값이 있는지 체크해서 있으면 처리, 없을 때도 처리 내용 써주고.
        if (result.isPresent()) {
            System.out.println("평균은 " + result.getAsDouble());
        } else {
            System.out.println("평균을 구할 수 없음.");
        }

        //2. orElse(없으면 사용할 기본값)
        double result2 = Arrays.stream(n2).average().orElse(0.0);
        System.out.println(result2); //0.0

        //3. 있을 때만 처리하고 싶은 경우 ifPresent(처리 내용)
        Arrays.stream(n).average().ifPresent(System.out::println);
    }
}
