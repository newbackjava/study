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
//        for (int i = 0; i < bag.size(); i++) {
//            System.out.println(bag.get(i));
//        }

        for (String s: bag) {
            System.out.println(s);
        }

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
