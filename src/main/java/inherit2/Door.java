package inherit2;

public class Door {

    //✅ 컴파일시 자동으로 생성자 메서드가 자동으로 생성됨.
    //⭕ 단, 다른 생성자가 하나도 없을 때
    //⭕ 파라메터 없는 생성자 : 기본 생성자
    //    public Door(){
    //    👀 자식객체 생성되기전에 부모 객체 먼저 만들어져야하므로!
    //    부모 클래스와 동일한 메서드 호출, 자동 호출
    //        super();
    //    }

    public void open(){
        System.out.println("문을 직접 옆으로 열다.");
    }
}
