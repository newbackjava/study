package object;

public class PhoneUse {
    public static void main(String[] args) {
        Phone phone = new Phone(); //폰이 메모리에 준비됨.
        //Phone의 실제 대상(object) --> phone
        //멤버변수가 힙영역에 복사됨.
        //color, price
        //phone에 Color, price가 저장된 주소가 들어있음.
        //--> 참조형 변수

        phone.color = "red";
        phone.price = 10;

        System.out.println(phone); //주소 프린트예정
        System.out.println(phone.color);
        System.out.println(phone.price);

        //text()를 자세하게 보고 싶으면
        //text()글자위에서 컨트롤 + 클릭
        phone.text(); //객체생성후 메서드를 호출하면 동작을 하게 할 수 있음.
        //자바에서는 부품을 만들고 난 다음에 메서드를 호출함.
        //메서드만 독립적으로 실행하는 것은 없음.

        Phone phone1 = new Phone("silver", 20);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
    }
}
