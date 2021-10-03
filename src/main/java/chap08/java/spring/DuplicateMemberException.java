package chap08.java.spring;

public class DuplicateMemberException extends RuntimeException{
    public DuplicateMemberException(String message){
        super(message);
    }
}
