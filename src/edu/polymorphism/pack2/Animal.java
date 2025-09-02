package edu.polymorphism.pack2;

/**
 * 부모 클래스
 */
public abstract class Animal {
    // 필드
    protected String name;

    // 생성자
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 무조건 하는 것
    // eat sleep을 상속 받는 Dog에서 작성하지 않아도 아무런 문제가 되지 않음!
    public abstract void eat();
    // TODO!!! 에러 : 비추상 클래스에 추상 메서드가 있습니다
    public void sleep() {};

    // public void eat() {}
    // public void sleep() {}
}
