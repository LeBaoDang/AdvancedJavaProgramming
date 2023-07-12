package javaexception;

public class MyException extends Exception{
    private String Error;

    public MyException(String error) {
        Error = error;
    }

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }
}
