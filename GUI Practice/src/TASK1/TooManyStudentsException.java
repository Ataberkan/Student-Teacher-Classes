package TASK1;

public class TooManyStudentsException extends Exception {

    public TooManyStudentsException(){
        super("You cannot add more student in this group");
    }
}
