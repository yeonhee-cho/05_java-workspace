package edu.polymorphism.pack3.ex4;
// 추상 클래스로 CreditCard에 작성된 추상메서드를 인터페이스로 옮겨 작성한 후
// 추상메서드가 아닌 인터페이스 CardMethods를 활용하여 문제없이 동작하도록 설정
public interface CardMethods {
    void showBenefits();        // 혜택 안내
    int calculateDiscount(int amount); // 할인 계산
    int getPointRate();         // 포인트 적립률
}
