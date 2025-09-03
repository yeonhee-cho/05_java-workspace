package edu.practice.day8.model.ex3;

public class Amazon implements OnlineShopping {
    private String product;

    public Amazon(String product) {
        this.product = product;
    }

    @Override
    public void browse() {
        System.out.println("🔍 아마존에서 " + product + "을(를) 검색합니다.");
    }

    @Override
    public void addToCart() {
        System.out.println("🛒 " + product + "을(를) 아마존 장바구니에 담았습니다!");
    }

    @Override
    public void purchase() {
        System.out.println( "💳 아마존에서 " + product + "결제 완료! 내일 도착 예정!");
    }
}
