package Sort;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Long[] arrMax = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            insert(arrMax,nums[i]);
        }
        if(arrMax[2] != Long.MIN_VALUE){
            return Math.toIntExact(arrMax[2]);
        }
        return Math.toIntExact(arrMax[0]);
    }

    private void insert(Long[] arrMax, int val) {
        int n = arrMax.length;
        int i = 0;
        while(i < n){
            if(val == arrMax[i]){
                return;
            }else if(val> arrMax[i]){
                break;
            }else{
                i++;
            }
        }
        if(i<n){
            for (int j = n-2; j >= i; j--) {
                arrMax[j+1] = arrMax[j];
            }
            arrMax[i] = (long) val;
        }
    }


}
