package com.ki.level0.p120831;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("값 30")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(30);
    }
    @Test
    @DisplayName("값 6")
    void t2() {
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }
    @Test
    @DisplayName("값 6")
    void t3() {
        assertThat(new Solution().solution(5)).isEqualTo(6);
    }
    @Test
    @DisplayName("값 6")
    void t4() {
        assertThat(new Solution().solution(7)).isEqualTo(12);
    }
}