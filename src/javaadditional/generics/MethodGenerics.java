package javaadditional.generics;

public class MethodGenerics {
    public <T> void display(T data){
        System.out.println(data);
    }

    public static void main(String[] args) {
        MethodGenerics obj = new MethodGenerics();
        obj.<String> display ("java");
        obj.<Integer> display (25);
    }
}
