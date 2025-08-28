package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {
    public static void main(String[] args) {
        System.out.println("=== 게스트하우스 방문자 관리 시스템 ===");

        GuestHouse guest = new GuestHouse();
        
        /*
        * Scanner 이용해서 고객 정보 저장
        * while문 활용해서 0 번을 입력하면 고객 정보 입력 종료
        * */

        Scanner sc = new Scanner(System.in);

        // 방문자 정보 설정
        guest.setGuestName("김여행");
        guest.setCheckInDate("2024-08-27");
        guest.setRoomNumber(201);

        System.out.println("guest이 보이는 총 방문자 수 : " + guest.totalCount); // GuestHouse.totalCount

        // 체크인 진행
        System.out.println("=== 체크인 후 방문자 수 변화 ===");
        guest.checkIn(); // 방문자 수 1 증가
        System.out.println("guest이 보이는 총 방문자 수 : " + guest.totalCount); // GuestHouse.totalCount

        // 올바른 static 접근 방식
        System.out.println("전체 방문자 수 : " + GuestHouse.totalCount);

        System.out.println("=== 게스트 하우스 공통 정보 ==="); // 게스트 하우스 자체에서 제공
        System.out.println("게스트하우스명 : " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("Wi-Fi 비밀번호 : " + GuestHouse.WIFI_PASSWORD);

        System.out.println("=== 게스트 하우스 운영 규정(static final) ===");
        System.out.println("체크인 시간 : " + GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간 : " + GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일수 : " + GuestHouse.MAX_STAY_DAYS + "일");
        System.out.println("최소 숙박일수 : " + GuestHouse.MIN_STAY_DAYS + "일");

        System.out.println("=== 방문자별 개별 정보 ===");
        guest.guestInfo(); // 게스트 하우스가 공통으로 제공하는 것이 아닌 방문자 개별로 알아야하는 정보
    }
}
