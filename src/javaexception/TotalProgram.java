package javaexception;

public class TotalProgram {

    public static void main(String[] args) {
        try {
            sum(6,0);
        } catch (MyException e) {
            throw new RuntimeException(e.getError());
        }
    }

    static void sum(int a, int b) throws MyException {
        try {
            int c = a/b;
            System.out.println(c);
        } catch ( Exception e ){
            throw new MyException("Lỗi chia hai số");
        }
    }

}
