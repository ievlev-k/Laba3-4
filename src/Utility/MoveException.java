package Utility;

public class MoveException extends Exception {
    public MoveException(){
        super("Действие уже исполнено");
    }
}
