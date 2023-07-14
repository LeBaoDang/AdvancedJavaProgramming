package javaadditional.enumm;

public enum Card {
    CLUB, DIAMOND, HEART, SPADE;
    public String getCard(){
        switch (this) {
            case CLUB:
                return "CLUB";
            case DIAMOND:
                return "DIAMOND";
            case HEART:
                return "HEART";
            case SPADE:
                return "SPADE";
            default:
                return "nothing";
        }
    }
}
class Main1 {
    public static void main(String[] args) {
        System.out.println("Your card is: " + Card.DIAMOND.getCard());
    }
}
