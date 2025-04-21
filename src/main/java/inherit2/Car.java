package inherit2;

public class Car {
    Door door; //필드 다형성

    
    //매개변수 다형성
    public Car(Door door){
        this.door = door;
    }

    public void open(){
        door.open();
    }
}
