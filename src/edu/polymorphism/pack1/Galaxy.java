package edu.polymorphism.pack1;

public class Galaxy extends SmartPhone{
    //안드로이드 운영체제 버전
    private int androidVersion;
    
    // html에서 필수로 데이터 정보를 작성해야하는 required에 따라 결정되는 것이 많음
    // 기본 생성자 Galaxy 라는 객체를 생성할 때 기본적으로 갖추어야 하는 필드값 없이 생성
    public Galaxy() {
    } // -> 공간을 만들고 나서 나중에 Galaxy에 대한 정보를 설정해도 됨
    
    // 매개변수 생성자 매개변수 타입 모두 SmartPhone 문서에 작성된 필드값을 기본적으로 설정한 객체 생성
    public Galaxy(String display, String newsAgency, String ap) {
        super(display, newsAgency, ap);
    } // -> 공간을 만들 때 적어도 디스플레이, 통신사, cpu가 무엇인지는 작성하고 나서 공간을 설정

    // 매개변수 생성자 매개변수 타입 SmartPhone + Galaxy 필드값을 모두 갖춘 상태에서 객체 생성
    public Galaxy(String display, String newsAgency, String ap, int androidVersion) {
        super(display, newsAgency, ap);
        this.androidVersion = androidVersion;
    } // -> 공간을 만들 때 Galaxy에 해당하는 모든 데이터를 작성하고 나서 생성

    public int getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    @Override
    public String toString() {
        // androidVersion + SmartPhone에 작성된 toString 정보를 사용
        return "Galaxy" + "androidVersion=" + androidVersion + super.toString();
    }
}
