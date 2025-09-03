package edu.practice.day8.model;

public class Coupang implements OnlineShopping {
    private String item;

    public Coupang(String item) {
        this.item = item;
    }

    @Override
    public void browse() {
        System.out.println("🔍 쿠팡에서 " + item + "을(를) 둘러봅니다.");
    }

    @Override
    public void addToCart() {
        System.out.println("🛒 " + item + "을(를) 쿠팡 장바구니에 쏙!");
    }

    @Override
    public void purchase() {
        System.out.println( "💳 쿠팡에서 " + item + " 주문! 로켓배송으로 내일 도착!");
    }
}