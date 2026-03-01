package Arrayproblems;
// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

// Example 1:

// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.
// Example 2:

// Input: grid = [[3,2],[1,0]]
// Output: 0
 
// approach:

// 1. start iterating from top right and if num is < 0 then all the values under that row in that column will be <0 as sorted matrix so skip the col and move the index to left and if not then skip the row.
// 2. use while loop as its easier

public class CountNegIntsInSortedMatrix {

        public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int row = 0;
        int col = cols - 1;
        int count = 0;

        while (row < rows && col >= 0) {
            if (grid[row][col] < 0) {
                count += rows - row;
                col--;  
            } else {
                row++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        int result = countNegatives(grid);
        System.out.println("Total Negative Numbers: " + result);
    }

}
