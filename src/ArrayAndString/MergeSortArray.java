/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayAndString;

/**
 *
 * @author thuhuytran
 */
public class MergeSortArray {
    //88. Merge Sorted Array
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int x : nums2) {
            handlerInserted(x,nums1,m);
            m++;
        }
    }

    private void handlerInserted(int x, int[] nums1, int m) {
        boolean isCheck = false;
        for (int i = 0; i < m; i++) {
            //Search first element > x;            
            if(nums1[i]>x){
                isCheck = true;
                //handler if true
                for (int j = m-1; j >= i; j--) {
                    nums1[j+1] = nums1[j];
                    
                }
                nums1[i] = x;
                break;
            }                
        }
        if(isCheck==false){
               nums1[m] = x;
          }
    }
    
    //Use two pointer
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        
        while (k >= 0){   
            if(i<0 || j<0){
                if(i<0 && j>=0){
                    nums1[k] = nums2[j];
                    j--;
                }
                if(j<0 && i>=0){
                    nums1[k] = nums1[i];
                    i--;
                }
            }else{
               if(nums1[i] > nums2[j]){
                   nums1[k] = nums1[i];
                   i--;
               }else{
                   nums1[k] = nums2[j];
                   j--;
               } 
            }
            k--;
        }
    }
    
}
