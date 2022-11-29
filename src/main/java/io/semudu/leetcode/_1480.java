package io.semudu.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/*
https://leetcode.com/problems/running-sum-of-1d-array/

724. Find Pivot Index

Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0


Constraints:

1 <= nums.length <= 104
-1000 <= nums[i] <= 1000

 */

public class _1480 {

    List<int[]> testList = Arrays.asList(
            new int[]{1, 2, 3, 4},
            new int[]{1, 1, 1, 1, 1},
            new int[]{3, 1, 2, 10, 1});

    List<int[]> expectedList = Arrays.asList(
            new int[]{1, 3, 6, 10},
            new int[]{1, 2, 3, 4, 5},
            new int[]{3, 4, 6, 16, 17});


    public int[] runningSum(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            nums[i] += nums[i - 1];
            i++;
        }
        return nums;
    }


    @Test
    public void test() {
        for (int i = 0; i < testList.size(); i++) {
            assertArrayEquals(expectedList.get(i), runningSum(testList.get(i)));
        }
    }


}
