package object;


public class Cal {
    //필드나 메서드가 없을 수도 있음.
    //생성자가 하나도 없는 경우 컴파일시 자동으로 생성해줌.
    //기본 생성자
    //    public Cal(){
    //        //처리내용은 비어있는 생성자 자동 생성됨.
    //    }

    //메서드는 같은 이름으로 여러개 쓸 수 있다.
    //오버로딩 : 하나의 동일한 이름으로 부를 수 있다라는 의미
    //단, 입력 매개변수의 순서, 개수, 타입이 달라야 한다.
    //반환값을 가지고 오버로딩을 구분하지 않음.
    //void는 리턴값이 없다라는 의미
    //(해당 메서드의 결과를 리턴하지 않는다라는 의미)
    public void add(int x){
        System.out.println(x + 100);
    }
    public void add(int x, int y){
        System.out.println(x + y);
    }
    public void add(String x, int y){
        System.out.println(x + "가 입력한 값은 " + y + "원임.");
    }

    //리턴해야 하는 경우
    //void대신 return키워드 뒤에 오는 데이터의 타입을 써줌.
    public int minus(int x, int y){
        return x - y; //return되는 데이터의 타입은 int
    }
}
