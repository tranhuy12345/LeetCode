
package solution;

import ArrayAndString.*;
import Recursion.ClimbingStairs;
import Recursion.Fibo;
import Recursion.PrintElement;
import Sort.BubbleSort;
import Sort.InsertionSort;
import Sort.SelectionSort;
import Sort.ThirdMaximumNumber;

import java.util.List;

/**
 *
 * @author thuhuytran
 */
public class Solution {
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int n = climbingStairs.climbStairs(3);
        System.out.println(n);
    }
}
