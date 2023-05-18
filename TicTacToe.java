import java.util.*;

public class TicTacToe {

  public static void main(String[] args) {

    int[][] grid = new int[3][3];
    Scanner kb = new Scanner(System.in);

    int player = 1;
    int round = 1;
    int winner = 0;

    while (winner == 0 && round <= 9) {
      String playerSymbol = "X";
      if (player == -1) playerSymbol = "O";

      System.out.println(playerSymbol + "'s turn\n'");
      System.out.print("What row (1-3): ");
      int row = Integer.parseInt(kb.nextLine()) - 1;
      int col = Integer.parseInt(kb.nextLine()) - 1;

      grid[row][col] = player;

      winner = checkWinner(grid);

      if (winner != 0) {
        System.out.println(playerSymbol + " wins!!!");
        break;
      }

      player *= -1;     // change players at the end of the turn.
    }

  }

  public static int checkWinner(int[][] grid) {
    // Check horizontal lines
    for (int row = 0; row < 3; row++) {
        if (grid[row][0] == grid[row][1] && grid[row][1] == grid[row][2]) {
            if (grid[row][0] == 1) {
                return 1;
            } else if (grid[row][0] == -1) {
                return -1;
            }
        }
    }

    // Check vertical lines
    for (int col = 0; col < 3; col++) {
        if (grid[0][col] == grid[1][col] && grid[1][col] == grid[2][col]) {
            if (grid[0][col] == 1) {
                return 1;
            } else if (grid[0][col] == -1) {
                return -1;
            }
        }
    }

    // Check diagonal lines
    if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
        if (grid[0][0] == 1) {
            return 1;
        } else if (grid[0][0] == -1) {
            return -1;
        }
    }

    if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
        if (grid[0][2] == 1) {
            return 1;
        } else if (grid[0][2] == -1) {
            return -1;
        }
    }

    // If no winner found, return 0
    return 0;
}

}
