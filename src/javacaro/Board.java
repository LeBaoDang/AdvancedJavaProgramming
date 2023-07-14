package javacaro;

import java.util.ArrayList;

class Board {

    // create an ArrayList
    ArrayList board = new ArrayList<>();

    // add elements to the board ArrayList
    void addElements() {
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
    }

    // print elements of the board
    void printBoard() {

        System.out.println(" " + board.get(0) + " | " + board.get(1) + " | " + board.get(2));
        System.out.println("-----------");
        System.out.println(" " + board.get(3) + " | " + board.get(4) + " | " + board.get(5));
        System.out.println("-----------");
        System.out.println(" " + board.get(6) + " | " + board.get(7) + " | " + board.get(8));

    }
}

class Main {
    public static void main(String[] args) {

        // create object of Board class
        Board b1 = new Board();

        // call addElements method
        b1.addElements();

        // call printBoard method
        b1.printBoard();
    }
}
