package edu.practice.day3;

public class Practice2 {
    private String model;
    private int batteryLevel;
    private boolean isPowerOn;

    // 기본 생성자
    public Practice2() {
    }

    // 매개변수 생성자
    public Practice2(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    // setter
    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    // getter
    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    /* 전원여부 */
    public void powerOff(){
        if(!isPowerOn()){
            System.out.println(getModel() + "의 전원이 꺼졌습니다.");
            isPowerOn = true;
        } else {
            System.out.println( getModel() + "의 전원이 켜졌습니다.");
            isPowerOn = false;
        }
    }

    /* 배터리 사용량 */
    public void useBattery(){
        if(getBatteryLevel() <= 100 && getBatteryLevel() >= 0){
            if(getBatteryLevel() <= 0){
                isPowerOn = false;
                System.out.println("배터리가 모두 소모되어 전원이 꺼집니다.");
                powerOff();
            } else {
                isPowerOn = true;
                System.out.println("배터리를 " + (100 - getBatteryLevel()) + "% 사용했습니다.");
            }
        }
    }

    /* 충전 상태 */
    public void charge(){
        if(!isPowerOn()){
            isPowerOn = true;
            System.out.println("전원이 꺼져있어 배터리를 사용할 수 없습니다.");
        } else {
            System.out.println( getBatteryLevel() + "% 충전되었습니다.");
        }
    }

    /* 스마트폰 정보 */
    public void displayInfo(){
        System.out.println("모델: " + getModel());
        System.out.println("배터리: " + getBatteryLevel() + "%");
        System.out.println("전원 상태: " + (isPowerOn() ? "ON" : "OFF"));
    }
}
