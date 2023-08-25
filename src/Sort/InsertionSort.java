package Sort;

public class InsertionSort {
    public void insertionSort(int[] nums){

        // 2 3 1 0 5  3  j=0  1 j=1
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int ai = nums[i];
            int j = i - 1;
            while(j>=0 && nums[j]>=ai){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = ai;
            printArray(nums);
        }
    }

    public void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }

}
