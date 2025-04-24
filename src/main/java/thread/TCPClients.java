package thread;

import java.net.Socket;

public class TCPClients {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            Socket socket = new Socket("localhost", 9100);
            System.out.println("클라이언트 " + i + ": 서버와 연결성공!!!!");
        }
    }
}
