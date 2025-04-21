package object;

public class CalUse {
    public static void main(String[] args) {
        Cal cal = new Cal();
        //계산기를 만들어서 사용할 수 있음.

        cal.add(100);
        cal.add(100, 200);
        cal.add("내돈은 ", 300);

        int result = cal.minus(5000, 4500); //500
        if (result >= 1000){
            System.out.println("더 쓰자.");
        }else{
            System.out.println("그만 쓰자.");
        }

        //int result2 = cal.add(200);
        //void인 경우 변수에 저장할 값이 없음.!
        //System.out.println(cal.add(300));
        //void인 경우에는 프린트할 값이 없음.
    }
}

