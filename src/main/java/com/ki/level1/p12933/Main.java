package com.ki.level1.p12933;

//함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//예를들어 n이 118372면 873211을 리턴하면 됩니다.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {}
}
class Solution {
    public long solution(long n) {
        // 1. 숫자를 문자열로 변환
        String s = String.valueOf(n);

        // 2. 문자열을 문자 배열로 변환
        char[] chars = s.toCharArray();

        // 3. 문자 배열을 정렬
        Arrays.sort(chars);

        // 4. 정렬된 문자 배열을 역순으로 변환
        StringBuilder sb = new StringBuilder(new String(chars));
        sb.reverse();

        // 5. 역순으로 정렬된 문자열을 정수로 변환하여 반환
        return Long.parseLong(sb.toString());
    }
}