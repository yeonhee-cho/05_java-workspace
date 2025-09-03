package edu.polymorphism.pack3;

/**
 * 직원의 자식 클래스로 반드시 구현해야하는 기능들을 추가해서 문서 작성을 완료하도록 설정할 것
 *
 * extends 부모 클래스  부모는 오직 하나!
 * implements 구현해야하는기능들, ... 2개 이상 작성 가능
 * 
 * implements는 반드시 extends 뒤에 와야하는 것이 아니라 단독으로도 사용가능
 * 
 * 상속을 받지 않아도 되는 무서에 필수적으로 작성해야하는 기능들이 존재할 때 사용
 */
public class 개발자 extends 직원 implements 업무수행기능들{
    // class 개발자에서 implements 업무수행기능들 {} 로 상속이 필요하지 않는 경우 
    // 필히 구현해야하는 기능들에 대한 문서만 작성하기 설정을 할 수 있음
    private String 프로그래밍언어;

// 개발자라는 형태의 객체를 컴퓨터에 띄울 때 클라이언트 고객한테 반드시 전달받아야하는 데이터를 매개변수 명칭으로 설정
    public 개발자(String name, int salary, String 프로그래밍언어) {
        // super 는 직원 클래스에 작성된 필드들로
        // 직원 클래스에 작성된 this.position에 "dev"라는 명칭을 전달하겠다.라고 개발자가 설정
        super(name, "dev", salary);
        this.프로그래밍언어 = 프로그래밍언어; 
        // java코드에서 클라이언트가 작성한 데이터를 가지고 있을 변수 = 클라이언트가 작성해서 java프로그램에서 활용할 수 있도록 작성한 데이터
    }

    @Override
    public void work() {
        System.out.println(getName() + "개발자가 " + 프로그래밍언어 + "으로 코딩하고 있습니다.");
    }

    @Override
    public void metting() {
        System.out.println(getName() + "개발자가 개발회의에 참석합니다.");
    }

    // 개발자만의 고유 기능
    public void 코딩(){
        System.out.println(getName() + "개발자가 새로운 기능을 구현합니다.");
    }
}
