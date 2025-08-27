package edu.oop.basic;

/*
* 계좌 기능 실행 클래스
* */
public class AccountRun {
    // JVM 바라보는 메인 메서드 args의 매개변수 이름은 변경해도 되지만 나머지는 그대로 유지
    // 되도록이면 수정없이 사용!
    public static void main(String[] args) {
        // Account 객체 생성
        Account a1 = new Account(); // Account()는 기본 생성자를 호출해서 객체 생성

        // private 이 설정된 값과 안된 값 접근 가능 여부 확인
        // private 을 적용한 변수(필드)는 외부에서 보이지 않음(정보 은닉)

        // a1.accountNumber = "1234";
        // Account 클래스 내부에 작성된 속성변수이름 accountNumber 는 private 형태이기 때문에
        // 다른 클래스에서 직접적으로 접근 불가
        // Account.accountnumber = "1234"'

        // 간접 접근 기능을 이용해서 값을 세팅
        a1.setName("홍길동"); // name 이라는 변수이름을 간접적으로 사용하는 setName에서
        // 홍길동 명칭을 가지고 있는 상태

        // 간접 접근 기능을 이용해서 객체 내부에 저장되어 있는 데이터를 출력
        a1.getName(); // setName 으로 저장한 데이터를 가져오기
        // getName은 가져오는 것이지 가져오는 것을 출력하는 메서드가 아님!!
        // getName으로 가져온 데이터를 확인하기 위해서는 System과 같은 출력문 내부에 작성해야함
        System.out.println(a1.getName());
        a1.setAccountNumber("123-456-789");
        a1.setPassword("7890");

        /*
        * Account class에서 accountNumber를 String자료형으로 작성한다 표기했기 때문에
        * private String accountNumber;
        *
        * 저장된 데이터를 가져와서 변수 이름에 넣어서 사용할 경우 또한 String 형태여야 함
        * int a1Num = a1.getAccountNumber();
        * */
        String a1Num = a1.getAccountNumber();
        String a1Password = a1.getPassword();
        System.out.println(a1Num);
        System.out.println(a1Password);

        // 필수 생성자는 활용하여 데이터 저장하고 저장된 데이터 확인
        // Account a2 = new Account("강말숙"); // 오류 확인 : 생성자 'Account(String)'을(를) 해결할 수 없습니다

        // 필수 생성자는 Account 클래스에서 활용할 데이터를 외부에서 매개변수 데이터로 필히 넣어줘야하는 매개변수를 작성한 공간
        // 매개변수를 작성한 공간으로 Account() 소괄호 내부에 작성한 매개변수 순서대로 데이터 작성
        // 데이터 순서가 일치하지 않으면 에러 발생하므로 순서에 맞게 작업해줘야 함
        //        public Account(String name,   String accountNumber,      long balance, String password)
        Account a2 = new Account("강말숙", "111-222-333",10000,"7777");
        System.out.println("=== a2의 계좌정보 ===");
        System.out.println(a2.getName());
        System.out.println(a2.getAccountNumber());
        System.out.println(a2.getBalance());
        System.out.println(a2.getPassword());

        System.out.println(); // 띄어쓰기

        // 각 계좌에 입금
        // 계좌 잔액에서 long 타입 정도의 숫자 금액이 들어올 수 있을지는 모르겠지만
        // 데이터 문제 발생을 최소화 하기 위해 long 작성
        a1.deposit(10000); // 변수에서 자료형 long
        a1.deposit(2345L); // 데이터를 long 타입으로 저장하겠다.

        a2.deposit(5000);
        a2.deposit(10000);

        System.out.println("==============================");
        // 각 계좌에서 출금
        a1.withdraw("1234",200000); // 비밀번호 불일치
        a1.withdraw("7890",200000); // 잔액이 부족합니다.
        a1.withdraw("7890",5000); // 출금 성공
    }
}
