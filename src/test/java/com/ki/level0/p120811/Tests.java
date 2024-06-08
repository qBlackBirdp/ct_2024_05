package com.ki.level0.p120811;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("값 7")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 7, 10, 11})).isEqualTo(7);
    }
    @Test
    @DisplayName("값 0")
    void t2() {
        assertThat(new Solution().solution(new int[]{9, -1, 0})).isEqualTo(0);
    }
}
