package com.ki.level1.p12954;
//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
//다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public long[] solution(int x, int n) {
        if (n == 0) {
            return new long[0];
        }

        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] =(long) x * (i + 1);
        }

        return answer;
    }
}
