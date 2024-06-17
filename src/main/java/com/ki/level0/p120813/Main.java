package com.ki.level0.p120813;

import java.util.Arrays;

//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int n) {
        // 홀수 개수 구하기
        int x = (n + 1) / 2;
        //홀수 개수 만큼 배열 생성
        int[] odd = new int[x];

        // 홀수 값 배열에 채우기
        for (int i = 0, num = 1; i < x; i++, num += 2) {
            odd[i] = num;
        }

        return odd;
    }
}
