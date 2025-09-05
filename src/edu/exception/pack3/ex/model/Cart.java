package edu.exception.pack3.ex.model;

import java.time.LocalDateTime;

/**
 * 장바구니 모델
 */
public class Cart {
    private String userId;
    private LocalDateTime creatTime;

    public Cart(String userId){
        this.userId = userId;
        this.creatTime = LocalDateTime.now(); // 장바구니 생성된 시간은 개발자가 설정!
        // 현재 시간을 작성
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public LocalDateTime getCreatTime() {
        return creatTime;
    }
    public void setCreatTime(LocalDateTime creatTime) {
        this.creatTime = creatTime;
    }

}
