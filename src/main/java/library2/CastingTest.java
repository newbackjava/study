package library2;

import java.util.ArrayList;
import java.util.List;

public class CastingTest {
    public static void main(String[] s0){
        List list = new ArrayList();
        /*
            public void add(Object o) { };
         */
        list.add("김국민");
        list.add(100); //Object <-자동형변환- Integer <-오토박싱- int
        list.add(11.1); //Object <-자동형변환- Double <-오토박싱- double

        String s = (String)list.get(0);
        //String <-강제형변환- Object
        int i = (int)list.get(1);
        //int <-오토언박싱- Integer <-강제형변환- Object
        double d = (double)list.get(2);
        //double <-오토언박싱- Double <-강제형변환- Object
    }
}
