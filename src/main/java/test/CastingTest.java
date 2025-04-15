package test;

public class CastingTest {
    public static void main(String[] args) {

        //특정 타입의 변수에 저장된 값을 다른 타입의 변수에 넣을 수 있음.
        //이때 데이터는 해당 타입으로 변환되어 들어감(형변환)
        //1. 큰 크기의 변수 <----- 작은 크기의 변수 : 자동으로 해당하는 큰 타입으로 변환되어 들어감
        //   (자동형변환)
        //2. 작은 크기의 변수 <---- 큰 크기의 변수 : 강제로 작은 타입으로 변환해 넣어줌.
        //   (강제형변환, 이때 들어갈 크기의 데이터가 변수의 크기를 벗어나면 형변환 불가능)
        //char도 실제로는 int값을 가지므로 정수로 변환가능

        byte age = 127;
        int age2 = age;
        //age변수에 들어있는 값을 age2에 넣을 수 있음.(자동으로 int로 변해서 들어감, 자동형변환)
        byte age3 = (byte)age2;
        //int타입으로 변환되어 큰 타입의 데이터이므로 작은 데이터형으로 강제로 잘라서 넣어야함.
        //(강제형변환)
        //원하는타입명 변수명 = (원하는타입명)변수명; 형식으로 작성함.

        //기본형끼리 형변환 가능 : byte < short, char < int < long < float < double
        //참조형은 제약이 있음.(추후에 다시 확인 예정)
        //형변환이 불가능한 경우 부품에는 타입을 변환해주는 부품(클래스)를 써야함.
        //여러 부품에서 공통적으로 많이 사용되는 부품은 클래스이름으로 바로 접근해서 사용가능
        String data = "100";
        int num = Integer.parseInt(data); //정수타입별 모두 있음.(ppt 52)

        String data2 = "11.11";
        double num2 = Double.parseDouble(data2); //Float.parseFloat()도 있음.

        //거꾸로 int, double등의 데이터를 String으로 변경 가능(ppt 53)
        String data3 = String.valueOf(num);
        String data4 = String.valueOf(num2);
    }
}
