package inherit2;

public class SpaceDoor extends Door{

    public boolean night = false; //저녁 여부
    //저녁에는 집안에서 리모컨으로 열다.
    //낮에는 문을 직접 옆으로 열다.

    //✅ 컴파일시 자동으로 생성자 메서드가 자동으로 생성됨.
    //    public SpaceDoor(){
    //        super();
    //    }

    @Override
    public void open(){
        if(night){
            System.out.println("문을 리모컨으로 열다.");
        }else{
            super.open();
            //자식 클래스에서 특정한 상황에서
            //이미 자식클래스에서
            //재정의된 원본인 부모클래스의 메서드를 호출해야하는 경우
            //자식의 재정의된 메서드와 이름 구분을 위해 super.메서드명()이라고 해서 호출한다.
        }

    }
}
