package ArrayAndString;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int k = 0;
        if(arr.length<3){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[k]< arr[i]){
                k = i;
            }
        }
        if(k== arr.length-1 || k==0){
            return false;
        }
        for (int i = 0; i < k; i++) {
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for (int i = arr.length-1; i > k; i--) {
            if(arr[i]>=arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public boolean validMountainArray2(int[] arr) {
        int n = arr.length;
        boolean isValidMountain = true;
        for (int i = 0; i < n-1; i++) {
            int j = i + 1;
            if(arr[i]<arr[j]){
                if(isValidMountain){
                }else{
                    return false;
                }
            }else if(arr[i]>arr[j]){
                if(isValidMountain==false){

                }else{
                    if(i==0){
                        return false;
                    }
                    isValidMountain = false;
                }
            }else{
                return false;
            }
        }
        if(isValidMountain==false){
            return true;
        }
        return false;
    }
}
