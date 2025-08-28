package edu.oop.field.pack3.ex;
/*
* (중요) void와 void 아닌 것의 차이!!
* 전달하는 값 없이 실행
*
* return
*
* static 최초 1회 초기화 공유 위해
* final 변경 안하는 것 상수
*
* setter(저장) getter(전달) 사용하는 이유 "캡슐화" 처리
*
* 상수 변수 명칭을 어떤 식으로 입력
* 상수 : 대문자
* 변수 : 카멜표기법
*
* this.변수이름
* */

/*
* === 가나다 온라인 쇼핑몰 시스템 시작 ===
*
* 김쇼핑님이 회원가입하셨습니다. (회원번호: user001)
* 박구매님이 회원가입하셨습니다. (회원번호: user002)
* 이주문님이 회원가입하셨습니다. (회원번호: user003)
*
* ----- 회원가입 후 통계 -----
전체 회원 수: 3명
일일 방문자 수: 6명

=== 쇼핑몰 운영 정보 ===
쇼핑몰명: 가나다 온라인 쇼핑몰
고객센터: 1588-1234
최대 장바구니 수: 50개
최소 비밀번호 길이: 8자
* */
public class ShoppingMallTestRun {
    public static void main(String[] args) {
        // main에서 가장 최초로 실행하는 것은 static!!

        // 1. 3명의 회원 객체 생성
        // ShoppingMallMember member1 = new ShoppingMallMember(); 설명 아래로
        // - ShoppingMallMember : 자료형은 member1 공간의 크기
        // - member1 : 공간의 명칭
        // - new ShoppingMallMember(); : member1 이라는 공간 내부에 작성될 수 있는 데이터와 사용가능한 기능을 member1에 넣어서 사용
        ShoppingMallMember member1 = new ShoppingMallMember();
        ShoppingMallMember member2 = new ShoppingMallMember();
        ShoppingMallMember member3 = new ShoppingMallMember();

        // 2. 회원 정보 설정
        member1.setMemberId("user001");
        member1.setMemberName("김쇼핑");
        member1.setEmail("kim@email.com");

        member2.setMemberId("user002");
        member2.setMemberName("박구매");
        member2.setEmail("park@email.com");

        member3.setMemberId("user003");
        member3.setMemberName("이주문");
        member3.setEmail("lee@email.com");

        // 3. 회원가입 및 방문 시뮬레이션
        System.out.println("회원가입");
        member1.joinMember();
        member2.joinMember();
        member3.joinMember();

        // 4. 사이트 방문
        member1.visitSite();
        member1.visitSite(); // member2 웹사이트 두 번 반복
        member2.visitSite();
        member3.visitSite();
        member3.visitSite();
        member3.visitSite(); // member3 웹사이트 세 번 방문

        System.out.println("김쇼핑님이 회원가입하셨습니다. (회원번호: user001)");
        System.out.println("\n----- 회원가입 후 통계 -----");
        System.out.printf("전체 회원 수: %d명\n", ShoppingMallMember.totalMemberCount);
        System.out.printf("일일 방문자 수: %d명\n", ShoppingMallMember.dailyVisitorCount);
        System.out.println("\n=== 쇼핑몰 운영 정보 ===");
        System.out.printf("쇼핑몰명: %s\n",ShoppingMallMember.SHOPPING_MALL_NAME);
        System.out.printf("고객센터: %s\n",ShoppingMallMember.SERVICE_CENTER_NUMBER);
        System.out.printf("최대 장바구니 수: %d개\n",ShoppingMallMember.MAX_CART_ITEMS);
        System.out.printf("최소 비밀번호 길이: %d자\n",ShoppingMallMember.MIN_PASSWORD_LENGTH);
        
        // 장바구니와 개별 회원정보 기능 활용하기
        System.out.println("\n*********** 장바구니 정보 ***********");
        member1.addToCart(10); // member1은 장바구니에 10개의 아이템을 담음
        member2.addToCart(25); // member2은 장바구니에 25개의 아이템을 담음
        member3.addToCart(60); // member3은 장바구니에 60개의 아이템을 담음
        // 장바구니는 최대 50개 담을 수 있으므오 장바구니 초과 조회

        System.out.println("\n*********** 개별 회원 정보 ***********");
        member1.printMemberInfo();
        System.out.println();
        member2.printMemberInfo();
        System.out.println();
        member3.printMemberInfo(); // member3은 장바구니 갯수 초과로 물건을 담을 수 없어 0으로 조회

        /*
        * Q1. member1으로 호출 했을 때 왜 totalMemberCount에 노란 경고가 나타나며 자동 완성이 안될까요?
        * -> static 변수는 클래스명으로 접근해야 해서
        *
        * Q2. static 초기화 블록은 언제 실행될까요?
        * -> 클래스가 처음 로딩될 때 한 번만
        *
        * Q3. SHOPPING_MALL_NAME을 static final로 선언하는 이유는?
        * -> 모든 객체가 공유하는 변경 불가능한 상수이므로
        *  */
    }
}
