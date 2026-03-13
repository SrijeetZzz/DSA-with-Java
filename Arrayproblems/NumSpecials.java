package Arrayproblems;

/*
Problem Statement:
Given a binary matrix mat, return the number of special positions in the matrix.

A position (i, j) is called special if:
1. mat[i][j] == 1
2. All other elements in row i are 0
3. All other elements in column j are 0

Input:
int[][] mat → binary matrix containing only 0s and 1s

Output:
Integer → number of special positions

Example:
Input:
[[1,0,0],
 [0,0,1],
 [1,0,0]]

Output:
1

Explanation:
Only position (1,2) satisfies the condition that its row and column
contain no other 1s.

Approach (Optimized):
1. Create two arrays:
   - rowCount[n] to store number of 1s in each row
   - colCount[m] to store number of 1s in each column
2. Traverse the matrix once to count the number of 1s in every row and column.
3. Traverse the matrix again:
   - If mat[i][j] == 1 AND rowCount[i] == 1 AND colCount[j] == 1,
     then it is a special position.
4. Increment the counter.

Time Complexity: O(n × m)
Space Complexity: O(n + m)
*/

public class NumSpecials {

    public int numSpecial(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[] rowCount = new int[n];
        int[] colCount = new int[m];

        // count 1s in rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int count = 0;

        // check special positions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 1 &&
                    rowCount[i] == 1 &&
                    colCount[j] == 1) {

                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        NumSpecials obj = new NumSpecials();

        int[][] mat = {
                {1,0,0},
                {0,0,1},
                {1,0,0}
        };

        System.out.println(obj.numSpecial(mat));
    }
}