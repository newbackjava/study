package object;


public class Cal2 {
    int price; //인스턴스 변수
    //클래스가지고 만든 객체(인스턴스)
    //new를 이용해서 인스턴스 만든다음에 접근 가능한 변수
    
    //정적변수, static, 클래스변수
    final static double PI = 3.14;
    //final 변수명; --> 상수
    //final 메서드명(), final class 클래스명;
    //--> 상속과 관련된 개념!
    //final == 변경불가
    static String company = "KB";

    static void sum(int x, int y){
     //스태틱 메서드(정적 메서드)
        System.out.println(x + y);
        //static메서드안에서는 필드 중에서 
        //static변수만 사용 가능
        System.out.println(x + y + PI);
        //System.out.println(price);
    }
}
