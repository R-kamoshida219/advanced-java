package advanced;

public class OverSpeedException extends Exception {

    private static final long serialVersionUID = 1L;
    public OverSpeedException(){

    }

    public OverSpeedException(String message){
        super(message);
    }

    public OverSpeedException(Throwable cause){
        super(cause);
    }

    public OverSpeedException(String message,Throwable cause){
        super(message,cause);
    }
}
