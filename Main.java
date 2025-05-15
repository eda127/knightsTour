import javax.swing.JFrame;
import javax.swing.JTextField;


    //made by chatGPT b/c the output is too long in the terminal
    import java.io.BufferedWriter;
    import java.io.FileOutputStream;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.io.PrintStream;

public class Main {
    public static void main (String[] args) {
        Tour tour = new Tour();
        
        //tour.knightsTour(0, 0);
        //tour.printBoard();
        //ChessBoard abc = new ChessBoard();
        //abc.runGUI();

        
        
        //made by chatGPT b/c the output is too long in the terminal, so it saves in a file
        String filePath = "";    //change this line to correct file path
        try (PrintStream fileOut = new PrintStream(new FileOutputStream(filePath))) {
            
            // Redirect System.out to the file
            System.setOut(fileOut);

            // Run the knight's tour
            tour.knightsTour(0, 0);
            
            // Optionally, print a message to indicate completion
            System.out.println("Knight's tour output saved to file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}

