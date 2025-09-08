package practice.exception.ex;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(){
        System.out.println("일치하는 비밀번호가 존재하지 않습니다.");
    }
    public InvalidPasswordException(String message){
        super(message);
    }
}
