import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.awt.*;

public class ChessBoard {
    private int boardSize;

    public ChessBoard() {
        boardSize = 8;
    }

    public void runGUI() {

        JFrame frame = new JFrame("Chessboard");
        frame.setSize(1000,1000);

        frame.setLayout(new GridLayout(8,8));

        // JLabel label = new JLabel("New label");

        // Button button = new Button("a");
        // button.setBounds(100,50,50,50);
        
        for (int i = 0; i < 64; i++) {
            if (i%2 == 0) 
        }

        
        

        frame.setVisible(true);
    }

}