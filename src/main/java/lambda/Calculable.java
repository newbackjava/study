package lambda;

@FunctionalInterface //함수형인터페이스 설정
//추상메서드를 하나만 가저야한다.!
//표시(@, 엣) : Annotation(에노테이션, 애노테이션)
public interface Calculable {
    //일반적으로 interface에 선언된 함수는 다 public abstract
    void calculate(int x, int y);
    //void test(); --> 함수형 인터페이스는 추상메서드 한 개만!
}
