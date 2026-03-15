package Arrayproblems;

/*
Problem Statement:
You are given an array where arr[i] is the price of a stock on day i.

You want to maximize your profit by choosing one day to buy
and one later day to sell.

Return the maximum profit you can achieve.

If no profit is possible, return 0.

Input:
int[] prices

Output:
int → maximum profit

Example:
Input:
[7,1,5,3,6,4]

Output:
5

Explanation:
Buy at 1, sell at 6 → profit = 5

------------------------------------------------

Approach

1. Keep track of minimum price so far.
2. For each day, calculate profit if sold today.
3. Update maxProfit.
4. Update minPrice if smaller found.

We must buy before selling.

------------------------------------------------

Algorithm

minPrice = arr[0]
maxProfit = 0

for i from 1 to n-1

    if arr[i] < minPrice
        update minPrice

    else
        profit = arr[i] - minPrice
        update maxProfit

return maxProfit

------------------------------------------------

Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
*/

public class BestTimeToBuySellStock1 {

    public int stockBuySell(int[] arr) {

        int l = arr.length;

        int maxProfit = 0;

        int minPrice = arr[0];

        for (int i = 1; i < l; i++) {

            if (arr[i] < minPrice) {

                minPrice = arr[i];

            } else {

                int profit = arr[i] - minPrice;

                maxProfit = Math.max(profit, maxProfit);
            }
        }

        return maxProfit;
    }


    // -------- main method --------
    public static void main(String[] args) {

        BestTimeToBuySellStock1 obj =
                new BestTimeToBuySellStock1();

        int[] prices = {7,1,5,3,6,4};

        int result = obj.stockBuySell(prices);

        System.out.println("Max Profit = " + result);
    }
}