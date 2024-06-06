package com.ki.level0.p120806;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("값 1500")
    void t1() {
        assertThat(new Solution().solution(3, 2)).isEqualTo(1500);
    }

    @Test
    @DisplayName("값 2333")
    void t2() {
        assertThat(new Solution().solution(7, 3)).isEqualTo(2333);
    }

    @Test
    @DisplayName("값 62")
    void t3() {
        assertThat(new Solution().solution(1, 16)).isEqualTo(62);
    }
}