package object;

public class PersonUse {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name); //public
        System.out.println(person.phone); //default
        //System.out.println(person.sn); //private
        //private으로 선언된 타입의 변수는
        //다른 클래스에서는 person.XXX해도 보이지 않음.
        //invisible(보이지 않는다)라고 표현한다. [ɪnˈvɪzəbl, 인비저블]
    }
}
