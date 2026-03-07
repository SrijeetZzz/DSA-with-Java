package Arrayproblems;

public class CountReversePairs {
    public int count = 0;

    public int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return count;
    }

    public void mergeSort(int [] nums,int low,int high){
        if(low < high){
            int mid = (low + high) / 2;

            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);

            countPairs(nums,low,mid,high);
            merge(nums,low,mid,high);
        }
    }

    public void merge(int[] nums,int low,int mid,int high){
        int left = low;
        int right = mid + 1;
        int k = 0;

        int temp[] = new int[high-low+1];

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp[k++] = nums[left++];
            }
            else{
                temp[k++] = nums[right++];
            }
        }

        while(left <= mid){
            temp[k++] = nums[left++];
        }

        while(right <= high){
            temp[k++] = nums[right++];
        }

        for(int i = low; i <= high; i++){
            nums[i] = temp[i-low];
        }
    }

    public void countPairs(int[] nums, int low, int mid, int high){
        int right = mid + 1;

        for(int i = low; i <= mid; i++){
            while(right <= high && nums[i] > nums[right] * 2L){
                right++;
            }

            count += right - (mid + 1);
        }
    }

    public static void main(String[] args) {

        CountReversePairs obj = new CountReversePairs();

        int[] nums = {1,3,2,3,1};

        int result = obj.reversePairs(nums);

        System.out.println("Reverse Pairs: " + result);
    } 
}
