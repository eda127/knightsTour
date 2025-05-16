public class Tour {
    private int moveNum = 1;
    private int[][] board = new int[8][8];
    private int xPos;
    private int yPos;

    public Tour() {
        xPos = 0;
        yPos = 0;
        board[xPos][yPos] = 1;
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


    
    int[][] allMoves = {{1, 2}, {2, 1}, {-1, 2}, {1, -2}, {2, -1}, {-2, 1}, {-2, -1}, {-1, -2}};
    public boolean knightsTour(int startX, int startY) {
        
        if (moveNum >= 63) {
        board[startX][startY] = 63;
        return true;
    }
        
        else {
            for (int[] move : allMoves) {
                if (moveCheck(move[0], move[1])) {                    
                    xPos += move[0];
                    yPos += move[1];
                    moveNum++;
                    board[xPos][yPos] = moveNum;
                    
                    
                    if (knightsTour(xPos, yPos)) {
                        return true;
                    }

                    else {
                        
                        moveNum--;
                        board[xPos][yPos] = 0;
                        xPos -= move[0];
                        yPos -= move[1];
                    }
                    
                }
                
            }
        }
        return false;
            
       
    }
}