package com.ki.level1.p12932;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 {5, 4, 3, 2, 1}")
    void t1() {
        Solution solution = new Solution();
        assertThat(solution.solution(12345)).isEqualTo(new int[]{5, 4, 3, 2, 1});
    }

    @Test
    @DisplayName("값 {7, 8, 9}")
    void t2() {
        Solution solution = new Solution();
        assertThat(solution.solution(987)).isEqualTo(new int[]{7, 8, 9});
    }

    @Test
    @DisplayName("값 {9, 2, 5, 6}")
    void t3() {
        Solution solution = new Solution();
        assertThat(solution.solution(6529)).isEqualTo(new int[]{9, 2, 5, 6});
    }
}
