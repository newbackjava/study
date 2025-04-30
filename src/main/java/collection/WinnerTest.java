package collection;

import java.util.HashMap;

public class WinnerTest {
    public static void main(String[] args) {
        String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};

        HashMap<String, Integer> map = new HashMap<>();
        //{홍길동 = 3, 김길동 = 2, 정길동 = 1}
        for (String key : all) {
            map.put(key, map.getOrDefault(key, 0) + 1);
            // map.getOrDefault(key, 0)
            // map.get(key)가 이미 저장되어 있는 경우 값을 꺼내어 사용
            // map.get(key)가 없는 경우는 0을 사용
        }
        System.out.println(map);
    }
}
