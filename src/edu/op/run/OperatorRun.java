package edu.op.run;

import edu.op.ex.OperatorEx;

/*
* 실행용 클래스
* */
public class OperatorRun {
    // static 이 작성된 기능이나 변수 이름 메모리에서 프로그램을 사용할 때 상시 사용 처럼
    // 메모리 공간을 차지하는 예약어

    /*
    * stack (빠른 비서 같은 존재)
    * - 어디에 어떤 기능이 존재하는지 주소만 기억
    * - 기능(행동_ 역할이 종료되면 버리고, 다른 기능을 수행할 준비
    * - 실질적으로 기능이 존재하는 주소만 알고있음
    * Heap (창고지기)
    * - Stack에서 주소값으로 연결되어 들어가면 존재하는 실제 물건들의 위치
    * - 누군가 클래스로 만들어진 객체를 사용하면 보관, 사용하지 않으면 창고 공간을 차지하는 불필요한 객체나 기능으로 판단하여 버림
    * - 실제 데이터를 저장하는 공간(크기 다양)
    * */
    public static void main(String[] args) {
        /*
        * OperatorEx = 코드가 작성된 클래스 이름(=파일명)
        * op 참조 변수 이름
        * new = 프로그램을 실행하기 위하여 새로 생성해서 사용
        * */
        // 자료형 변수이름 = 새로운 객체(손님객 몸체) 생성
        OperatorEx op = new OperatorEx();
        // ex 폴더에서 만들어 놓은 OperatorEx 파일을 가져와서 사용
        // 가져와서 OperatorRun 클래스 내부에서 사용할 때
        // op 별칭을 붙여준 후 사용
        // 안 붙여도 됨, 기존에 어떤 개발자가 만들어놓은 파일을 가져와서 파일에 작성된 기능이나 변수 값을 활용해서 코딩하려 해
        // new OperatorEx().test();

        // op.test(); // 새로운 객체를 생성해서 객체 내부에 존재하는 기능을 사용하겠다.
        // op.method1();
        // op.method2();
        // op.method3(); // OperatorEx 내부에 존재하는 method1(), method2(), method3() 기능을 op별칭으로 호출하여 사용
        op.method4();
    }
}
