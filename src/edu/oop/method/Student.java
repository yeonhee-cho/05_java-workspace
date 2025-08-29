package edu.oop.method;

/*
* 속성 정의 클래스
* */
public class Student {
    
    // 속성 필드 변수들
    public static String schoolName = "가나다대학교";
    
    public static final int MIN_VALUE = 0; // 스킬 역량 최소
    public static final int MAX_VALUE = 100; // 스킬 역량 최대

    // 인스턴스 변수
    private String name; // 이름
    private String studentNumber; // 학번
    private char gender; // 성별
    private int java; // 자바 역량
    private int html; // html 역량

    // 메서드
    // 메서드 vs 변수 구분하는 방법 -> 이름 명칭 뒤에 ()가 붙느냐 붙지 않느냐
    // 메서드는 기능 ()가 붙음
    // 변수는 데이터를 담고 있는 공간의 명칭

    // 생성자 오버로딩이 필수 오버로딩 : 같은 기능 명칭 태입, 자료형, 개수가 다르게 사용되는 기능
    // 생성자(기본) = 필수 생성자가 없으면 작성하지 않아도 자동으로 생성
    public Student(){
        /* 추가적으로 동작해야하는 행동을 작성 */
    }

    // 생성자(매개변수가 필수로 작성되야 하는 기능)
    public Student(String name, String studentNumber, char gender) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.gender = gender;
    }

    // setter 사용자에게 전달받은 데이터 값을 저장하는 기능
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public void setHtml(int html) {
        this.html = html;
    }
    
    // getter setter에 저장되어 있는 데이터 값을 사용하기 위해 전달하는 역할
    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public char getGender() {
        return gender;
    }

    public int getJava() {
        return java;
    }

    public int getHtml() {
        return html;
    }
}
