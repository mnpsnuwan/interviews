// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]
 
// Constraints:
// 1 <= nums.length <= 5 * 104
// -109 <= nums[i] <= 109
 
// Follow up: Could you solve the problem in linear time and in O(1) space?

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        if (n == 0) return res;
        if (n == 1) 
        { 
            res.add(nums[0]); 
            return res;
        }
        
        Arrays.sort(nums);
        int third = n / 3;
        int count = 1;
        for (int i = 1; i < n; i ++)
        {
            if (nums[i] == nums[i-1])
            {
                count ++; // for nums[i]
            }
            else
            {
                if (count > third) res.add(nums[i-1]);
                
                count = 1; // for nums[i]
            }
        }
        
        if (count > third) res.add(nums[n-1]);
        
        return res;
    }
}