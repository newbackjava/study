package collection2;

import java.util.HashMap;

public class WinnerTest{
    public static void main(String[] args) {
        String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String x : all) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            // map.getOrDefault(key, 0)
            // map.get(key)가 이미 저장되어 있는 경우 값을 꺼내어 사용
            // map.get(key)가 없는 경우는 0을 사용
        }

        System.out.println(map);

        int max = 0;
        for (String key : map.keySet()) {
            // key의 목록을 구해서, 하나씩 꺼내온다.
            System.out.println(key + ": " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key); // 2
                System.out.println("현재까지 우승자: " + key);
            }
        }
    }
}

/*
{김길동=2, 정길동=1, 홍길동=3}
김길동: 2
현재까지 우승자: 김길동
정길동: 1
홍길동: 3
현재까지 우승자: 홍길동
 */

