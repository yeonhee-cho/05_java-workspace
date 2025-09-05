package edu.exception.pack1;

public class ExceptionRun1 {
    public static void main(String[] args) {
        ExceptionEx1 ex1 = new ExceptionEx1();
        // ex1.method1();
        // java.lang.ArrayIndexOutOfBoundsException:
        // Index 4 out of bounds for length 4
        // 프로그램 실행 중 위와 같이 예외 상황이 발생하는 경우
        // 예외 상황에 맞는 코드가 수행되며
        // 자바 개발자가 만들어놓은 예외 출력문을 던진 후 실행종료됨

        // 자바 개발자가 만든 폴더위치와 폴더 내 존재하는 파일
        // java.lang.ArrayIndexOutOfBoundsException
        // 배열과 숫자 관련해서 문제가 발생하면 Index 숫자 out of bounds for length 숫자
        // 로 어떤 상황인지 개발자한체 문제되는 내용을 전달할 수 있도록 만들어놓음
        // ex1.method2();
        // ex1.method3();
        ex1.method4();

    }
}
