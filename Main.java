import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {
    public static void main (String[] args) {
        Tour tour = new Tour();
        
        
        // tour.printBoard();
        tour.knightsTour(0, 0);
        tour.printBoard();

        ChessBoard board = new ChessBoard();
        board.runGUI();

    }



}