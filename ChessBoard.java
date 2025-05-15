import java.awt.event.*;
import javax.swing.*;
import java.io.File;

public class ChessBoard {
    private int temp;

    public ChessBoard() {
        temp = 30;
    }

    public void runGUI() {

        JFrame f=new JFrame("Title");
        

        f.setSize(1040, 1040);
        f.setVisible(true);
    }

}
