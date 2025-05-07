package stream2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySame {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        //s1의 중복을 제거한 목록을 구한다.
        Set<String> set = new HashSet<>();
        for (String s : s1) {
            set.add(s);
        }

        //s2를 stream을 만들고
        //set에 넣은 것을 포함하고 있는지 filtering한 후
        //카운트
        long result = Arrays.stream(s2)
                .filter(set::contains)
                .count();
        System.out.println(result);
    }
}
