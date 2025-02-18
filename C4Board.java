import java.util.*;
public class C4Board {
    //index '0' not used for convenience
    //7 columns 
    private int[] column = {0, 1, 2 , 3, 4, 5, 6, 7};
    //6 rows
    private int[] row = {0, 1, 2, 3, 4, 5, 6};
    //the next available spot in a given column
    private int[] availSpot = {0, 6, 6, 6, 6, 6, 6, 6};
    
    //possible instance variable below:
    //private boolean doesHumanGo = true;
    
    public C4Board() {
        int[] column = this.column;
        int[] row = this.row;
        int[] availSpot = this.availSpot;
    }

    public static int[] getAvailSpot(C4Board board) {
        return board.availSpot;
    }

    //possible getter below:
    //public static boolean getPlayerMove(C4Board board) {
        //return board.doesHumanGo;
    //}

    public static int[] dropPuck(C4Board board, int col) { //what is this function doing actually? I cant figure it out.
        board.availSpot[col] = board.availSpot[col] - 1; //use if statement to check if board has available spaces or not in a partuicular column so that the values for input count dont go below zero
        System.out.println(board.availSpot[col]);
        return board.availSpot;
    }

    public static void printBoard(C4Board board) {
        System.out.println(board.row.length);
        System.out.println(board.column.length);
        System.out.println(Arrays.toString(board.availSpot));
        for (int r = 1; r < board.row.length; r++) {
            for (int c = 1; c < board.column.length; c++) {
                if (board.availSpot[c] < board.row[r]) {
                    System.out.print(" ");
                    System.out.print("#");
                    System.out.print(" "); 
                }
                else {
                    System.out.print(" ");
                    System.out.print("O");
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }

    public static boolean playerTurn(int count) {
        boolean doesHumanGo = true;
        //if count is odd (because human takes the first move)
            //then computer goes
        if (count %2 != 0) {
            doesHumanGo = false;
        }
        //if count is even
            //then player goes
        if (count %2 == 0 || count == 0) {
            doesHumanGo = true;
        }
        return doesHumanGo;
    }
}


