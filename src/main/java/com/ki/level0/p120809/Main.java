package com.ki.level0.p120809;



//정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int[] numbers) {

        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] *= 2;
        }

        return numbers;
    }
}