package Arrayproblems;

public class RunningSum1DArray {
     public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }

    public static void main(String[] args) {
        RunningSum1DArray obj = new RunningSum1DArray();

        int[] nums = {1, 2, 3, 4};

        int[] result = obj.runningSum(nums);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
