package edu.practice.day4;

public class Student {
    private String name;
    private String studentId;
    private int score;

    // 기본생성자
    public Student() {
    }

    // 필수생성자
    public Student(String name, String studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }

    public String inPass(){
        return score >= 60 ? "합격" : "불합격";
        /*
        * if(score >= 60){
        *     return "합격"; // 각각의 결과를 return으로 반환
        * } else{
        *     return "불합격"; // 각각의 결과를 return으로 반환
        * }
        */
    }

    // 학생 정보 출력
    public void displayInfo(){
        System.out.printf("학생명: %s\n학번: %s\n점수: %d점\n결과: %s\n", getName(), getStudentId(), getScore(), inPass());
        // 같은 클래스 내에서 메서드를 호출할 때
        // return 값이 존재할 때
        // 클래스 명칭이나 객체 변수 명칭을 생략하고 호출할 수 있다.
    }
    
    // 큰 거부터 퍼블릭 > 프로텍티드 > 디폴트 > 프라이빗
    // static -> 클래스
    // final 변하지 않는 값 
    // 생성자 : 객체를 형성하기 위한 것
    // 오버로딩? 
    // getter와 setter 캡슐화
    
}
