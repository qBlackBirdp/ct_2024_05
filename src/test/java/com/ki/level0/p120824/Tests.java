package com.ki.level0.p120824;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 2, 3")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{2, 3});
    }

    @Test
    @DisplayName("값 0, 4")
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 3, 5, 7})).isEqualTo(new int[]{0, 4});
    }

    @Test
    @DisplayName("값 3, 1")
    void t3() {
        assertThat(new Solution().solution(new int[]{1, 2, 4, 6})).isEqualTo(new int[]{3, 1});
    }
}
