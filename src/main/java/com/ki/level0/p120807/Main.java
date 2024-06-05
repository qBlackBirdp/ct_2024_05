package com.ki.level0.p120807;

public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().solution(2, 3));
        System.out.println(new Solution().solution(3, 3));
    }
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2){
            return 1;
        }
        return -1;
    }
}