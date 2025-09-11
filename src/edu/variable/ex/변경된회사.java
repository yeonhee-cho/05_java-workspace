package edu.variable.ex;

public class 변경된회사 {
    public static final String 회사이름 = "변경된회사";
    public static final String 회사주소 = "서울특별시 성동구 성수동";
    public static int 사원수 = 5;
    private String 이름;
    private String 부서;
    private int 연봉;

    public 변경된회사() {
    }

    public 변경된회사(String 이름, String 부서, int 연봉) {
        this.이름 = 이름;
        this.부서 = 부서;
        this.연봉 = 연봉;
    }

    @Override
    public String toString() {
        return "변경된회사{" +
                "이름='" + 이름 + '\'' +
                ", 부서='" + 부서 + '\'' +
                "\n, 연봉=" + 연봉 +
                '}';
    }
}
