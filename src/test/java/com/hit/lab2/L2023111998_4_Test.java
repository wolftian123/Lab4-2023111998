package com.hit.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class L2023111998_4_Test {

    @Test
    public void testSingleElement() {
        Solution4 solution = new Solution4();
        int[] nums = {10};
        assertEquals("单元素数组应返回0", 0, solution.maximumGap(nums));
    }

    @Test
    public void testEmptyArray() {
        Solution4 solution = new Solution4();
        int[] nums = {};
        assertEquals("空数组应返回0", 0, solution.maximumGap(nums));
    }

    @Test
    public void testSortedArray() {
        int[] nums = {1, 3, 6, 9};
        Solution4 solution = new Solution4();
        assertEquals("已排序数组应正确计算最大间隙", 3, solution.maximumGap(nums));
    }
    @Test
    public void testUnsortedArray() {
        int[] nums = {3, 6, 9, 1};
        Solution4 solution = new Solution4();
        assertEquals("未排序数组排序后应正确计算最大间隙", 3, solution.maximumGap(nums));
    }

    @Test
    public void testAllSameElements() {
        int[] nums = {5, 5, 5, 5};
        Solution4 solution = new Solution4();
        assertEquals("所有元素相同时最大间隙应为0", 0, solution.maximumGap(nums));
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000, 1, 10000000, 100};
        Solution4 solution = new Solution4();
        assertEquals("应正确处理大数值数组", 9000000, solution.maximumGap(nums));
    }
    @Test
    public void testExample1() {
        int[] nums = {3, 6, 9, 1};
        Solution4 solution = new Solution4();
        assertEquals("示例1应返回3", 3, solution.maximumGap(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {10};
        Solution4 solution = new Solution4();
        assertEquals("示例2应返回0", 0, solution.maximumGap(nums));
    }
}
