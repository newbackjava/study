package object;

public class Phone {
    //속성(필드, 멤버변수)
    //- 인스턴스 변수
    //클래스 내에서 선언되었으므로 클래스 전체 영역에서 사용 가능
    //멤버변수는 자동 초기화
    //기본형은 0, 0.0, false등으로 초기화
    //참조형은 null로 초기화
    String color;
    int price;

    //생성자(메서드) --> 필드 초기화를 간단히 하기위한 목적
    //new로 객체 생성시 필드 초기화를 동시에 하고자 하는 경우
    //클래스이름과 동일하게 만들면 객체 생성시 자동 호출되는 메서드
    //클래스이름(){ }로 정의, 반환타입 명시하지 않음. 명시하면 에러
    //자바에서는 메서드 동일한 이름으로 여러개 만들 수 있음.
    //단 입력 매개변수의 개수나 타입, 순서가 달라야 구분할 수 있음.
    //다른 생성자가 없는 경우, 파라메터 없는 생성자를 쓰지 않으면 컴파일러가 자동으로 넣어줌.
    //모든 클래스는 하나 이상의 생성자를 반드시 가지게 되어있음.
    public Phone(){ //파라메터없는 생성자를 "기본 생성자"라고 부름
        System.out.println("객체 생성됨.");
    }
    public Phone(String color, int price){
        this.color = color;
        this.price = price;
    }
    public Phone(String color) {
        this.color = color;
    }

    public Phone(int price) {
        this.price = price;
    }

    //동작(멤버메서드)
    public void text() { //문자보내다
        System.out.println("문자보내다.");
        kakao();
        //문자보내면서 카톡도하고 싶은 경우
        //같은 클래스내에서는 메서드 바로 호출 가능
    }
    public void kakao() { //카톡하다
        System.out.println("카톡하다.");
    }
}
