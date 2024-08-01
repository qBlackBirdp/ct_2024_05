package com.ki.level1.p12928;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 28")
    void t1() {
        Solution solution = new Solution();
        assertThat(solution.solution(12)).isEqualTo(28);
    }

    @Test
    @DisplayName("값 6")
    void t2() {
        Solution solution = new Solution();
        assertThat(solution.solution(5)).isEqualTo(6);
    }
}
