import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeButtons {


  static int turn = 1;

  public static void main(String[] args) {

    JFrame window = new JFrame();
    JPanel gamePanel = new JPanel();

    window.setSize(300, 300);
    gamePanel.setSize(300, 300);
    gamePanel.setLayout(new GridLayout(3, 3));

    GameSquare[][] board = new GameSquare[3][3];

    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        GameSquare newSquare = new GameSquare();
        newSquare.addActionListener( new SquareListener() );
        board[row][col] = newSquare;
        gamePanel.add(newSquare);
      }
    }

    window.add(gamePanel);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }

  public static void checkWinner() { // check if there are three consecutive same shapes or the board is full
    
  }

}

class GameSquare extends JButton {
  int value = 0;
}

class SquareListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    GameSquare clickedSquare = (GameSquare)e.getSource();
    String squareText = "";
    if (TicTacToeButtons.turn == 1 && clickedSquare.value == 0) {
      clickedSquare.value = 1;
      squareText = "X";
    }
    if (TicTacToeButtons.turn == -1 && clickedSquare.value == 0) {
      clickedSquare.value = 1;
      squareText = "O";
    }
    clickedSquare.setText(squareText);
    TicTacToeButtons.turn = -1 * TicTacToeButtons.turn;
  }
}