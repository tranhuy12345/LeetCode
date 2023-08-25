/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayAndString;

/**
 *
 * @author thuhuytran
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; ) {
            if(nums[i] == val){
                remove(nums,i,n);
                n--;
            }else{
                i++;
            }
        }
        return n;
    }

    private void remove(int[] nums, int i, int n) {
        //Move to pre last because last is don't have element after its
        for (int j = i; j < n-1; j++) {
            nums[j] = nums[j+1];
        }
    }
    
    //Use 2 pointer
    public int removeElement2(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    
}
