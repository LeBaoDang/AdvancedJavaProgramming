package javaadditional.enumm;

public enum EnumString {
    CLUB, DIAMOND, SPADE, HEAT;
}
class Main5 {
    public static void main(String[] args) {
        String cardType;
        cardType = EnumString.DIAMOND.toString();
        System.out.println(cardType);
    }
}
