package generic;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        //제너릭은 general이라는 뜻!
        
        //제너릭을 쓰지 않았을 때
        ArrayList list = new ArrayList(); //Object으로 기본 설정되어있음.
        list.add("홍길동"); //String(작) --> Object(큰) 자동형변환
        //자동형변환되어 들어간 것을 꺼내서 String에 있었던 equals()메서드로
        //값을 비교하고 싶은 경우 Object의 equals() 사용할 수 없음.
        //원래의 String클래스에 있었던 equals()필요함.
        list.get(0).equals("김길동"); //Object은 주소를 비교
        ((String)list.get(0)).equals("김길동"); //String은 값을 비교
        //Object(큰) --> String(작) 강제형변환

        //제너릭을 썼을 때 //객체생성할 때 내가 정한 타입으로 설정할 수 있음.
        ArrayList<String> list2 = new ArrayList<>(); //String으로 설정
        list2.add("김길동");
        System.out.println(list2.get(0).charAt(0));

        ArrayList<Integer> list3 = new ArrayList<>(); //Integer로 설정(int로 박싱/언박싱도 가능)
        list3.add(1); //Integer <--오토박싱-- int
        System.out.println(list3.get(0) + 1);
        //int <--오토언박싱-- Integer
    }
}
