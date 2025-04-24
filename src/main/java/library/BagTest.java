package library;

public class BagTest {
    public static void main(String[] args) {
        //dto를 사용할 때는
        //보내는 쪽: dto만들고 값 넣어서 전달
        //받는 쪽: dto에서 값 꺼내서 처리

        //보내는 쪽
        Bag bag = new Bag();
        bag.setName("김국민");
        bag.setAge(20);

        //받는 쪽
        System.out.println(bag.getName());
        System.out.println(bag.getAge());

        System.out.println(bag); 
        //필드의 값을 프린트하도록 toString()이 재정의

    }
}
