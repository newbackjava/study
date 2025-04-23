package thread2;

class BankAccount extends Thread {
    private int balance = 1000;

    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " 출금 시도 중...");
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " 출금 완료. 남은 잔액: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " 출금 실패. 잔액 부족.");
        }
    }

    @Override
    public void run() {
            for (int i = 0; i < 3; i++) {
                withdraw(400);
            }
    }
}
