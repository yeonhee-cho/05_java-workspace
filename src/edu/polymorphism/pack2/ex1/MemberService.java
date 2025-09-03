package edu.polymorphism.pack2.ex1;

public class MemberService {
    // public staic void main(){} 이외에 객체 생성은 모두 class 아래에 바로 작성
    // 왜냐하면 다른 메서드에서도 객체 할당한 변수이름을 사용할 수 있기 때문
    // method 기능명칭 내부에 new 클래스이름();을 작성해도 문제되진 않으나, 동일한 코드를 지속적으로 작성할 수 있기 때문
    // 개발자의 편의를 위해 class 아래에 작성
    일반Member 일반회원 = new 일반Member("M001", "김일반", "kim@email.com");
    프리미엄Member 프리미엄회원 = new 프리미엄Member("P001", "이프리미엄", "lee@email.com", "배송비할인쿠폰");
    VIPMember VIP회원 = new VIPMember("V001", "박브이아피", "park@email.com", "배송비무료쿠폰","무료반품");

    // 나중에 html에서 작성해야할 내용, html과 연결하기 전이기 때문에 Java에서 임의적으로 System 출력문을 통해 진행
    public void display(){
        System.out.println("=== 회원 시스템 ===");
        System.out.println("프리미엄 회원은 [배송비 할인 쿠폰]과 [반품비 할인 쿠폰] 중 선택할 수 있습니다.");
        System.out.println("VIP 회원은 [배송비 무료 쿠폰]과 [반품비 무료 쿠폰] 중 선택할 수 있으며," + 
                "\n혜택으로는 [무료 반품]과 [포인트 10000 적립]이 존재합니다.");
        System.out.println();
        
        // 다형성을 활용해서 Member 배열을 생성하고, 각 멤버별로 순차적으로 순환
        // 배열로 순회할 때 자식 클래스의 공통 상속 클래스인 부모 클래스로 배열 생성
        // 부모클래스[] 부모클래스변수이름 = {자식클래스1, 자식클래스2, 자식클래스3}
        Member[] 회원들 = {일반회원, 프리미엄회원, VIP회원};

        // 회원들은 향상된 for문을 활용해서 일반회원부터 프리미엄회원, VIP회원까지 순차적으로 개발자가 원하는 기능 실행
        for(Member 회원 : 회원들){ // 회원들 리스트에 작성된 모든 회원들을 회원이라는 변수이름에 하나씩 넣어서 기능 실행
            // 공통 메서드 사용
            회원.login();
            // 물건 구매
            double 물건원래가격 = 10000;
            double 할인된최종가격 = 물건원래가격 * (1- 회원.할인율()); // 원가에서 할인된 금액 만큼 금액 제외하고 표기

            System.out.println("원가 : " + 물건원래가격 + "원"); // ctrl + space 클릭하면 추천 키워드나 메서드 출력
            System.out.println("할인된 최종가격 : " + 할인된최종가격 + "원");

            // 일반회원에는 존재하지 않고, 프리미엄과 VIP회원에는 존재하는 변수이름이 있음
            // 프리미엄에서 존재하는 것과 VIP 존재하는 것을 따로 출력하고 싶다면
            회원.쿠폰과혜택();

            회원.logout();
            System.out.println("---------------------------------\n");

        }

    }
}
