package test;

public class OperTest {
    public static void main(String[] args) {
        //(ppt 3)
        //산술 연산자(+, -, *, /, %(나머지))
        byte n1 = 10;
        byte n2 = 100;
        //byte result1 = n1 + n2;
        int result1 = n1 + n2;
        //byte, short는 int로 형변환되어 계산되므로 결과를 int에 넣어야 함.
        int count = 2;
        System.out.println("평균은 " + (result1 / count));
        //정수와 정수 연산의 결과는 무조건 정수임.
        //평균 등의 소수점 결과를 얻고자 하는 경우에는 하나 이상이 무조건 실수여야함.

        int n3 = 100;
        double n4 = 10;
        System.out.println(n3 / n4); //int가 float으로 형변환되어 결과가 실수임.

        //비교 연산자(==, !=, >, >= 등) : 결과는 논리형 데이터(true, false)
        //대입 연산자(=)
        //결합 연산자(+) : 데이터 타입이 하나라도 String인 경우
        String pre = "010";
        int post = 53521111;
        String total = pre + post;
        System.out.println("전체 전화번호는 " + total);

        //논리 연산자(&&, ||, !) : 비교/판단해야할 대상이 여러 개인 경우 사용. 결과는 논리형
        boolean rain = false;
        boolean cloudy = true;
        //비가 오거나 구름이 있으면 아침에 우산을 가지고 나오자.
        if(rain || cloudy){
            //or연산인 경우, true일 가능성이 큰 것을 앞에 넣는 것이 좋다.
            //뒤에 나오는 조건을 체크하지 않아도 되기 때문
            //and연산인 경우, 모든 조건이 만족되어야만 하기때문에
            //하나라도 false이면 조건이 만족하지 않게 된다.
            //false일 조건이 큰 것을 앞에 넣는 것이 좋다.
            System.out.println("우산을 가지고 가자!");
        }else {
            System.out.println("우산을 가지고 가지 말자! ");
        }

        //접근 연산자(.) : 클래스.함수명(), 상위패키지.하위패키지.더하위패키지.클래스
        //증감 연산자(++, --) : 1씩 더하거나 빼는 연산을 더 간단하게 표현
        int x = 100;
        System.out.println("++x한 결과는 " + ++x); //미리 1증가시킨후 프린트(101 프린트)
        System.out.println("x++한 결과는 " + x++); //프린트한 후 1증가(101 프린트)
        System.out.println("x값은 " + x); //앞에서 102가 되었으므로 현재는 102

        //삼항 연산자(조건? 참인경우 처리내용:거짓인경우 처리내용) : if, else 조건문을 더 간단하게 표현
        String result2 =  (3 > 2 ? "앞 숫자가 더 크다" : "뒤의 숫자가 더 크다");
        System.out.println(result2);

        //복합 대입 연산자(연산과 대입이 결합된 연산자)
        int y = 5;
        y += 3; //y = y + 3;과 동일
        System.out.println(y);
    }
}
