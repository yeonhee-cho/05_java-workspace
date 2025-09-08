package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    Map<String, String> productMap; // 상품ID : 상품명
    Map<String, Integer> priceMap; // 상품ID : 가격

    public ProductManager() {
        this.productMap = new HashMap<>();
        this.priceMap = new HashMap<>();
        initialData();
    }

    // 초기 데이터
    private void initialData(){
        productMap.put("P001", "갤럭시S24");
        priceMap.put("P001", 1200000);
        productMap.put("P002", "아이폰15");
        priceMap.put("P002", 1300000);
        productMap.put("P003", "나이키운동화");
        priceMap.put("P003", 150000);
    }

    // 상품 추가
    void addProduct(String productId, String productName, int price){
        // 상품ID가 이미 존재하면 "이미 존재하는 상품입니다!" 출력
       if(!productId.isEmpty()){
           System.out.println("이미 존재하는 상품입니다!");
       } else {
        // 새 상품이면 "{productName} 상품이 추가되었습니다!" 출력
        System.out.println(productName + " 상품이 추가되었습니다!");
       }

    }

    void searchProduct(String productId){}
    void displayAllProducts(){}
    void removeProduct(String productId){}
}
