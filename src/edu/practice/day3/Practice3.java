package edu.practice.day3;

public class Practice3 {
    private String accountHolder;
    private String accountNumber;
    private long balance;
    private String password;
    private int transactionCount;

    // 기본 생성자
    public Practice3() {
    }

    // 매개변수 생성자
    public Practice3(String accountHolder, String accountNumber, long balance, String password) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }

    // setter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    // getter
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    /* 입금 (거래 횟수 증가) */
    public void deposit(long amount){

    }

    /* 출금 (비밀번호 확인, 거래 횟수 증가) */
    public void withdraw(String pw, long amount){}

    /* 계좌이체 */
    // public void transfer(String pw, BankAccount targetAccount, long amount){}

    /* 총 거래 횟수 출력 */
    public void checkTransactionCount(){}

    /* 계좌 정보 출력 (비밀번호 제외) */
    public void getAccountInfo(){}
}
