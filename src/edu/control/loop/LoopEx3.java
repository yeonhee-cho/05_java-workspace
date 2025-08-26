package edu.control.loop;

import java.util.Scanner;

/*
* 루프 기능용 클래스
* 문자열 / while 문 기능 작성
* */
public class LoopEx3 {
    Scanner sc=new Scanner(System.in);

    /*
    * 문자열 한 글자씩 출력하기
    * */
    public void method1(){
        // 문자열.charAt(인덱스) : 인덱스 번 째 문자 하나를 얻어와 반환
        // 문자열.length() : 문자열의 길이(메서드)
        String str = "Hello World";

        // str 문자열의 총 길이를 length() 메서드를 활용하여 가져오고
        // 문자열의 문자를 하나씩 charAt으로 출력하는 기능
        // 문자열 = 문자 + 나열 = String
        for(int i=0;i<str.length();i++){
            System.out.println("i의 값 : " + i);
            System.out.println("i 위치의 문자 확인 : " + str.charAt(i));
            /*
             * str은 문자열이기 때문에 문장 전체에서 자리를 바라본다는 것 자체가 문제
             *
             * System.out.println("i 위치의 문자 확인 : " + str(i));
             */
        }
    }

    /*
    * while(조건식) : 끝이 확실하지 않은 반복에 사용
    *
    * -1이 입력될 때까지 정수를 계속 입력받아
    * 입력받은 수의 합계를 구하기
    *
    * 변수이름
    * int sum = 0; 합계 누적용 변수
    * int input = 0; 입력 값을 저장할 변수
    *
    * while(조건이 참일 경우에만 지속적으로 실행){
    *
    * }
    * method2()
    * */
    public void method2(){
        int sum = 0;
        int input = 0;
        System.out.println("-1을 입력하면 종료됩니다.");

        while(input != -1){ // 입력 값이 -1이 아니면 반복 맞으면 종료
            // System.out.println("-1을 입력하면 종료됩니다."); // 여기에 두면 계속 반복
            System.out.print("한 자리 정수 입력 : ");
            input = sc.nextInt();;
            if(input != -1){
                sum += input; // -1이 아닐 경우에만 숫자 더하기
            }
        }
        System.out.println("-1을 입력하기 전까지 숫자 합계 : " + sum);
    }

    /*
    * while 문을 활용하여
    * 0이 입력될 때까지 정수를 계속 입력받고
    * 0 입력 시 누적된 합계 출력
    *
    * while(true){ // 무한 반복
    *   if input == 0 break;
    *   // 반복 종료하는 분기문(break) 활용해서 while문 종료
    * }
    *
    * 변수이름 : int sum = 0;
    *          int input = 0;
    * */
    public void method3(){
        int sum = 0;
        int input = 0;
        System.out.println("0을 입력하면 프로그램이 종료됩니다.");
        System.out.println("0을 입력하기 전까지 모든 숫자는 더해집니다.");
        while(true){
            System.out.print("점수 입력 : ");
            input = sc.nextInt();

            if(input == 0) break;
            sum += input;
        }

        System.out.println("합계 : "+ sum);
    }
    
    /*
    * do ~ while 문
    * 조건식이 뒤에 작성된 while문
    * 최소 1회 이상은 반복을 무조건 보장
    * while문이 false여고 최초 1회는 무조건 조건이 true일 때 식을 실행
    * */
    /*
    * 0이 입력될 때까지 정수를 계속 입력 받고 0 입력 시 누적된 합계 출력
    * */
    public void method4(){
        int sum = 0;
        int input = 0;

        do{ // 입력한 값이 0이 아닐 때 반복
            System.out.print("정수 입력 : ");
            input = sc.nextInt();
            sum += input;
        } while(input != 0);{ // input이 0이 아닐 때 반복하기 위한 조건을 작성
            System.out.println("숫자 합계 : "+ sum);
        }
    }

    /*
    * 문자열을 입력 받아 i-- 를 활용하여 거꾸로 출력
    *
    * String.length() + String.charAt() + for문 활용
    * 메서드 기능 명칭 method5()
    * 변수이름: String str int i
    * */
    public void method5(){
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        for (int i = str.length(); i > 0; i--) {
            // 문자열의 길이에서 -1 부터 0까지 감소하며 출력
            // index는 0부터 시작하지만 length는 1부터 시작
            System.out.printf("%c", str.charAt(i-1));
        }
    }
    /*
    * Math.random() // 0.0 <= 값 < 1.0(double 소수 타입 형태)
    * Math.random() * 10 // 0.0 <= 값 < 10.0  (0 이외 1부터 모두 10까지로 범위 증가)
    * (int) Math.random() * 10 // 0 <= 값 <= 10 (정수 형태로 변환)
    * (int) Math.random() * 10 + 1 // 1 <= 값 <= 10 (정수 형태로 변환)
    *
    * 1~10 사이의 랜덤 숫자를 맞출 때까지 반복
    * Math.random() 활용, 난수-> 정수로 형변환
    * (int)(Math.random() * 10) + 1;
    * 
    * 변수 이름 : int answer input
    * 
    * 만약에 정답보다 사용자가 입력한 값이 크다면 -> 정답은 작성한 숫자보다 작습니다.
    * 정답보다 사용자가 입력한 값이 작다면 -> 정답은 작성한 숫자보다 큽니다.
    * 정답이라면 정답입니다! 출력
    * method6()
    * */
    public void method6(){
        int answer  = (int)(Math.random() * 10) + 1; // 1 ~ 10 사이의 정수
        int input = 0; // 사용자가 작성한 숫자를 저장할 데이터 변수이름
        int count = 0; // 정답을 맞추기 위해 시도한 횟수를 저장할 데이터 변수이름

        System.out.println("1 ~ 10 사이의 숫자를 맞혀보세요!");

        while(true){
            System.out.print("숫자 입력 : ");
            input = sc.nextInt();
            count++; // 입력 시도 할 때마다 자동으로 +1씩 증가 한 수 변수 이름에 시도 횟수 저장
            if (input == answer){
                // {}내 구문이  2가지 이상일 경우에는 중괄호 필요!
                System.out.println("정답입니다! 정답 숫자 : " + answer + ", 시도횟수 : " + count);
                break;
            } else if (input > answer){
                System.out.println("정답은 작성한 숫자보다 작습니다.");
            } else {
                System.out.println("정답은 작성한 숫자보다 큽니다.");
            }
        };
    }

    /*
    * 사용자로부터 숫자 하나를 입력받아, 그 수의 구구단을 1부터 9까지 출력
    * 출력할 단을 입력하세요 :
    * for 문을 활용한 반복만 존재
    * 1회 실행 후 종료
    * method7()
    * */
    public void method7(){
        System.out.print("출력할 단을 입력하세요 : ");
        int input = sc.nextInt();
        // 숫자 입력 칸에 숫자가 아닌 문자를 입력하면 에러 발생
        // NOTE 예외처리 (try-catch)를 이용해서 추후 문제가 발생하지 않도록 처리할 예정!!

        for (int i = 1; i <= 9; i++){
            System.out.printf("%d X %d = %2d\n", input, i, input*i);
        }
        System.out.println();
    }

    /*
    * 비밀번호 : "java1234"
    * 사용자가 올바른 비밀번호를 입력할 때까지 입력 받음
    * 입력 횟수가 5회를 초과하면 "접속 차단합니다." 메세지를 출력하고 종료
    * do-while 문 활용 while(true) 조건 입력 횟수가 5회를 초과했을 때 break 활용
    * 시도 횟수(0/5) 비밀번호를 입력하세요 :
    * method8
    * if(input.equals(checkPassword)){} // 문자열 비교 했을 때 일치하는지 확인
    * 
    * 변수이름 : 
    * String checkPassword = "java1234" // 데이터 저장하는 변수이름
    * String input = "" // 입력된 비밀번호 데이터 저장하는 변수이름
    * int attempts = 0; // 시도 횟수 데이터 저장하는 변수이름
    * */
    public void method8(){
        String checkPassword = "java1234";
        String input = "";
        int attempts = 0;

        do {
            System.out.println("시도 횟수(" + attempts + "/5) 비밀번호를 입력하세요 : ");
            input = sc.next();

            if (input.equals(checkPassword)) {
                System.out.println("접속 성공!");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
                attempts++;
            }
            if (attempts >5) {
                System.out.println("비밀번호를 5회 이상 잘못 입력했으므로 접속을 차단합니다.");
                break;
            }
        } while(true);
    }
}
