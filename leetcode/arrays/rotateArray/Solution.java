/*
 * Copyright (c) 2023. IMATRIXLABS (PVT) LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of IMATRIXLABS
 * (PVT) LTD. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with IMATRIXLABS (PVT) LTD.
 *
 */
package leetcode.arrays.rotateArray;

/**
 * Created by IntelliJ IDEA.
 * Project : interviews
 * Class : {@link Solution}
 * User : Nuwan Samarasinghe
 * Date : 02Nov2023
 * Time : 10:13 AM
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        if(k < 0){
            k += n;
        }

        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);

        for( int i = 0; i < nums.length; i++ )
        {
            System.out.println(nums[i]);
        }
    }

    public static void reverse(int nums[], int i, int j){
        int left = i;
        int right = j;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        Solution solution = new Solution();
        solution.rotate( nums, 3 );
    }
}
