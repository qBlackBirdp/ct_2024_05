package com.ki.level1.p12954;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 2,4,6,8,10")
    void t1() {
        assertThat(new Solution().solution(2, 5)).isEqualTo(new long[]{2,4,6,8,10});
    }

    @Test
    @DisplayName("값 4, 8, 12")
    void t2() {
        assertThat(new Solution().solution(4, 3)).isEqualTo(new long[]{4, 8, 12});
    }

    @Test
    @DisplayName("값 -4, -8")
    void t3() {
        assertThat(new Solution().solution(-4, 2)).isEqualTo(new long[]{-4, -8});
    }

    @Test
    @DisplayName("값 0, 0")
    void t4() {
        assertThat(new Solution().solution(0, 2)).isEqualTo(new long[]{0, 0});
    }
}
