package com.ki.level0.p120811;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("값 5, 4")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{2, 4, 6, 8, 10});
    }
}
