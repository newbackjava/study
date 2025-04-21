package inherit2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class CastingTest {
    public static void main(String[] s0){
        List list = new ArrayList();
        //public boolean add(Object o){}
        //Object 매개변수에 하위 모든 객체가 다 들어갈 수 있음.

        list.add(new String("test")); //자동형변환
        //Object <-- String
        list.add(new Random());
        list.add(new Date());

        Object o = list.get(0);
        //System.out.println(o.charAt(0));  불가능
        //Object에 charAt()이 없음.
        String s = (String)list.get(0); //강제형변환
        System.out.println(s);
        System.out.println(s.charAt(0)); //가능
        System.out.println(s.toUpperCase());
    }
}
