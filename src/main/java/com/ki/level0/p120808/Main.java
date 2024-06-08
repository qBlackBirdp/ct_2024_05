package com.ki.level0.p120808;

import java.util.Arrays;

//첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로
// 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록
// solution 함수를 완성해보세요.
public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = denom1 * denom2 / gcd(denom1, denom2); // 최소공배수

        // 분모를 최소공배수로 맞추기 위해 분자도 변경
        int n1 = numer1 * (lcm / denom1);
        int n2 = numer2 * (lcm / denom2);

        // 합친 분자
        int numer = n1 + n2;

        // 약분하기 위해 최대공약수 계산
        int gcdValue = gcd(numer, lcm);

        // 결과 분자와 분모를 약분한 값을 저장
        return new int[]{numer / gcdValue, lcm / gcdValue};
    }

    private int gcd(int a, int b) { // 최대공약수 로직
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
