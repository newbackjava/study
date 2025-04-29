package collection2;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        String s = "bbbaaacdddefecge";
        HashSet<String> set = new HashSet<>();
        String[] s2 = s.split("");
        //Arrays.sort(s2);
        for (String x: s2){
            set.add(x);
        }
        System.out.println(set);

        Object[] o = set.toArray();
        for(Object x: o){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

/*
[a, b, c, d, e, f]
 */

