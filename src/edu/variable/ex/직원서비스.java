package edu.variable.ex;


import static edu.variable.ex.가나다회사.회사이름;
import static edu.variable.ex.변경된회사.회사주소;
import static edu.variable.ex.가나다회사.사원수;

public class 직원서비스 {
    // static으로 작성한 필드 명칭은 앞에 클래스 명칭이 없어도 됨
    // 중복되는 명칭의 필드들이 존재한다면
    // 문서 명칭으로 구분지어서 사용

    // 변경된회사 CLASS 문서파일과 가나다회사 CLASS 문서 파일에 모두 동일하게
    // static으로 처리된 동일한 이름의 변수 이름이 존재함

    /**
     * 클래스 명칭을 작성하지 않고,
     * 클래스 내부에 존재하는 static 변수 이름을 그대로 작성해서 사용하는 경우
     * 아래와 같이 혼란스러운 상황이 발생함
     * 회사정보가 가나다회사 & 변경된회사 각 문서에 작성된 데이터가 혼합되어 출력되는 문제가 발생
     *
     * import static edu.variable.ex.가나다회사.회사이름;
     * import static edu.variable.ex.변경된회사.회사주소;
     * import static edu.variable.ex.가나다회사.사원수;
     *
     * 위 와 같이 import 해서 특정 데이터를 가져오는 것이 아니라 static이 작성된
     * 클래스명칭.static변수명칭과 같은 형태로 어떤 문서에서 가져오는 데이터인지 명확히 작성해주는 것이 좋음
     */
    public static void 회사정보(){
        System.out.println("회사 : " + 회사이름);
        System.out.println("주소 : " + 회사주소);
        System.out.println("총 사원 수 : " + 사원수);
    }

    public static void 가나다회사정보(){
        System.out.println("회사 : " + 가나다회사.회사이름);
        System.out.println("주소 : " + 가나다회사.회사주소);
        System.out.println("총 사원 수 : " + 가나다회사.사원수);
    }

    public static void 변경된회사정보(){
        System.out.println("회사 : " + 변경된회사.회사이름);
        System.out.println("주소 : " + 변경된회사.회사주소);
        System.out.println("총 사원 수 : " + 변경된회사.사원수);
    }
}
