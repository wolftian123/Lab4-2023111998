package com.hit.lab2;

import java.util.Arrays;

class Solution4 {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        long exp = 1;
        int[] buf = new int[nums.length];
        int maxVal = Arrays.stream(nums).max().getAsInt();

        while (maxVal >= exp) {
            int[] cnt = new int[10];
            for (int i = 0; i < nums.length; i++) {
                int digit = (int) ((nums[i] / exp) % 10);
                cnt[digit]++;
            }
            for (int i = 1; i < 10; i++) {
                cnt[i] += cnt[i - 1];
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                int digit = (int) ((nums[i] / exp) % 10);
                buf[cnt[digit] - 1] = nums[i];
                cnt[digit]--;
            }
            System.arraycopy(buf, 0, nums, 0, nums.length);
            exp *= 10;
        }

        int ret = 0;
        for (int i = 1; i < nums.length; i++) {
            ret = Math.max(ret, nums[i] - nums[i - 1]);
        }
        return ret;
    }
}
