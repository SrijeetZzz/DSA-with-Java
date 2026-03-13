package Arrayproblems;

/*
Problem Statement:
You are given a 2D array accounts where accounts[i][j] represents
the amount of money the i-th customer has in the j-th bank.

Return the wealth that the richest customer has.

Input:
int[][] accounts → 2D array

Output:
Integer → maximum wealth among all customers

Example 1:
Input: [[1,2,3],[3,2,1]]
Output: 6

Example 2:
Input: [[1,5],[7,3],[3,5]]
Output: 10

Approach:
1. Iterate through each row of the 2D array.
2. For each row, calculate the sum of elements.
3. Keep track of the maximum sum found so far.
4. Return the maximum sum.

Key Points:
- Use nested loops to iterate through 2D array.
- Reset currSum = 0 for every row.
- Update max after finishing each row.

Time Complexity: O(n × m)
Space Complexity: O(1)
*/

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {

        int max = 0;

        for (int i = 0; i < accounts.length; i++) {

            int currSum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currSum += accounts[i][j];
            }

            if (currSum > max) {
                max = currSum;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 1, 2}
        };

        int result = maximumWealth(accounts);

        System.out.println("Maximum Wealth: " + result);
    }
}