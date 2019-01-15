package com.lsy.LeetCodeCases;

import java.util.Arrays;

/**
 * @author liu74
 */
public class MultiplyStrings {
    public static void main(String[] args) {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        String num1 = "123";
        String num2 = "456";
        int n = 5;
        String res = multiplyStrings.multiply(num1, num2);
        System.out.println(res);


    }


    /**
     * 给定两个以字符串形式表示的非负整数 num1 和 num2
     * <br/>返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
     *
     * @param num1 字符串表示的非负整数1 长度小于110
     * @param num2 字符串表示的非负整数2 长度小于110
     * @return 字符串表示的非负整数乘积 长度小于218
     */
    private String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        char[] chars2 = num2.toCharArray();
        int length2 = num2.length();
        String tempString = num1;
        String resultString = "0";
        for (int i = 0; i < length2; i++) {
            tempString = appendZeroString(multiOne(num1, charToInt(chars2[length2 - i - 1])), i);
            resultString = sumTwo(resultString, tempString);
        }
        return resultString;
    }

    private String appendZeroString(String num, int n) {
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < n; i++) {
            sb.append("0");
        }
        return sb.toString();
    }

    private String multiOne(String num, int n) {
        String tempNum = num;
        if (n == 0) {
            tempNum = "0";
        } else if (n == 1) {
            tempNum = num;
        } else {
            for (int i = 1; i < n; i++) {
                tempNum = sumTwo(tempNum, num);
            }
        }
        return tempNum;
    }

    /**
     * 两个长度小于110很长的字符串表示的非负整数之和的字符串表示
     *
     * @param num1 字符串表示的非负整数1 长度小于218
     * @param num2 字符串表示的非负整数2 长度小于218
     * @return 字符串表示的非负整数之和 长度小于218
     */
    private String sumTwo(String num1, String num2) {

        char[] chars1 = reverseString(num1).toCharArray();
        char[] chars2 = reverseString(num2).toCharArray();
        char[] longChars, shortChars;
        int longLength, shortLength;
        if (chars1.length > chars2.length) {
            longLength = chars1.length;
            longChars = chars1;
            shortLength = chars2.length;
            shortChars = chars2;
        } else {
            longLength = chars2.length;
            longChars = chars2;
            shortLength = chars1.length;
            shortChars = chars1;
        }
        // 返回值的长度最大为218
        char[] charsResult = new char[218];
        int realLength = 0, temp = 0, i = 0, tempSum = 0;
        for (; i < longLength; i++) {
            if (i < shortLength) {
                tempSum = charToInt(shortChars[i]) + charToInt(longChars[i]) + temp;
                charsResult[i] = intToChar(tempSum % 10);
                temp = tempSum / 10;
            } else {
                tempSum = charToInt(longChars[i]) + temp;
                charsResult[i] = intToChar(tempSum % 10);
                temp = tempSum / 10;
            }
        }
        if (temp > 0) {
            charsResult[i] = intToChar(temp);
            realLength = longLength + 1;
        } else {
            realLength = longLength;
        }
        char[] realResult = new char[realLength];
        // 得到的结果数字是倒序的，颠倒一下
        for (int j = 0; j < realLength; j++) {
            realResult[j] = charsResult[realLength - j - 1];
        }
        return new String(realResult);
    }

    private int charToInt(char a) {
        return a - '0';
    }

    /**
     * @param a 一位整数
     * @return char表示的0-9整数
     */
    private char intToChar(int a) {
        return (char) (a + '0');
    }

    /**
     * 字符串倒序
     *
     * @param s
     * @return
     */
    private String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        return sb.reverse().toString();
    }

}
