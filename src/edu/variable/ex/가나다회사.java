package edu.variable.ex;

public class 가나다회사 {
    // 클래스 변수
    public static final String 회사이름 = "가나다회사";
    public static final String 회사주소 = "서울특별시 성동구 성수동";
    public static int 사원수 = 5;

    // 인스턴스 변수
    private String 이름;
    private String 부서;
    private int 연봉;

    // 메서드 생성자 - 초기값이 없어도 객체 생성 가능
    public 가나다회사() {
    }

    // 메서드 생성자 - 파라미터를 충족해야 객체 생성 가능
    public 가나다회사(String 이름, String 부서, int 연봉) {
        this.이름 = 이름;
        this.부서 = 부서;
        this.연봉 = 연봉;
    }

    @Override
    public String toString() {
        return "가나다회사{" +
                "이름='" + 이름 + '\'' +
                ", 부서='" + 부서 + '\'' +
                ", 연봉='" + 연봉 + '\'' +
                '}';
    }
}
