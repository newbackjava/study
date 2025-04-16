package object;

public class Cal2 {
    //static(정적)의 개념
    //보통 여러 클래스에서 자주 사용되는 변수나 메서드를
    //메모리에 정적인 상태로 상주시켜
    //객체생성하지 않고 바로 클래스이름으로 사용할 수 있게 함.

    //final은 상수, 변수명은 대문자로, 스네이크 표기법 사용(PI_NUM)
    //정적(static)변수 
    // ==> 여러 클래스에서 바로 사용가능하도록
    //메모리에 정적으로 상주하는 변수
    //사용할때 "클래스명.변수명"라고 씀.
    int price = 1000;
    final static double PI = 3.14;
    static String company = "KB";

    //정적 메서드 
    //바로 호출해서 사용가능한 상태로
    //항상 메모리에 정적으로 상주하는 메서드
    public static void sum(int x, int y){
        System.out.println("PI는 " + PI); 
        //static 메서드 내에서는 static변수만 사용 가능
        //static 메서드 내에서는 static메서드만 호출 가능
        //메서드나 변수 둘다 클래스로 직접 접근할 수 있어야한다.
        //System.out.println("price는 " + price);
        System.out.println("더한 결과는 " + (x + y));
    }
}
