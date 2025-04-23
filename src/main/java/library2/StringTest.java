package library2;

public class StringTest {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 10; i++) {
            s = s + i;
            //해시코드가 다 다름.(주소가 다 다름)
            //String은 값이 변하면 새로운 주소를 만들고
            //새로운 값을 넣는 방식
            //이전 주소의 데이터는 그대로 가지고 있음.
            //가비지콜렉터(gc)가 공간을 해제하기 전까지
            //값이 변경이 많이 이루어지는 경우
            //String타입의 저장공간을 지양해야함.
            System.out.println("주소>> " + s.hashCode());
        }
        System.out.println(s);

        System.out.println("============");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            System.out.println("주소>> " + sb.hashCode());
        }
        System.out.println(sb);
        //StringBuilder는 주소가 변경되지 않음.
        //하나의 공간을 사용하면서 값 만 변경함.
    }
/*
    주소>> 48
    주소>> 1537
    주소>> 47697
    주소>> 1478658
    주소>> 45838450
    주소>> 1420992003
    주소>> 1101079187
    주소>> -226283516
    주소>> 1575145652
    주소>> 1584875013
    0123456789
    ============
    주소>> 1329552164
    주소>> 1329552164
    주소>> 1329552164
    주소>> 1329552164
    주소>> 1329552164
    주소>> 1329552164
    주소>> 1329552164
    주소>> 1329552164
    주소>> 1329552164
    주소>> 1329552164
    0123456789
*/

}
