package collection2;

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        //Properties 컬렉션 생성
        Properties properties = new Properties();

        //PropertiesExample.class와 동일한 ClassPath에 있는 database.properties_ 파일 로드
        properties.load(PropertiesExample.class.getResourceAsStream("/collection2/database.properties"));
        //주어진 키에 대한 값 읽기
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");
        //값 출력
        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("admin : " + admin);
    }
}

