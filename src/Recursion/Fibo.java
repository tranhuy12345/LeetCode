package Recursion;

public class Fibo {
    static int[] F = new int[1000];
    public int Fibo(int n){
        if(F[n] != 0){
            return F[n];
        }
        if(n<=2){
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = Fibo(n-1) + Fibo(n-2);
        return F[n];
    }
}
