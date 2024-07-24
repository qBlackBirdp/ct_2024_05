package com.ki.level1.p12954;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int x, int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }

        return answer;
    }
}