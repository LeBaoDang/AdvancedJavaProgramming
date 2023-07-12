package java.hashset;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> number1 = new java.util.HashSet<>();
        number1.add(2);
        number1.add(4);
        System.out.println("Set 1: " + number1);

        java.util.HashSet<Integer> number2 = new java.util.HashSet<>();
        number2.add(1);
        number2.add(3);
        System.out.println("Set 2: " + number2);

        number1.addAll(number2);
        System.out.println("Union" + number1);

        number1.retainAll(number2);
        System.out.println("Intersection" + number1);

    }
}
