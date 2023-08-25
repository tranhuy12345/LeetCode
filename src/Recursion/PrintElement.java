package Recursion;

public class PrintElement {
    public void printElement(int[] nums,int index){
        if(index<0 || index>=nums.length){
            return;
        }
        printElement(nums,index+1);
        System.out.println(nums[index]);

    }
}
