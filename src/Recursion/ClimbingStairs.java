package Recursion;

public class ClimbingStairs {
    int[] F = new int[46];
    public int climbStairs(int n) {
        if(F[n] != 0){
            return F[n];
        }
        if(n==1) {
            F[1] = 1;
            return 1;
        }
        if(n==2){
            F[2] = 2;
            return 2;
        }
         F[n] = climbStairs(n-1) + climbStairs(n-2);
        return F[n];
    }
}
