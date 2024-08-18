package com.ki.level1.p12944;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 873211")
    void t1() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{1,2,3,4})).isEqualTo(2.5);
    }

    @Test
    @DisplayName("값 987654321")
    void t2() {
        Solution solution = new Solution();
        assertThat(solution.solution(new int[]{5,5})).isEqualTo(5);
    }
}