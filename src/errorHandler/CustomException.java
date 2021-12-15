package errorHandler;

public class CustomException extends Exception{
    
    public  CustomException(String errorMessage){
        super(errorMessage);
    }
}