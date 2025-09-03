package edu.polymorphism.pack3.ex4;
// 상속의 상속의 상속을 받을 수 있어 extends
//                        상속클래스         구현할기능들
// 삼성카드
class SamsungCard extends CreditCard implements CardMethods {
    public SamsungCard(String holderName, String cardNumber) {
        super("삼성카드", holderName, cardNumber);
    }

    @Override
    public void showBenefits() {
        System.out.println("🔵 삼성카드 혜택:");
        System.out.println("   - 편의점 5% 할인");
        System.out.println("   - 삼성페이 10% 적립");
        System.out.println("   - 카페 2+1 쿠폰");
    }

    @Override
    public int calculateDiscount(int amount) {
        int discount = (int)(amount * 0.05); // 5% 할인
        System.out.println("🔵 삼성카드: " + discount + "원 할인");
        return discount;
    }

    @Override
    public int getPointRate() {
        return 1; // 100원당 1포인트
    }
}