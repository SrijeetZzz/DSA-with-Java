package Arrayproblems;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args){
        int left = 1;
        int right = 22;
        SelfDividingNumbers obj = new SelfDividingNumbers();
        List<Integer> result = obj.selfDividingNumbers(left, right);
        System.out.println(result);
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            if(getNum(i)){
                arr.add(i);
            }
        }
        return arr;
    }
    public boolean getNum(int num){
        int originalNum = num;
        while(num>0){
            int digit = num%10;
            if(digit==0 || originalNum%digit!=0){
                return false;
            }
            num = num/10;
        }
        return true;
    }
}
