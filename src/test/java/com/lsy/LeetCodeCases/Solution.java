package com.lsy.LeetCodeCases;

public class Solution {
    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * https://leetcode-cn.com/explore/interview/card/bytedance/242/string/1012/
     *
     * @param s string case
     * @return length Of Longest Substring
     */
    private int lengthOfLongestSubstring(String s) {
        //todo
        return s.length()-1;
    }

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""。
     * https://leetcode-cn.com/explore/interview/card/bytedance/242/string/1014/
     *
     * @param strs string[] case
     * @return longest Common Prefix
     */
    private String longestCommonPrefix(String[] strs) {
        //todo
        return "";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("ashja"));
    }

}
