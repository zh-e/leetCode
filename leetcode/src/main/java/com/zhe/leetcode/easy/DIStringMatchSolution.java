package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.ArrayUtils;

/**
 * 942. DI String Match
 *
 * @author zhangzhe
 */
public class DIStringMatchSolution {

    public static void main(String[] args) {
        ArrayUtils.printArry(diStringMatch("DDI"));
    }

    private static int[] diStringMatch(String S) {
        int left = 0;
        int right = S.length();
        int len = right;
        int[] res = new int[right + 1];
        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            if ('I' == c) {
                res[i] = left++;
            }
            if ('D' == c) {
                res[i] = right--;
            }
        }
        res[len] = left;
        return res;
    }

}
