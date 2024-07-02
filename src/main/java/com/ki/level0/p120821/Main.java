package com.ki.level0.p120821;
//정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의
// 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int[] num_list) {

        Integer[] b = Arrays.stream(num_list).boxed().toArray(Integer[]::new);

        List<Integer> list = Arrays.asList(b);

        Collections.reverse(list);

        Integer[] reverseArr = list.toArray(b);

        int[] a = Arrays.stream(reverseArr)
                .mapToInt(Integer::intValue)
                .toArray();

        return a;
    }
}
