package javafile;

public class MyFileException extends Exception{
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public MyFileException(String error) {
        this.error = error;
    }
}
