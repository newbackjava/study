package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //키+값의 쌍으로 넣어야함(Entry,엔트리)
        map.put("김길동", 95);
        System.out.println(map);
        map.put("홍길동", 85);
        System.out.println(map);
        
        //값을 하나씩 꺼내는 방법
        //방법1 ) 키목록을 가지고 값을 꺼내는 방법
        //1-1. 키목록을 구해야한다.
        Set<String> keys = map.keySet();
        System.out.println(keys);
        //1-2. 키를 하나씩 꺼내서 값을 구하자.
        for(String key: keys){
            //map.get(key) --> key에 해당하는 value를 가지고 온다.
            System.out.println(map.get(key));
        }
        //방법2 ) 엔트리 목록을 꺼내는 방법
    }
}
