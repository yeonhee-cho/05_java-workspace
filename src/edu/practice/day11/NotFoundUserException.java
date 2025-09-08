package edu.practice.day11;

public class NotFoundUserException extends Exception{
    public NotFoundUserException(){
        super("일치하는 계좌의 주인이 존재하지 않습니다.");
    }
    public NotFoundUserException(String message){
        super(message);
    }
}
