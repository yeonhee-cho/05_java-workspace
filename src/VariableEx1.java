public class VariableEx1 {
    public static void main(String[] atgs){
        // 변수 : 메모리에 값을 저장하기 위한 공간의 명칭
        // 이 때, 저장되는 값이 변할 수 있기 때문에 변수
        
        // 자료형(data Type)
        // - 변수 또는 값의 크기와 형식

        /* *** 자바 기본 자료형(Java Primitive Types) ***
        *
        * [논리형]
        * boolean (1byte) - true / false
        *
        * [정수형]
        * byte (1byte)
        * short (2byte)
        * int (4byte) * 정수의 기본형 *
        * long (8byte) - 숫자 뒤에 L작성 소문자 가능
        * 
        * [실수형] 
        * float (4byte) - 숫자 뒤에 f
        * double (8byte) * 실수의 기본형 *
        * 
        * [문자형]
        * char (2byte) - 문자 하나, 문자 양 옆에 '' 작은 따옴표 사용
        * */
        
        // 변수 선언 : 메모리에 공간 할당
        
        boolean isTrue; // 메모리에 boolean 저장 공간을 1byte 할당하고 공간의 명칭을 isTrue라고 부르겠다고 설정
        
        double number1; // 메모리에 double 저장 공간을 8byte 할당하고 그 공간을  number1이라고 부르겠다 설정
        
        // 값 대입 : 변수 이름에 특정 값을 담아 놓은 것
        // (이미 값이 존재하는 변수 이름에 대입하면 덮어쓰기가 됨)
        
        isTrue = true; // null  빈 공간 값에 true라는 명칭으로 덮어쓰기
        
        // sout + tab = System.out.println(); // 자동완성
        // so + tab = System.out.printf(); // 자동완성

        System.out.println("isTrue" + isTrue); // true

        isTrue = false;
        System.out.println("isTrue" + isTrue); // false로 덮어쓰기 되어있는 것을 확인할 수 있음

        // 변수 선언 + 초기화 + 값의 범위 확인
        int number2= 2100000000; // 21억 오류 x

        // long number3 = 2200000000; // int 22억 오류 O integer 숫자가 너무 큽니다.
        // 오류 나는 이유는 숫자자료형들은 리터럴값이 기본적으로 int 이기 때문
        // byte short int long 은 모두 값(=리터럴)에서 뒤에 자료형 명칭이 붙지 않는 한 모두 int이다.
        
        long number3 = 2200000000L; // int 22억 오류 x
        // 오류 안 나는 이유는 리터럴 값을 int에서 long의 값으로 변환
        
        /*
        * 자바 기본 변수 선언 문법
        * 자료형 변수이름 = 리터럴;
        * 
        * 자료형(Data Type) : 변수가 저장할 데이터의 종류를 지정
        * 변수 이름(Variabled Name) : 데이터를 저장할 메모리 공간의 이름
        * 리터럴(Literal) : 실제 저장되는 값 자체
        *
        * 리터럴과 값의 차이
        *
        * 리터럴(literal) : 코딩에서 직접적으로 작성된 고정된 값
        * 값(value) : 변수나 표현식이 실제로 가지고 있는 데이터
        *
        * int a = 100; // 리터럴 이자 값임
        * int b = a + 50; // 리터럴이 아니고 값임
        * int c = method 명칭(); // 리터럴이 아니고 메서트 리턴값
        * int d = Scanner.nextInt(); // 리터럴이 아니고 사용자의 입력 값
        * 리터럴은 값 내부에 존재하는 종류 중 하나
        *
        * 직접적으로 값이 정직하게 작성되어있지 않은 모든 것은 리터럴이 아님
        * */

        System.out.println("number2 : "+ number2);
        System.out.println("number3 : "+ number3);

        /*
        * nt1,nt2 4byte 크기의 변수 데이터를 담는 바구니 명칭
        * - int 이하의 크기의 데이터를 담을 수 있음
        * - 그런데 nt2에서 2배 가량이 넘는 long 데이터를 담아 넣으려고 하기 때문에 바구니 크기에 비하여 데이터가 크다는 문제가 발생
        *
        * 값을 억지로 넣을 수는 있지만 값이 왜곡되어 변수 이름 바구니에 담김
        * => 강제 형변환 : 숫자나 문자 구문 앞에 바구니 자료형을 소괄호로 작성하면 형 변환
        *
        * */
        int nt1 = 100;
        int nt2 = (int)100000000000L; // long 데이터가 int로 강제 형변환이 되고 데이터는 변질 된다.

        long lng1 = 200; // int 리터럴을 2배 가량의 메모리를 차지하는 long에 담을 수 있음
        // 큰 바구니에 작은 데이터를 담는 것은 문제가 되지 않음
        // 하지만 long과 같이 리터럴에 L을 작성하는 경우에는 
        // 자료형 타입에도 Long 작성하는 사소한 문제를 발생할 수 있음
        // Long ->  long으로 바꾸기
        Long lng2 = 20000000000L; // 기본 자료형은 String 이외 모두 소문자
    }
}
