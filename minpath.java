//-----------------------------PROBLEM STATEMENT--------------------------------------
/*Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.*/

//-----------------------------PROBLEM LINK-------------------------------------------
https://leetcode.com/problems/minimum-path-sum/



public class minpath {

        public static void print(int[][] dp, int n) {

                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                                System.out.print(dp[i][j] + " ");
                        }
                        System.out.println();
                }
        }

        public static void main(String[] args) {
                int[][] grid = new int[][] { { 1, 2 ,3 },{4,5,6} };
                int row = grid.length;
                int col = grid[0].length;
                int[][] dp = new int[row][col];

                //print(grid, n);

                dp[0][0] = grid[0][0];
                for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                                if (i == 0 && j != 0) {
                                        dp[i][j] = dp[i][j - 1] + grid[i][j];

                                } else if (j == 0 && i != 0) {
                                        dp[i][j] = dp[i - 1][j] + grid[i][j];
                                } else if (i != 0 && j != 0) {
                                        int m = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
                                        dp[i][j] = m;
                                }
                        }
                }
                System.out.print(dp[row - 1][col - 1]);


        }

}
