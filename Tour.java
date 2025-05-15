public class Tour {
    private int moveNum = 1;
    private int[][] board = new int[8][8];
    private int xPos;
    private int yPos;

    public Tour() {
        xPos = 0;
        yPos = 0;
    }

    public boolean moveCheck(int changeX, int changeY) {
        int newLocationX = changeX + xPos;
        int newLocationY = changeY + yPos;

        if ((newLocationX >= 0 && newLocationX < 8) && 
            (newLocationY >= 0 && newLocationY < 8) && 
            (board[newLocationX][newLocationY] == 0)) 
            return true;
        else return false;
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


    boolean called = true;
    int[][] allMoves = {{2, 1}, {1, 2}, {2, -1}, {1, -2}, {-2, 1}, {-1, 2}, {-2, -1}, {-1, -2}};
    public boolean knightsTour(int startX, int startY) {
        board[startX][startY] = moveNum;
        if (moveNum >= 64) return true;
        
        else {
            for (int[] move : allMoves) {
                if (moveCheck(move[0], move[1])) {                    
                    xPos += move[0];
                    yPos += move[1];
                    moveNum++;
                    called = true;
                    System.out.println("  MOVE VALID! " + move[0] + " " + move[1]);
                    
                    if (knightsTour(xPos, yPos)) {
                        System.out.println("  KNIGHT TOUR CALLED AGAIN!");
                        return true;
                    }

                    else {
                        called = true;
                        moveNum--;
                        board[xPos][yPos] = 0;
                        xPos -= move[0];
                        yPos -= move[1];
                        System.out.println("  BACKTRACK!");
                    }
                    
                }
                if (called) {
                    this.printBoard();
                    System.out.println("---------------------");
                    called = false;
                }
                else System.out.println("  Move doesnt work (" + move[0] + ", " + move[1] + ")");
            }
        return false;
            
       }
    }
}