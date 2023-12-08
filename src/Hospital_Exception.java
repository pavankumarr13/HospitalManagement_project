public class Hospital_Exception {
    
}

class InvalidCondition extends RuntimeException{
    @Override
    public String getMessage(){
        return "Invalid condition..... please select a valid condition";
    }
}
