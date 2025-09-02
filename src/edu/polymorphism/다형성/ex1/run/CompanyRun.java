package edu.polymorphism.다형성.ex1.run;

import edu.polymorphism.다형성.ex1.service.MemberService;
import edu.polymorphism.다형성.ex1.service.ProductService;

public class CompanyRun {
    public static void main(String[] args) {
        // 다형성을 활용해서 phone tshirt apple 제품 향상된 for문을 활용해서 정보 출력
        // displayProductInfo
        // 배열 처리할 변수의 명칭 products
        // for 문 내 활용할 변수의 명칭 product

        ProductService ps = new ProductService(); 
        // ps = ProductService의 대한 기능이 담긴 공간 명칭을 임의로 적어준 것
        ps.info(); // ProductService 내에 존재하는 info() 기능을 실행

        MemberService ms = new MemberService();
        ms.info();
    }
}
