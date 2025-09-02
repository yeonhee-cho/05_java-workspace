package edu.polymorphism.pack1.ex2.model;

/**
 * 부모 클래스
 * name
 * id
 * toString
 * 를 작성하고
 */

// 코드 분류 후 생성자 만들기
// 생성자 아무것도 존재하지 않는 생성자
// 자식 클래스 필드 값만 기본으로 만들어지는 생성자
// 부모 클래스 필드 값만 기본으로 만들어지는 생성자
// 부모 클래스 + 자식 클래스 필드 값 모두 기본 매개변수로 만들어지는 생성자
public class UniverseMember /*extends Object*/ {
    // protected
    protected String name;
    protected String id;

    public UniverseMember() {
    }

    public UniverseMember(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "학교 멤버 : " +
                "name='" + name + '\'' +
                ", id='" + id + '\'';
    }
}


