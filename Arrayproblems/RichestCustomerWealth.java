package Arrayproblems;
// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.
// Example 2:

// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 7+3=10


// problems faced & Key Points to rememeber
// 1. How to iterate on 2d arrays
// 2. Forget to add int currSum at the top as for each row it should start from 0



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
