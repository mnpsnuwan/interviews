/*
 * Copyright (c) 2023. IMATRIXLABS (PVT) LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of IMATRIXLABS
 * (PVT) LTD. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with IMATRIXLABS (PVT) LTD.
 *
 */
package leetcode.arrays.mergeSortedArray;

/**
 * Created by IntelliJ IDEA.
 * Project : interviews
 * Class : {@link Solution}
 * User : Nuwan Samarasinghe
 * Date : 05Nov2023
 * Time : 1:16 PM
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = n + m;

        for(int i = m; i < len; i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}