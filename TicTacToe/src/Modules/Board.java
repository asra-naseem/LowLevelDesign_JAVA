package Modules;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public int size;
    public PlayingPiece playingboard[][];

    public Board(int size) {
        this.size = size;
        playingboard = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {

        if (playingboard[row][column] != null)
            return false;
        playingboard[row][column] = playingPiece;
        return true;
    }

    public List<Pair> getFreeCells() {
        List<Pair> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (playingboard[i][j] == null) {
                    Pair coordinate = new Pair(i, j);
                    freeCells.add(coordinate);
                }
            }
        }
        return freeCells;
    }

    public void printGameBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (playingboard[i][j] != null)
                    System.out.print(playingboard[i][j].pieceType.name());
               else
                    System.out.print(" ");
               System.out.print(" | ");

            }
            System.out.println();


        }
    }
}