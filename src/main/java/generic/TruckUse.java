package generic;

public class TruckUse {
    public static void main(String[] args) {
        Truck<String, Integer> t1 = new Truck<>();
        Truck<Integer, String> t2 = new Truck<>();

        t1.weight = "중량무게";
        t1.distance = 100;
        System.out.println(t1);

        t2.weight = 1000;
        t2.distance = "장거리";
        System.out.println(t2);
    }
}
