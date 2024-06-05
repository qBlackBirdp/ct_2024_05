package com.ki.level0.p120817;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("값 2")
    void t1() {
        int[] arr = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9, 10, 11, 12};
        assertThat(new Solution().solution(arr)).isEqualTo(6.5);
    }
    @Test
    @DisplayName("값 2000")
    void t2() {
        int[] arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        assertThat(new Solution().solution(arr2)).isEqualTo(94.0);
    }
}