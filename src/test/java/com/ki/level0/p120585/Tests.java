package com.ki.level0.p120585;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 3")
    void t1() {
        assertThat(new Solution().solution(new int[]{149, 180, 192, 170}, 167)).isEqualTo(3);
    }

    @Test
    @DisplayName("값 0")
    void t2() {
        assertThat(new Solution().solution(new int[]{180, 120, 140}, 190)).isEqualTo(0);
    }
}
