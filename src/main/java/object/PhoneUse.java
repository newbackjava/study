package object;

public class PhoneUse {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.color = "red";
        phone.price = 10;
        System.out.println(phone.color);
        System.out.println(phone.price);

        System.out.println("----------------");

        Phone phone2 = new Phone("silver", 20);
        System.out.println(phone2.color);
        System.out.println(phone2.price);

//        객체 생성됨.
//        red
//        10
//        ----------------
//        silver
//        20
    }
}
