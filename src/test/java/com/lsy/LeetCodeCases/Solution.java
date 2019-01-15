package com.lsy.LeetCodeCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Solution {

    public int[] sortArrayByParityII(int[] A) {
        int length = A.length;
        int oddIndex = 0, evenIndex = 0;
        int[] odds = new int[length / 2];
        int[] evens = odds.clone();
        for (int i1 : A) {
            if ((i1 & 1) == 1) {
                odds[oddIndex++] = i1;
            } else {
                evens[evenIndex++] = i1;
            }
        }
        oddIndex = 0;
        evenIndex = 0;
        boolean switchFlag = false;
        for (int i = 0; i < length; i++) {
            if (!switchFlag) {
                A[i] = evens[evenIndex++];
                switchFlag = true;
            } else {
                A[i] = odds[oddIndex++];
                switchFlag = false;
            }
        }
        return A;
    }

    public class IntComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return (int) o1 - (int) o2;
        }
    }

    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength != tLength) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        ArrayList<Integer> sList = new ArrayList(sLength);
        ArrayList<Integer> tList = new ArrayList(tLength);
        for (char a : sChar) {
            sList.add((int) a);
        }
        IntComparator intComparator = new IntComparator();
        sList.sort(intComparator);
        for (char a : tChar) {
            tList.add((int) a);
        }
        tList.sort(intComparator);
        for (int i = 0; i < sLength; i++) {
            if (!sList.get(i).equals(tList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "anagram";
        String t= "nagaram";


        System.out.println(solution.isAnagram(s,t));
    }

}
