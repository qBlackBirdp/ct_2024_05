package com.ki.level1.p12921;

//1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution 을 만들어 보세요.
//
//소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//(1은 소수가 아닙니다.)

public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
