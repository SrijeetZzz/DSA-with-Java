package Arrayproblems;
public class GCDinArray {
    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        GCDinArray obj = new GCDinArray();
        int result = obj.findGCD(nums);
        System.out.println("GCD of min and max element: " + result);
    }
    public int findGCD(int[] nums) {
        int maxElement = getMax(nums);
        int minElement = getMin(nums);
        return gcd(minElement,maxElement);
        

    }
    public int getMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num>=max){
                max=num;
            }
        }
        return max;

    }
    public int getMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num: nums){
            if(num<=min){
                min=num;
            }
        }
        return min;
    }
    public int gcd(int a, int b){
        while(a!=0){
            int temp = b%a;
            b = a;
            a = temp;
        }
        return b;
    }
}
