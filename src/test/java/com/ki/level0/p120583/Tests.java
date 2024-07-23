package com.ki.level0.p120583;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 2, 3")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 1, 2, 3, 4, 5}, 1)).isEqualTo(2);
    }

    @Test
    @DisplayName("값 0, 4")
    void t2() {
        assertThat(new Solution().solution(new int[]{0, 2, 3, 4}, 1)).isEqualTo(0);
    }

    @Test
    @DisplayName("값 3, 1")
    void t3() {
        assertThat(new Solution().solution(new int[]{1, 2, 4, 6}, 6)).isEqualTo(1);
    }
}
