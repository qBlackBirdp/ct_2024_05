package com.ki.level0.p120820;
//머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
// 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
    public int solution(int age) {
        int birth;

        birth = 2022 - age + 1;
        return birth;
    }
}