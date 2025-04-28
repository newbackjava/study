package collection2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTest {
    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();
        bag.add("A");
        bag.add("B");
        bag.add("C");
        
        //set은 index가 없으므로 index를 이용한 접근은 불가능
//        for (int i = 0; i < bag.size(); i++) {
//            System.out.println(bag.get(i));
//        }

        for (String s: bag) {
            System.out.println(s);
        }

        //컬렉션에 반복해서 꺼내주는 iterator(반복자)를 설정한 후 접근 가능
        Iterator<String> it = bag.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}

/*
A
B
C
A
B
C
*/
