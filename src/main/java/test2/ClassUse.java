package test2;

import java.util.Scanner;

public class ClassUse {
    public static void main(String[] args) {
        //부품을 사용하는 방법 2가지
        //내가 사용하려고 하는 부품이 어떤 특징이 있는지 판단할 필요가 있다.
        //많이 써보면 알게된다.!
        //컴퓨터 콘솔에 출력하는 것. 평균구하는 것. 랜덤값 구하는 것 등등

        //1. 자주 여러 곳에서 공통적으로 사용하는 경우
        //   바로 클래스이름으로 접근해서 사용할 수 있도록 만들어놓음.
        //   클래스이름.함수명(); //함수는 기능을 정의해놓은 단위
        //   Integer.parseInt();
        //2. 부품이 필요할 때 만들어서 사용하는 경우
        //   Date date = new Date();
        //        date.함수명();

        //인텔리제이 콘솔에서 입력해서 데이터를 실행할 때 사용하기 위한 부품
        Scanner sc = new Scanner(System.in);
        //Scanner(System.in); --> System.in은 키보드를 의미
        //키보드로 입력한 데이터를 자바실행시 사용할 부품을 만들겠다라는 의미
        //sc라는 부품이 하나 만들어짐. 해당 부품에는 여러개의 기능이 함수로 만들어져 있음.
        //입력한 데이터 타입은 모두 String으로 인식함.
        String plan = sc.nextLine(); //입력한 한 줄 다 읽어와서 변수에 넣음.
        String name = sc.next(); //입력한 단어 하나 읽어와서 변수에 넣음.
        int age = sc.nextInt(); //입력한 단어를 int(정수형)으로 변환해서 변수에 넣음.
        double w = sc.nextDouble(); //입력한 단어를 double(실수형)으로 변환해서 변수에 넣음.

        System.out.println("내 plan : " + plan);
        System.out.println("입력한 name : " + name);
        System.out.println("내년 age : " + (age + 1));
        System.out.println("w : " + w);

        /*
            입력 ----
            잘 살자
            홍길동
            100
            100.5

            출력 ----
            내 plan : 잘살자
            입력한 name : 홍길동
            내년 age : 101
            w : 100.5
        */
    }
}
