package Arrayproblems;

public class InverseCount {
    
    public static int count = 0;

    static int inversionCount(int nums[]) {
        count = 0;
        mergeSort(nums,0,nums.length-1); 
        return count;
    }

    static void mergeSort(int [] nums,int low,int high){
        if(low < high){
            int mid = (low + high) / 2;

            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);

            merge(nums,low,mid,high);
        }
    }

    static void merge(int[] nums,int low,int mid,int high){

        int left = low;
        int right = mid + 1;
        int k = 0;

        int temp[] = new int[high - low + 1];

        while(left <= mid && right <= high){

            if(nums[left] <= nums[right]){
                temp[k++] = nums[left++];
            }
            else{
                temp[k++] = nums[right++];
                count += (mid - left + 1);
            }
        }

        while(left <= mid){
            temp[k++] = nums[left++];
        }

        while(right <= high){
            temp[k++] = nums[right++];
        }

        for(int i = low; i <= high; i++){
            nums[i] = temp[i - low];
        }
    }

    public static void main(String[] args) {

        int[] nums = {2,4,1,3,5};

        int result = inversionCount(nums);

        System.out.println("Inversion Count: " + result);

    }
}

