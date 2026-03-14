package Arrayproblems;

public class RotateMatrixBy90Degree {
    /*
Problem Statement:
Rotate a given n × n matrix by 90 degrees clockwise in-place.

Input:
int[][] matrix

Output:
Matrix rotated 90° clockwise

------------------------------------------------

Algorithm:

Step 1: Transpose the matrix
Step 2: Reverse each row

Why transpose?
Row → Column conversion needed for rotation.

------------------------------------------------

Why j starts from i+1 in transpose?

We only need to swap elements above the diagonal.

Example matrix:

1 2 3
4 5 6
7 8 9

Transpose swaps:
(0,1) with (1,0)
(0,2) with (2,0)
(1,2) with (2,1)

If j starts from 0:
we will swap twice.

Example:

swap(0,1) with (1,0)
later swap(1,0) with (0,1) again ❌

So we start from:

j = i + 1

to avoid duplicate swaps.

Diagonal elements stay same:
(0,0), (1,1), (2,2)

------------------------------------------------

Time Complexity: O(n²)
Space Complexity: O(1)
*/


    public void rotateMatrix(int[][] matrix) {

        int n = matrix.length;

        // transpose
        for (int i = 0; i < n; i++) {

            // start from i+1 to avoid double swap
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse rows
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {

        RotateMatrixBy90Degree obj =
                new RotateMatrixBy90Degree();

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        obj.rotateMatrix(matrix);

        System.out.println("Rotated Matrix:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}

