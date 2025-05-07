package stream2;

import java.util.Arrays;

public class SumTest {
    public static void main(String[] args) {
        int n = 1234;

        //1. 문자열로 만들어 split(분리)하면 String[]이 만들어짐.
        //{"1", "2", "3", "4"}
        //2. stream으로 만들어 하나씩 꺼내 숫자로 변환 후
        //3. sum()함수로 더함.
        String[] split = String.valueOf(n).split("");
        long result = Arrays.stream(split)
                    .mapToInt(Integer::parseInt)
                    .sum();
        System.out.println(result);
    }
}
