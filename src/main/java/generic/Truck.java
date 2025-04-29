package generic;

public class Truck<T1, T2> {
    T1 weight;
    T2 distance;

    //Object에 toString()은
    //Truck t = new Truck();
    //System.out.println(t); //주소가 프린트!
    //참조형 변수를 프린트할 때 내부적으로 toString()이 먼저호출됨.
    //generic.Truck@해시코드 <-- 이렇게 프린트 됨.!
    //참조형 변수를 찍을 때 프린트되는 문자열을 만들어주는 메서드임.

    //toString()을 필드(weight, distance)을 확인용도로 쓰고 싶은 경우
    //주소보다 이 경우 더 많이 씀.
    //toString()을 재정의해야함.
    @Override
    public String toString() {
        return "필드값>> " + weight + " " + distance;
    }
    
    //Integer, Double, String ==> 클래스 
    //Integer, Double ==> 포장클래스(기본형가지고 만든 클래스)
}
