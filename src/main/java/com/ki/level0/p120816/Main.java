package com.ki.level0.p120816;
//머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와
// 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를
// 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
//입출력 예 #1
//
//10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.
//입출력 예 #2
//
//12명이 4조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 3판을 시켜야 합니다.
public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
//        public static int gcd(int a, int b) { //최대공약수 함수
//            while (b != 0) {
//                int temp = b;
//                b = a % b;
//                a = temp;
//            }
//            return a;
//
//        }
//
//        public static int lcm(int a, int b) { //최소공배수 함수
//            return a * b / gcd(a, b);
//        }

    public int solution(int slice, int n) {

        int pizzaCount = 0;

        for (int i = 1; i <= n; i+=slice) {
            pizzaCount++;
        }

        return pizzaCount;
    }
}