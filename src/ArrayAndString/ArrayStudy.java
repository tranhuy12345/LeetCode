/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayAndString;

/**
 *
 * @author thuhuytran
 */
public class ArrayStudy {
    //1295. Find Numbers with Even Number of Digits
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numsCount = findNumsCount(nums[i]);
            if(numsCount % 2 == 0){
                count++;
            }
        }
        return count;
    }

    private int findNumsCount(int num) {
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}
