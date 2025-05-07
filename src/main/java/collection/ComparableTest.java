package collection;

import java.util.TreeSet;

public class ComparableTest {
    public static void main(String[] args) {
        //TreeSet 컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet<Person>();

        //객체 저장
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("감자바", 100));
        treeSet.add(new Person("박지원", 31));

        //객체를 하나씩 가져오기
        for(Person person : treeSet) {
            System.out.println(person.name + ":" + person.age);
        }
    }
}

