public class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int n = arr.length;
        int j = n - 1;

        while(i + 1 < n && arr[i] < arr[i+1]){
            i++;
        }
        while(j > 0 && arr[j-1] > arr[j]){
            j--;
        }
        if(i > 0 && j == i && j < n - 1){
            return true;
        }
        else{
            return false;
        }
    }
}