package ArrayAndString;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            count[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            if(count[index] == 1){
                return i;
            }
        }
        return -1;
    }
}
