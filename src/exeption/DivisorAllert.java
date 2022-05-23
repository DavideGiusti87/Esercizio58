package exeption;

public class DivisorAllert extends Exception{

    @Override
    public String getMessage() {
        return "Attention it is not possible to divide by zero!";
    }
}
