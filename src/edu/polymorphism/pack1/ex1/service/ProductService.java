package edu.polymorphism.pack1.ex1.service;

import edu.polymorphism.pack1.ex1.model.Clothing;
import edu.polymorphism.pack1.ex1.model.Electronics;
import edu.polymorphism.pack1.ex1.model.Food;

/**
 * 제품 관련 기능을 작성하는 문서
 */
public class ProductService {

    // 다양한 상품들 생성
    Electronics phone = new Electronics("삼성 갤럭시", "PHONE001", 800000.0, 10,
            "최신 스마트폰", "삼성", 0.2, 24, "15W");

    Clothing tshirt = new Clothing("면 티셔츠", "SHIRT001", 25000.0, 50,
            "100% 면 소재", "무신사", 0.3, "L", "화이트", "면");

    Food apple = new Food("사과", "APPLE001", 5000.0, 100,
            "국산 사과", "농협", 1.0, "2025-09-15", "한국", true);


    // 다형성을 활용해서 phone tshirt apple 제품 향상된 for문을 활용해서 정보 출력
    // displayProductInfo
    // 배열 처리할 변수의 명칭 products
    // for 문 내 활용할 변수의 명칭 product

}
