package meetprograms;
import java.util.*;
public class NQUEENSFINAL {
		public List<List<String>> solveNQueens(int n) {
	        char[][] chessBoard = new char[n][n];
	        for (int r = 0; r < n; r++) {
	            Arrays.fill(chessBoard[r], '.');
	        }
	 
	        List<List<String>> result = new ArrayList<>();
	        solveNQueensUtil(chessBoard, 0, result);
	        return result;
	    }
	 
	    private void solveNQueensUtil(char[][] chessBoard, int row, List<List<String>> result) {
	        int n = chessBoard.length;
	        if (row == n) {
	            result.add(constructSolution(chessBoard));
	        } else {
	            for (int col = 0; col < n; col++) {
	                if (isSafe(chessBoard, row, col)) {
	                    chessBoard[row][col] = 'Q';
	                    solveNQueensUtil(chessBoard, row + 1, result);
	                    chessBoard[row][col] = '.';
	                }
	            }
	        }
	    }
	 
	    private List<String> constructSolution(char[][] chessBoard) {
	        List<String> solution = new ArrayList<>();
	        for (char[] row : chessBoard) {
	            solution.add(String.valueOf(row));
	        }
	        return solution;
	    }
	 
	    private boolean isSafe(char[][] chessBoard, int row, int col) {
	        int n = chessBoard.length;
	        for (int i = 0; i < n; i++) {                        //vertical and horizontal
	            if (chessBoard[i][col] == 'Q' || chessBoard[row][i] == 'Q') {
	                return false;
	            }
	        }
	 
	        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) { // left upward diagonal
	            if (chessBoard[i][j] == 'Q') {
	                return false;
	            }
	        }
	 
	        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {  // right upward diagonal
	            if (chessBoard[i][j] == 'Q') {
	                return false;
	            }
	        }
	 
	        return true;
	    }
	 
	    public static void main(String[] args) {
	    	NQUEENSFINAL solution = new NQUEENSFINAL();
	        int n = 4;
	        List<List<String>> solutions = solution.solveNQueens(n);
	        System.out.println("Solutions for " + n + " Queens:");
	        for (List<String> sol : solutions) {
	            for (String row : sol) {
	                System.out.println(row);
	            }
	            System.out.println();
	        }
	    }
	}
	 

