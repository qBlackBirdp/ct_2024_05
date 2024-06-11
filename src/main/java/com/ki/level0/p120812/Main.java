package com.ki.level0.p120812;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
// 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다
public class Main {
    public static void main(String[] args) {
    }
}


class Solution {
    public int solution(int[] array) {
        // 빈도수를 저장할 Map
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 배열 요소의 빈도를 계산하여 Map에 저장
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            // `getOrDefault` 메서드를 사용하여 키가 존재하면 해당 값을 반환하고,
            // 존재하지 않으면 기본값(여기서는 0)을 반환합니다.
            // 그런 다음, 현재 값을 1 증가시켜 다시 Map에 저장합니다.
        }

        // 최빈값을 찾기 위한 변수들
        int mostFrequentValue = array[0]; // 최빈값을 저장할 변수, 초기값은 첫 번째 요소
        int maxFrequency = 0; // 최대 빈도수를 저장할 변수
        boolean isDuplicate = false; // 최빈값이 중복되는지 여부를 저장할 변수

        // Map을 순회하며 최빈값을 찾음
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int value = entry.getKey(); // 현재 키
            int frequency = entry.getValue(); // 현재 키의 빈도수

            if (frequency > maxFrequency) {
                // 현재 빈도수가 최대 빈도수보다 크면
                mostFrequentValue = value; // 최빈값 갱신
                maxFrequency = frequency; // 최대 빈도수 갱신
                isDuplicate = false; // 중복 여부 초기화
            } else if (frequency == maxFrequency) {
                // 현재 빈도수가 최대 빈도수와 같으면
                isDuplicate = true; // 중복 플래그 설정
            }
        }

        // 최빈값이 중복되면 -1을 반환
        if (isDuplicate) {
            return -1;
        }

        return mostFrequentValue; // 최빈값 반환
    }
}
