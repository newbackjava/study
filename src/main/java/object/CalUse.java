package object;

public class CalUse {
    public static void main(String[] args) {
        Cal cal = new Cal(); //기본 생성자 호출
        System.out.println(cal); //참조형 주소(힙영역)

        System.out.println("--- 리턴이 없는 오버로딩된 메서드 호출 ---");
        cal.add(100);
        cal.add(100, 200);
        cal.add("국민이", 1000);


        System.out.println("--- 리턴이 있는 메서드 호출 ---");
        //잔고 - 지출금액
        //두 수를 뺀 수의 결과가 1000이상이면 더 쓰자.
        //두 수를 뺀 수의 결과가 1000미만이면 그만 쓰자.
        //결과값이 minus()를 부른 main()에서 필요
        //결과를 받아와야함.(return)
        int stock = 5000;
        int buy = 4500;
        //리턴이 있는 경우
        int result = cal.minus(stock, buy);
        if (result >= 1000) {
            System.out.println("더 쓰자.");
        }else {
            System.out.println("그만 쓰자.");
        }
    }
}

//object.Cal@4eec7777
//--- 리턴이 없는 오버로딩된 메서드 호출 ---
//200
//300
//국민이가 입력한 값은 1000원임.
//--- 리턴이 있는 메서드 호출 ---
//그만 쓰자.