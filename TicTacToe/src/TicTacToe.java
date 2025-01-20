import Modules.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    Deque<Player> players;
    Board gameBoard ;

    public void initialize(){
        players = new ArrayDeque<>();
        Player player1 = new Player("Asra", new PlayingPieceX(PieceType.X));
        Player player2 = new Player("Deepak",new PlayingPieceO(PieceType.O));

        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);
        String winner = startGame();
        if(winner!=null)
            System.out.println("Winner is "+winner);
        else
            System.out.println("There is no Winner");
    }

    public String startGame(){

        boolean winner = false;
        Player nextPlayer = null;
        while(!winner){
             nextPlayer= players.removeFirst();
            gameBoard.printGameBoard();
            List<Pair> freeCells = gameBoard.getFreeCells();

            if(freeCells.isEmpty()){
               System.out.println("Game is Draw");
               break;
            }
            System.out.println("Player"+ nextPlayer.playerName + " Enter row,column ");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            String[] values =s.split(",");
            if(gameBoard.addPiece(Integer.valueOf(values[0]),Integer.valueOf(values[1]),nextPlayer.getPlayingPiece())!=true){
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect possition chosen, try again");
                players.addFirst(nextPlayer);
                continue;
            }
            players.addLast(nextPlayer);
            winner = isThereWinner(Integer.valueOf(values[0]),Integer.valueOf(values[1]),nextPlayer.getPlayingPiece());
        }
        if(winner == true)
      return   nextPlayer.getPlayerName();

        return null;



        }

  boolean isThereWinner(int row,int column,PlayingPiece playingPiece){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch=true;

        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.playingboard[row][i]==null || gameBoard.playingboard[row][i].pieceType!=playingPiece.pieceType)
                rowMatch=false;
        }
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.playingboard[i][column]==null || gameBoard.playingboard[i][column].pieceType!=playingPiece.pieceType){
                columnMatch=false;
            }
        }
      for(int i=0, j=0; i<gameBoard.size;i++,j++) {
          if (gameBoard.playingboard[i][j] == null || gameBoard.playingboard[i][j].pieceType != playingPiece.pieceType) {
              diagonalMatch = false;
          }
      }

      //need to check anti-diagonals
      for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
          if (gameBoard.playingboard[i][j] == null || gameBoard.playingboard[i][j].pieceType != playingPiece.pieceType) {
              antiDiagonalMatch = false;
          }
      }

      return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;


  }


    }

