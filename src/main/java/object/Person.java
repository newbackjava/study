package object;

public class Person {
    //이 클래스를 벗어날 수 없음.
    private String sn = "9010104"; //주민번호
    
    //같은 패키지는 접근가능
    String phone = "0123456789";
    
    //다른 패키지도 접근가능
    public String name = "국민이";
}
