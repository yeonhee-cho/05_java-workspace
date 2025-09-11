package edu.variable.ex;

public class 직원실행 {
    public static void main(String[] args) {
        가나다회사 직원1 = new 가나다회사("김개발", "개발팀",3000);
        가나다회사 직원2 = new 가나다회사("이기획","기획팀",2800);
        가나다회사 직원3 = new 가나다회사("박디자인","디자인팀",2600);

        System.out.println(직원1.toString());
        System.out.println(직원2.toString());
        System.out.println(직원3.toString());

        직원서비스.가나다회사정보();
        직원서비스.변경된회사정보();
    }
}
