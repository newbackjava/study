package library;

public class SmartPhone extends Object {
    //toString()재정의사용!

    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return "전화기 내용{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
