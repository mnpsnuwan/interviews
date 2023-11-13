public class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> values = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            if(values.contains(2*arr[i]) ||
                       (arr[i] % 2 == 0 && values.contains(arr[i]/2))){
                return true;
            }
            values.add(arr[i]);
        }
        return false;
    }
}