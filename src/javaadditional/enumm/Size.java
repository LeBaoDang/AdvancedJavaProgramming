package javaadditional.enumm;

public enum Size {
    // add enum constants
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;
    // create a method
    public String getSize(){
        // this refers to current obj
        switch (this) {
            case SMALL:
                return "small";
            case MEDIUM:
                return "medium";
            case LARGE:
                return "large";
            case EXTRA_LARGE:
                return "extra_large";
            default:
                return "nothing";
        }
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("Your card is: " + Size.MEDIUM.getSize());
    }
}
