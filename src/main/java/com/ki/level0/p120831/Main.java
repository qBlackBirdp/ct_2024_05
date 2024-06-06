package com.ki.level0.p120831;
//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int i = 2; i <=n; i += 2) {
            sum += i;
        }
        return sum;
    }
}