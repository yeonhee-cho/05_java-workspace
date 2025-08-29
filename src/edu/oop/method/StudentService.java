package edu.oop.method;

import java.util.Scanner;

/*
* Student 속성을 활용한 기능 제공 클래스
* */
public class StudentService {
    // 필드
    private Scanner sc = new Scanner(System.in);
    
    /*
    * 메인 메뉴를 제공하는 화면
    * */
    public void displayMenu(){
        int input; // Scanner로 입력받은 메뉴 번호를 저장할 변수 기본값 = 0;
        
        // 학생 객체를 참조할 참조형 변수 2개 선언
        // null 참조할 객체가 없음
        
        Student std1 = new Student("홍길동","112233",'남');
        Student std2 = null; // name, studentNumber gender java html과 같은 속성 변수 명칭 자체가 없는 상태
        // Student std3 = new Student(); // name, studentNumber gender java html과 같은 속성 변수 명칭은 쓸 수 있도록 존재하는 상태

        while(true){
            // Scanner = input textarea 대신 사용 중
            // System = div p span a 등 대신 사용 => 추후 html 과 java를 연결하고 나서 html화면 활용 예정
            // Scanner는 사용하지 않고, System은 개발자가 데이터를 무사히 전달하고, 사용하고 있는지 확인 용도
            // """써줄 때는 왼쪽에 들여쓰기 tab없이 붙여쓰기
            System.out.println("""
=== 학생 관리 프로그램 ===
1. 학생 등록
2. 학생정보 확인
3. 학생 이름 수정
4. Java 공부하기
5. HTML 공부하기
6. Java 역량 비교하기
0. 프로그램 종료
                    """);
            // java언어로만 데이터 풀력과 저장을 확인할 대만 label 태그 사용
            // label 태그 대신 사용
            System.out.print("메뉴 선택: ");
            input = sc.nextInt(); // input type = number 대신 사용

            switch (input){
                case 1:
                    System.out.println("학생을 등록할 변수를 선택하세요.");
                    System.out.println("1 = std1/ 2 = std2  :");
                    int select = sc.nextInt();
                    if(select == 1){
                        System.out.println("이미 학생이 등록되어있는 번호입니다.");
                    } else {
                        System.out.println("학생 등록을 시작하겠습니다.");
                        // 학생 등록을 위한 메서드 호출
                    }
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
            }
        }
    }
}
