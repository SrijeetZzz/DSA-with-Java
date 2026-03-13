package Arrayproblems;

import java.util.ArrayList;
import java.util.List;

/*
Problem Statement:
Given an m × n matrix, return all elements of the matrix
in spiral order.

Spiral order means:
Traverse the matrix in the following order:
top row → right column → bottom row → left column
and repeat until all elements are visited.

Input:
int[][] matrix → 2D array

Output:
List<Integer> → elements in spiral order

Example:
Input:
[[1,2,3],
 [4,5,6],
 [7,8,9]]

Output:
[1,2,3,6,9,8,7,4,5]

Approach:
1. Use four pointers:
   top, bottom, left, right.
2. Traverse:
   - left → right (top row)
   - top → bottom (right column)
   - right → left (bottom row)
   - bottom → top (left column)
3. After each traversal, move the boundaries.
4. Continue until boundaries cross.

Key Points:
- Check boundaries before each loop.
- Use while(bottom >= top && right >= left).

Time Complexity: O(m × n)
Space Complexity: O(1) extra (output list not counted)
*/

public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (bottom >= top && right >= left) {

            for (int i = left; i <= right; i++)
                list.add(matrix[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)
                list.add(matrix[i][right]);
            right--;

            if (bottom >= top) {
                for (int i = right; i >= left; i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }

            if (right >= left) {
                for (int i = bottom; i >= top; i--)
                    list.add(matrix[i][left]);
                left++;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        SpiralOrder obj = new SpiralOrder();

        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(obj.spiralOrder(mat));
    }
}