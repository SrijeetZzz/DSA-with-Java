package Arrayproblems;

/*
Problem Statement:
Given a m × n matrix grid sorted in non-increasing order both row-wise and column-wise,
return the total number of negative numbers in the matrix.

Input:
2D integer array grid

Output:
Integer → count of negative numbers

Example 1:
Input:
[[4,3,2,-1],
 [3,2,1,-1],
 [1,1,-1,-2],
 [-1,-1,-2,-3]]

Output:
8

Example 2:
Input:
[[3,2],
 [1,0]]

Output:
0

Approach:
1. Since the matrix is sorted in non-increasing order both row-wise and column-wise,
   we can start from the top-right corner.
2. If current element < 0,
      then all elements below it in the same column are also negative.
      So add (rows - currentRow) to count
      and move left (col--).
3. If current element >= 0,
      move down (row++).
4. Continue until row or column goes out of bounds.
5. Use while loop because we move in two directions.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

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