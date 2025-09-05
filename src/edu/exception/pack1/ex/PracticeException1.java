package edu.exception.pack1.ex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PracticeException1 {
    /**
     * 기능 명칭 : method1()
     * 두 수를 입력받아 나눈 몫 구하기
     * 정수 입력 1 :
     * 정수 입력 2 :
     *
     * System.out.println(정수 입력 1 / 정수 입력 2); 에 대해 수행하고,
     * 정수 입력 2 : 를 0으로 입력했을 때 발생하는 예외를
     * catch 처리한 후
     * System 출력문을 0으로 숫자를 나눌 수 없습니다.
     *
     * 성공 실패 관계없이 프로그램을 종료합니다.띄우기
     */
    // 단축키 코드 블록을 드래그 해서 잡은 후 Ctrl + Alt + t 를 작성하면
    // if 부터 try-catch while 등 코드 블록에 대한 상황 설정할 수 있는 블록들이 나옴
    public void method1(){
        System.out.println("=".repeat(3) + "두 수를 입력받아 나눈 몫 구하기" + "=".repeat(3));
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 1 : ");
        int input1 = sc.nextInt();
        System.out.print("정수 입력 2 : ");
        int input2 = sc.nextInt();
        try{
            // 모든 코드를 작성하기 보다는 문제가 발생할 것 같은 구문만 주로 작성
            System.out.println("나눈 값 결과 : " + input1 / input2);
        } catch (ArithmeticException e){
            System.out.println("a의 값 : " + input1);
            System.out.println("a의 값 : " + input2);
            System.out.println("0으로 숫자를 나눌 수 없습니다.");
            // 다른 방법을 시도하시겠습니까? + 나 * 와 같은 행동을 유도할 수 있음
        } catch (InputMismatchException e) {
            System.out.println("숫자 데이터만 가능합니다.");
        } catch (Exception e) {
            System.out.println("개발자가 예기치 못한 문제가 발생되었습니다.");
            System.out.println("회사에 오류에 대한 보고서 전달하기 YES/NO");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }

    /**
     * 문제 2: 배열 값 조회
     * 기능명칭 : method2()
     * 크기가 5인 정수 배열을 생성하고 {10, 20, 30, 40, 50} 으로 초기화
     * 사용자에게 "조회할 인덱스 번호 입력 : " 메시지 출력 후 입력받기
     *
     * System.out.println("배열의 " + 인덱스 + "번째 값 : " + arr[인덱스]);
     * 에 대해 수행하고,
     * 배열 범위를 벗어난 인덱스 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("배열의 범위를 벗어났습니다. (0~4 사이의 숫자를 입력하세요)");
     *
     * 성공 실패 관계 없이 "배열 조회를 완료했습니다." 출력
     */
    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(3) + "배열 값 조회" + "=".repeat(3));
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("조회할 인덱스 번호 입력 : ");
        int index = sc.nextInt();

        // java.lang.IndexOutOfBoundsException: Index 9 out of bounds for length 5
        try {
            System.out.println("배열의 " + index + "번째 값 : " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어났습니다. (0~4 사이의 숫자를 입력하세요)");
        } catch (Exception e){
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("배열 조회를 완료했습니다.");
        }

    }

    /**
     * 문제 3: method3()
     * 기능명칭 : 문자열을 숫자로 변환
     * 사용자에게 "숫자 형태의 문자열 입력 : " 메시지 출력 후 입력받기
     *
     * int number = Integer.parseInt(입력받은문자열);
     * System.out.println("변환된 숫자 : " + number);
     * System.out.println("변환된 숫자 * 2 = " + (number * 2));
     * 에 대해 수행하고,
     * 숫자가 아닌 문자열 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("숫자 형태가 아닙니다. 올바른 숫자를 입력해주세요.");
     *
     * 성공 실패 관계 없이 "문자열 변환 작업을 종료합니다." 출력
     */
    public void method3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(3) + "문자열을 숫자로 변환" +  "=".repeat(3));
        System.out.print("숫자 형태의 문자열 입력 : " );
        String inputStr = sc.nextLine();

        // java.lang.NumberFormatException: For input string: "문자"
        try {
            int number = Integer.parseInt(inputStr);
            System.out.println("변환된 숫자 : " + number);
            System.out.println("변환된 숫자 * 2 = " + (number * 2));
        } catch (NumberFormatException e) {
            System.out.println("숫자 형태가 아닙니다. 올바른 숫자를 입력해주세요.");
        } catch (Exception e){
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("문자열 변환 작업을 종료합니다.");
        }
    }

    /**
     * 문제 4: method4()
     * 기능명칭 : Scanner로 정수 입력받기
     * 사용자에게 "나이를 입력하세요 : " 메시지 출력 후 정수로 입력받기
     *
     * int age = sc.nextInt();
     * System.out.println("입력된 나이 : " + age + "세");
     * System.out.println("10년 후 나이 : " + (age + 10) + "세");
     * 에 대해 수행하고,
     * 정수가 아닌 값(문자, 실수 등) 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("정수만 입력 가능합니다. 다시 실행해주세요.");
     *
     * 성공 실패 관계 없이 "나이 입력 프로그램을 종료합니다." 출력
     */
    public void method4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(3) + "Scanner로 정수 입력받기" +  "=".repeat(3));
        System.out.print("나이를 입력하세요 : ");

        // java.util.InputMismatchException
        try {
            int age = sc.nextInt();
            System.out.println("입력된 나이 : " + age + "세");
            System.out.println("10년 후 나이 : " + (age + 10) + "세");
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력 가능합니다. 다시 실행해주세요.");
        } catch (Exception e){
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("나이 입력 프로그램을 종료합니다.");
        }
    }

    /**
     * 문제 5: method5()
     * 기능명칭 : 문자열 길이 체크
     * 사용자에게 "문자열을 입력하세요 : " 메시지 출력 후 입력받기
     * 만약 입력값이 null이면 강제로 NullPointerException 발생시키기
     * (입력받은 후 inputStr = null; 로 설정)
     *
     * System.out.println("입력된 문자열 : " + inputStr);
     * System.out.println("문자열의 길이 : " + inputStr.length());
     * 에 대해 수행하고,
     * NullPointerException 발생 시
     * catch 처리 한 후
     * System.out.println("문자열이 null입니다. 처리할 수 없습니다.");
     *
     * 성공 실패 관계 없이 "문자열 길이 체크를 완료합니다." 출력
     */
    public void method5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(3) + "문자열 길이 체크" +  "=".repeat(3));
        System.out.print("문자열을 입력하세요 : ");
        String inputStr = sc.nextLine();

        // 강제로 null 설정
        inputStr = null;

        try {
            System.out.println("입력된 문자열 : " + inputStr);
            System.out.println("문자열의 길이 : " + inputStr.length());
        } catch (NullPointerException e) {
            System.out.println("문자열이 null입니다. 처리할 수 없습니다.");
        } catch(Exception e){
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("문자열 길이 체크를 완료합니다.");
        }
    }

    /**
     * 문제 6: method6()
     * 기능명칭 : 파일명 확장자 추출
     * 사용자에게 "파일명을 입력하세요 (예: test.txt) : " 메시지 출력 후 입력받기
     *
     * String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
     * System.out.println("파일명 : " + fileName);
     * System.out.println("확장자 : " + extension);
     * 에 대해 수행하고,
     * '.'이 없는 파일명 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("올바른 파일명이 아닙니다. 확장자가 포함된 파일명을 입력하세요.");
     *
     * 성공 실패 관계 없이 "파일명 처리를 완료했습니다." 출력
     */
    public void method6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("파일명을 입력하세요 (예: test.txt) : ");

        try {
            String fileName = sc.nextLine();
            // fileName.lastIndexOf('.') == -1
            int dotIndex = fileName.lastIndexOf(".");
            System.out.println("dotIndex 번호 확인 : " + dotIndex);
            // . 없거나, 마지막 문자가 . 인 경우 예외 발생
            // 만약에 . 이 존재하거나, 맨 마지막에 위치한 글자가 . 이라면
            // 아래 기능을 실행하지 못하도록 예외 상황을 프로그램 개발자가 발생시킬 것임
            if (dotIndex == -1){
                throw new StringIndexOutOfBoundsException("확장자가 존재하지 않습니다.");
                // 오류 : Exception in thread "main" java.lang.StringIndexOutOfBoundsException: 확장자가 존재하지 않습니다.
            }
            String extension = fileName.substring(dotIndex + 1);

            // 점이 없으면 dotIndex가 -1이므로 charAt(0)에서 빈 문자열 발생해서 예외 유도
            extension.charAt(0);
            System.out.println("파일명 : " + fileName);
            System.out.println("확장자 : " + extension);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("올바른 파일명이 아닙니다. 확장자가 포함된 파일명을 입력하세요.");
        } catch (Exception e){
            System.out.println("예기치 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("파일명 처리를 완료했습니다.");
        }
    }
}
