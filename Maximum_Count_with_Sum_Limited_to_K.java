import java.util.*;

class Maximum_Count_with_Sum_Limited_to_K {
    public int toyCount(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int c = 0;
        for(int i : arr){
            if(i<=k){
                k -= i;
                c++;
            }
            else break;
        }
        return c;
    }
}