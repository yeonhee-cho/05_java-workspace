package edu.polymorphism.pack1.ex1.service;

import edu.polymorphism.pack1.ex1.model.Clothing;
import edu.polymorphism.pack1.ex1.model.Electronics;
import edu.polymorphism.pack1.ex1.model.Food;
import edu.polymorphism.pack1.ex1.model.Product;
import edu.polymorphism.pack1.model.SmartPhone;

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

    Product[] products = {phone, tshirt, apple};

    // for문은 반드시 메소드(기능) 내 작성
    // 전체 상품을 메인 페이지에서 모두 확인할 때 사용
    // category 에 작성된 카테고리들이 DB -> java로 가져오고
    // java에서 html로 전달하여 카테고리를 볼 수 있도록 설정
    public void info(){
        for(Product product:products){
            // Product 문서 클래스 내부에 작성된 기능들 중에서 displayProductInfo()로 작성된 기능을 수행
            // displayProductInfo() 기능 내부에 System 출력문으로 제품 정보를 확인할 수 있도록 설정한 내용이 실행되는것
            product.displayProductInfo();
        }
    }
}
