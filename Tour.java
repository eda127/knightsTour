public class Tour {
    private int moveNum = 0;
    private int[][] board = new int[8][8];
    private int xPos;
    private int yPos;

    public Tour() {
        int xPos = 0;
        int yPos = 0;
    }

    public boolean moveCheck(int changeX, int changeY) {
        int newLocationX = changeX + xPos;
        int newLocationY = changeY + yPos;

        if (((newLocationX > 0) && (newLocationY > 0)) && (board[newLocationX][newLocationY] > 1)) return false;
        else return true;
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public boolaen KnightsTour(int startX, int startY) {
        if (moveNum == 64) retrun true;
        else {
            int[][] tempArr = new int[8][8];
            
            // down 2, right 1
            if (moveCheck(-2, 1)) {

            }
            // down 1, right 2
            else if (moveCheck(-1, 2)) {

            }
            //down 2, left 1
            else if (moveCheck(-2, -1)) {

            }
            // down 1, left 2
            else if (moveCheck(-1, -2)) {

            }
            // up 2, right 1
            else if (moveCheck(2, 1)) {
            
            }
            // up 1, right 2
            else if (moveCheck(1, 2)) {
            
            }
            // up 2, left 1
            else if (moveCheck(2, -1)) {
            
            }
            // up 1, left 2
            else if (moveCheck(1, -2)) {
            
            }
        }
    }
}