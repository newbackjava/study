package thread2;

public class SyncTest {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        Thread t1 = new Thread(bankAccount);
        Thread t2 = new Thread(bankAccount);

        t1.start();
        t2.start();
    }
}
/*
Thread-1 출금 시도 중...
Thread-2 출금 시도 중...
Thread-2 출금 완료. 남은 잔액: 200
Thread-1 출금 완료. 남은 잔액: 600
Thread-2 출금 실패. 잔액 부족.
Thread-2 출금 실패. 잔액 부족.
Thread-1 출금 실패. 잔액 부족.
Thread-1 출금 실패. 잔액 부족.
 */