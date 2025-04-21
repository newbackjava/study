package inherit2;

public class CarTest {
    public static void main(String[] args) {

        //public Car(Door door)
        //📌 Door나 상속받은 클래스 객체 모두 넣을 수 있음.
        //📌 Door가 제일 크므로 작은 하위 자식 클래스의 객체는 모두 넣을 수 있음.
        //Door하나의 타입이름으로 선언했더니
        //다양한 하위 객체도 모두 넣을 수 있는 좋은 코드가 됨.
        //하나의 이름으로 다양한 형태를 사용할 수 있는 특성
        //다형성(오버로딩)
        Car car1 = new Car(new Door());
        car1.open();
        Car car2 = new Car(new TeslaDoor());
        car2.open();
        Car car3 = new Car(new SpaceDoor());
        car3.open();

//        문을 직접 옆으로 열다.
//        문을 위로 열다.
//        문을 직접 옆으로 열다.
    }
}
