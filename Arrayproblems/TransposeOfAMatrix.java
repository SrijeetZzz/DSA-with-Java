package Arrayproblems;

public class TransposeOfAMatrix {

/*
Problem Statement:
Find the transpose of a matrix of size n × m.

Transpose means:
Row becomes column.

Input:
int[][] matrix (n × m)

Output:
int[][] transpose (m × n)

Example:

Input:
1 2 3
4 5 6

Output:
1 4
2 5
3 6

------------------------------------------------

Why we cannot do in-place for n × m ?

For n × n:
swap(i,j) with (j,i) works.

For n × m:
shape changes → need new matrix.

Example:

2 × 3 → 3 × 2

------------------------------------------------

Algorithm:

1. Let n = rows
2. Let m = cols
3. Create new matrix[m][n]
4. Loop i from 0 → n-1
5. Loop j from 0 → m-1
6. new[j][i] = matrix[i][j]

------------------------------------------------

Time Complexity: O(n × m)
Space Complexity: O(n × m)

*/

    public int[][] transMatrix(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] trans = new int[m][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                trans[j][i] = matrix[i][j];
            }
        }

        return trans;
    }


    // -------- main method --------
    public static void main(String[] args) {

        TransposeOfAMatrix obj =
                new TransposeOfAMatrix();

        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };

        int[][] result = obj.transMatrix(matrix);

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[0].length; j++) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}