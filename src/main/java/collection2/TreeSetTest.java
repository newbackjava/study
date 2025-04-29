package collection2;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //TreeSet 컬렉션 생성
        TreeSet<Integer> scores = new TreeSet<>();

        //Integer 객체 저장
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);
        scores.add(80);

        //정렬된 Integer 객체를 하나씩 가져오기
        System.out.println(scores);
        System.out.println(scores.first());
    }
}
