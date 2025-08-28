package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {
    public static void main(String[] args) {
        System.out.println("=== 게스트하우스 방문자 관리 시스템 ===\n");
        // 올바른 static 접근 방식
        System.out.println("전체 방문자 수 : " + GuestHouse.totalCount);

        System.out.println("\n=== 게스트 하우스 공통 정보 ==="); // 게스트 하우스 자체에서 제공
        System.out.println("게스트하우스명 : " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("Wi-Fi 비밀번호 : " + GuestHouse.WIFI_PASSWORD);

        System.out.println("\n=== 게스트 하우스 운영 규정(static final) ===");
        System.out.println("체크인 시간 : " + GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간 : " + GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일수 : " + GuestHouse.MAX_STAY_DAYS + "일");
        System.out.println("최소 숙박일수 : " + GuestHouse.MIN_STAY_DAYS + "일");

        
        /*
        * Scanner 이용해서 고객 정보 저장
        * while문 활용해서 0 번을 입력하면 고객 정보 입력 종료
        * */

        // 스캐너
        Scanner sc = new Scanner(System.in);
        
        // 방문자 정보 입력받기
        while (true){
            System.out.println("\n=== 고객 정보 입력 ===");
            System.out.println("0번 입력 시 고객 정보 입력을 종료합니다.");
            System.out.print("고객 이름 : ");
            String name  = sc.nextLine();

            if(name.equals("0")){ // 0을 String으로 입력받고, 0이 String 형태로 입력된게 맞으면 true
                System.out.println("고객 정보 입력 시스템을 종료합니다.");
                break;
            }

            System.out.print("체크인 날짜(예: 2025-01-01) : ");
            String checkInDate = sc.nextLine();
            System.out.print("방 번호 : ");
            int roomNumber = sc.nextInt();
            
            sc.nextLine(); // nextInt 이후 생성되는 enter 처리

            GuestHouse guest = new GuestHouse();

            // 방문자 정보 설정
            guest.setGuestName(name);
            guest.setCheckInDate(checkInDate);
            guest.setRoomNumber(roomNumber);
            /*
            * 필요한 타입 : class 파일에 속성 명칭 왼쪽에 작성한 자료형 타입
            * int
            * 제공된 타입 : class 파일이랑 일치하지 않고, 추후 class 내부에 작성한 변수 이름에 데이터를 저장하겠다 설정
            * String
            * 클래스에 작성한 데이터 타입을 변경할 것인가? 클래스 내부에 작성한 변수 이름에 알맞게
            * 전달할 데이터 타입을 수정할 것인가?
            *
            * 클래스에 작성한 초기 데이터 타입은 수정 자제
            * */

            System.out.println("guest가 보이는 총 방문자 수 : " + guest.totalCount);

            // 체크인 진행
            System.out.println("=== 체크인 후 방문자 수 변화 ===");
            guest.checkIn(); // 방문자 수 1 증가
            System.out.println("guest가 보이는 총 방문자 수 : " + guest.totalCount);
            
            guest.guestInfo(); // 입력된 고객 정보
        }
        sc.close(); // 스캔 출력 종료
    }
}
