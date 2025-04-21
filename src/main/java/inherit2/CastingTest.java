package inherit2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class CastingTest {
    public static void main(String[] s0){
        List list = new ArrayList();
        //😊 리스트에 다양한 타입의 데이터를 모으고 싶은 경우
        //Object class가 최상위 클래스이므로
        //하위 모든 클래스는 Object타입의 변수 자리에 모두
        //넣을 수 있음.
        //public boolean add(Object o){}
        //✅ Object o인 경우 Object타입으로 설정해놓으면
        //    모든 타입을 넣을 수 있음.
        //Object 매개변수에 하위 모든 객체가 다 들어갈 수 있음.

        list.add(new String("test")); //자동형변환
        //Object <-- String
        list.add(new Random());
        list.add(new Date());

        Object o = list.get(0);
        //System.out.println(o.charAt(0));  불가능
        //⭕add()시 Object으로 형변환되어 들어갔기 때문에
        //   Object에 있는 메서드만 호출 가능함.
        //   Object에 charAt()이 없음.
        String s = (String)list.get(0); //강제형변환
        System.out.println(s);
        System.out.println(s.charAt(0)); //가능
        System.out.println(s.toUpperCase());
    }
}
