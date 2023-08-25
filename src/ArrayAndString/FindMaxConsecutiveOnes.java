package ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]==0){
                count = 0;
            }else{
                count++;
            }
            if(max<count){
                max = count;
            }
        }
        return max;
    }
}
