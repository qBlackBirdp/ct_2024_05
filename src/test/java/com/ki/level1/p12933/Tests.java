package com.ki.level1.p12933;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 873211")
    void t1() {
        Solution solution = new Solution();
        assertThat(solution.solution(118372)).isEqualTo(873211);
    }

    @Test
    @DisplayName("값 987654321")
    void t2() {
        Solution solution = new Solution();
        assertThat(solution.solution(126378495)).isEqualTo(987654321);
    }
}
