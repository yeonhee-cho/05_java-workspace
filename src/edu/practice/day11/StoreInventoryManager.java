package edu.practice.day11;

import java.util.*;

public class StoreInventoryManager {
    public void method3() {
        Map<String, Integer> inventoryMap = new HashMap<>(); // 상품명 : 재고수량
        Map<String, Integer> priceMap = new HashMap<>();     // 상품명 : 가격
        Scanner sc = new Scanner(System.in);

        // 초기 재고 데이터
        inventoryMap.put("사과", 50);
        inventoryMap.put("바나나", 30);
        inventoryMap.put("오렌지", 0); // 재고 없음
        priceMap.put("사과", 1000);
        priceMap.put("바나나", 1500);
        priceMap.put("오렌지", 2000);

        try {
            // 상품명 존재 여부 확인
            System.out.print("구매할 상품명을 입력하세요: ");
            String productName = sc.nextLine();
            // 수량 입력 시 NumberFormatException 처리
            if(!inventoryMap.containsKey(productName)){
                throw new NumberFormatException("해당 상품이 없습니다.");
            }

            System.out.print("구매할 수량을 입력하세요: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();

            int 현재수량 = inventoryMap.get(productName);
            // 재고 부족 시 RuntimeException 발생 및 처리
            if(현재수량 < quantity){
                throw new RuntimeException("상품 개수가 부족합니다. 보유 상품 개수 : " + 현재수량 + "개");
            }

            // 재고 차감 및 총 가격 계산
            if(quantity <= 0){
                System.out.println("0이하는 작성할 수 없습니다.");
            } else if(!inventoryMap.containsKey(productName) || 현재수량 < quantity){
                System.out.println("에러");
           } else {
                inventoryMap.put(productName, 현재수량 - quantity);
                int price = priceMap.get(productName);
                System.out.println("상품이 구매되었습니다. ");
                System.out.println("남은 상품 개수 : " + (현재수량 - quantity) + "개");
                System.out.println("총 가격 : " + (price * quantity) + "원");
            }
        } catch (NumberFormatException e) {
            System.out.println("해당 상품이 없습니다.");
        } catch (RuntimeException e) {
            System.out.println("상품 개수가 부족합니다.");
        } catch (Exception e) {
            System.out.println("예기치 못 한 오류 발견");
        } finally {
            System.out.println("재고 관리 완료");
        }
        // finally에서 Scanner 종료 및 "재고 관리 완료" 메시지

    }
}
