package object2;

import object.Person;

public class PersonUse2 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name); //public

        //다른 패키지이므로 default, private이 보이지 않음.
        //System.out.println(person.phone); //default
        //System.out.println(person.sn); //private
      }
}
