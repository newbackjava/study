package library2;

public class BagTest {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.setAge(100);
        bag.setName("김국민");
        System.out.println("나이는 " + bag.getAge());
        System.out.println("이름은 " + bag.getName());
        System.out.println(bag);
        //toString()오버라이드하면 필드값을 한번에 확인할 수 있다.
    }
}

/*
나이는 100
이름은 김국민
Bag(name=김국민, age=100)
*/

