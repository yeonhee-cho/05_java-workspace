package edu.exception.pack3.ex.run;

import edu.exception.pack3.ex.model.Cart;
import edu.exception.pack3.ex.service.CartService;

import java.util.Scanner;

public class CartRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 아이디를 입력하세요 : ");
        String creatUserId = sc.nextLine();

        Cart cart = new Cart(creatUserId); // userId 를 가지고 있는 cart 공간이 생성

        CartService cartService = new CartService();
        // cartService.장바구니시간체크기능(creatUserId);
        // -> 둘 다 유저 아이디를 가져오는 것 -> html 대신 작성한 것이므로 나중에는 사용불가한 방법
        cartService.장바구니시간체크기능(cart.getUserId());
        // -> 나중에 html에서 가져온 데이터를 활용할 방법
        // 지금은 creatUserId가 되지만 html을 사용하면서 데이터를 받아오는 추후에는 cart.getUserId()만 사용 가능함!

    }
}
