package meetprograms;

public class NumberOfLands {
	public static void remainingLandToPurchase(int i, int j, char[][] grid){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j] != '1' ){
        return;
        }
        grid[i][j] = '.'; //to identification of already visited
        remainingLandToPurchase(i+1, j, grid); // down
        remainingLandToPurchase(i, j+1, grid); //right
        remainingLandToPurchase(i-1, j, grid); //upward
        remainingLandToPurchase(i, j-1, grid); //left
    }
 
    public static int numIslands(char[][] grid) {
        int counterForLand = 0;
        
        for(int i =0; i<grid.length;i++){
            for(int j = 0; j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    remainingLandToPurchase(i,j,grid);  //recursive call
                    counterForLand++; //1 +1 +1 = 3
                }
            }
        }
        return counterForLand;
    }
 
    public static void main(String[] args) {
        
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        
        System.out.println("Number of islands: " + numIslands(grid)); // Should output: 3
    }
}
