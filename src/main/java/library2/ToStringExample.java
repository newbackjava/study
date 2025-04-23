package library2;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        //String strObj = myPhone.toString();
        //System.out.println(strObj);

        System.out.println(myPhone); //toString()이 오버라이드되어 주소 대신 재정의한 문자열이 출력
    }
}

