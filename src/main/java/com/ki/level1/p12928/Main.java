package com.ki.level1.p12928;

//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
//입출력 예 #1
//12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.

public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
    public int solution(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}