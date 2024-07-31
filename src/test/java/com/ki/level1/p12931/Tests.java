package com.ki.level1.p12931;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 6")
    void t1() {
        Solution solution = new Solution();
        assertThat(solution.solution(123)).isEqualTo(6);
    }

    @Test
    @DisplayName("값 24")
    void t2() {
        Solution solution = new Solution();
        assertThat(solution.solution(987)).isEqualTo(24);
    }

    @Test
    @DisplayName("값 5")
    void t3() {
        Solution solution = new Solution();
        assertThat(solution.solution(11111)).isEqualTo(5);
    }
}
