package stream2;

import java.util.Arrays;

public class StrList {
    public static void main(String[] args) {

        String[] strList = {"We", "are", "the", "world!"};
        int[] result = Arrays.stream(strList)
                .mapToInt(String::length)
                .toArray(); //int[]로 변환
        System.out.println(Arrays.toString(result));
    }
}
