package edu.collection.pack1.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOrderRun {
    public static void main(String[] args) {
        // 여기서 menuOrder() 메서드를 호출해보세요
        menuOrder();
    }

    /**
     * 🍔 햄버거 가게 주문 시스템 만들기 🍔
     *
     * 요구사항:
     * 1. 메뉴판 리스트를 만들고 ["빅맥", "상하이버거", "치킨버거", "새우버거", "불고기버거"] 추가 -> 직접
     * 2. 주문 리스트를 만들어서 고객이 주문한 메뉴들을 저장 -> 스캐너 이용, 키보드 자판 전달받아 저장
     * 3. while문을 사용해서 계속 주문받기
     *
     * 메뉴 기능:
     * 1번 - 메뉴판 보기 (전체 메뉴 출력)
     * 2번 - 주문하기 (메뉴 이름 입력받아서 주문리스트에 추가)
     * 3번 - 주문내역 확인 (지금까지 주문한 메뉴들 출력)
     * 4번 - 주문 취소 (주문리스트에서 특정 메뉴 제거)
     * 0번 - 주문 완료 (프로그램 종료)
     */
    public static void menuOrder() {
        // 1단계 - 메뉴판 리스트 만들기
        List<String> menuList = new ArrayList<>();
        // 메뉴 5개 추가해주세요
        menuList.add("빅맥");
        menuList.add("상하이버거");
        menuList.add("치킨버거");
        menuList.add("새우버거");
        menuList.add("불고기버거");

        // 2단계 - 주문 리스트 만들기
        List<String> orderList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        // 3단계 - while 반복문으로 메뉴 시스템 만들기
        while(true) {
            // 메뉴 출력
            System.out.println("\n🍔===== 햄버거 가게 주문 시스템 =====🍔");
            System.out.println("1️⃣ 메뉴판 보기");
            System.out.println("2️⃣ 주문하기");
            System.out.println("3️⃣ 주문내역 확인");
            System.out.println("4️⃣ 주문 취소");
            System.out.println("0️⃣ 주문 완료");
            System.out.print("선택 ➤ ");

            choice = sc.nextInt();
            sc.nextLine(); // 개행문자 제거

            switch(choice) {
                case 1:
                    // 4단계 - 메뉴판 보기 구현
                    System.out.println("\n===== 메뉴판 =====");
                    // for문으로 menuList의 모든 메뉴를 "1. 빅맥" 형태로 출력해주세요
                    for(int i = 0; i < menuList.size(); i++) {
                        System.out.println((i + 1) + ". " + menuList.get(i));
                    }
                    break;

                case 2:
                    // 5단계 - 주문하기 구현
                    System.out.println("\n===== 주문하기 =====");
                    System.out.print("주문할 메뉴를 입력하세요: ");
                    String orderMenu = sc.nextLine(); // orderMenu는 사용자가 작성한 키보드 자판 데이터를 저장하고 있는 공간

                    // menuList에 입력받은 메뉴가 있는지 확인 (contains 사용)
                    // 있으면 orderList에 추가하고 "○○ 주문되었습니다!" 출력
                    // 없으면 "존재하지 않는 메뉴입니다!" 출력
                    if(menuList.contains(orderMenu)) {
                        orderList.add(orderMenu);
                        System.out.println(orderMenu + " 주문되었습니다!");
                    } else {
                        System.out.println("존재하지 않는 메뉴입니다!");
                    }
                    break;

                case 3:
                    // 6단계 - 주문내역 확인 구현
                    System.out.println("\n===== 주문내역 =====");
                    // orderList가 비어있으면 "주문한 메뉴가 없습니다." 출력
                    // 비어있지 않으면 for문으로 모든 주문내역 출력
                    // 마지막에 "총 ○개 주문하셨습니다." 출력 (size() 사용)
                    System.out.println(orderList.isEmpty());
                    if(orderList.isEmpty()){
                        System.out.println("주문한 메뉴가 없습니다.");
                    } else {
                        // 비어있지 않을 때
                        for(int i = 0; i < menuList.size(); i++) {
                            System.out.println((i + 1) + ". " + menuList.get(i));
                        }
                        System.out.println("총 "+ orderList.size() + "개 주문하셨습니다.");
                    }
                    break;

                case 4:
                    // 7단계 - 주문 취소 구현 (도전 과제!)
                    System.out.println("\n===== 주문 취소 =====");
                    System.out.print("취소할 메뉴를 입력하세요: ");
                    String cancelMenu = sc.nextLine();

                    // orderList에 취소할 메뉴가 있는지 확인 (contains 사용)
                    if(orderList.contains(cancelMenu)) {
                        orderList.remove(cancelMenu);
                    // 있으면 remove로 제거하고 "○○ 주문이 취소되었습니다!" 출력
                        System.out.println(cancelMenu +" 주문이 취소되었습니다.!");
                    } else {
                    // 없으면 "주문하지 않은 메뉴입니다!" 출력
                        System.out.println("주문하지 않은 메뉴입니다!");
                    }
                    break;

                case 0:
                    System.out.println("\n🎉 주문이 완료되었습니다! 🎉");
                    System.out.println("맛있게 드세요~ 😋");
                    return; // 프로그램 종료

                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요!");
            }
        }
    }
}
