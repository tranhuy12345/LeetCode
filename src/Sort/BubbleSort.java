package Sort;

public class BubbleSort {
    public void bubbleSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isCheck = true;
            for (int j = 0; j < n-1; j++) {
                int k = j+1;
                if(nums[j]>nums[k]){
                    isCheck = false;
                    int temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                }
            }
            printArray(nums);
            System.out.println();
            if(isCheck){
                break;
            }
        }
    }
    public void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
