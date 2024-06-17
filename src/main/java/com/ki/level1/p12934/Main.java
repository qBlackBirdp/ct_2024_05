package com.ki.level1.p12934;
// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
    public long solution(long n) {
        long m = (long)Math.sqrt(n);
        if (m * m == n){
            long x = m + 1;
            return x * x;
        }
        return -1;
    }
}