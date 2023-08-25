package Sort;

public class SelectionSort {
    public void selectionSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            int j = i + 1;
            while(j<n){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
                j++;
            }
            if(minIndex != i){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
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
