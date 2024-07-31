package com.ki.level1.p12932;

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
    public int[] solution(long n) {
        String nums = Long.toString(n);

        String reversNums = new StringBuilder(nums).reverse().toString();

        int[] res = new int[reversNums.length()];
        for (int i = 0; i < reversNums.length(); i++) {
            res[i] = Character.getNumericValue(reversNums.charAt(i));
        }
        return res;
    }
}
