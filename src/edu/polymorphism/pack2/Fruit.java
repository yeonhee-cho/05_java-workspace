package edu.polymorphism.pack2;

/**
 * 부모 클래스
 * 과일
 */
/**
 * 문서인데,
 * Fruit를 상속받는 자식 클래스가 강제로 작성해야하는 기능이 존재할 수 있다.
 */
public abstract class Fruit {
    // 필드
    protected String fruitName;

    // 생성자
    public Fruit() {
    }
    public Fruit(String fruitName) {
        this.fruitName = fruitName;
    }

    // 게터 세터
    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    
    // 과일마다 먹을 때 맛이 다름, 
    // 다른 맛을 자식 클래스에서 과일이름에 맞게 재설정
    // 메서드 작성 방법은 접근제어자, void/자료형, 기능명칭(){};
    // 규칙!! 매개변수가 없어도 ()작성, 특정기능이 없어도 메서드이면 {}를 생성
    // public void taste(/* 매개변수가 없어도 작성 */){
    //     /* 특정기능이 없어도 메서드이면 {}를 생성 */
    // };

    // 접근제어자와 void/자료형 사이에 abstract가 존재하면 {}를 생략
    // abstract메서드 작성 방법은
    // 접근제어자 abstract void/자료형 기능명칭();
    // 상속받는 자식 클래스들이 완성해야하는 기능이기 때문에 {} 생략
    public abstract void taste();

    public void info(){
        System.out.println("Fruit: " + fruitName);
    }
}
