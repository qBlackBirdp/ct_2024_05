package com.ki.level0.p120830;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 124000")
    void t1() {
        assertThat(new Solution().solution(10, 3)).isEqualTo(124000);
    }
    @Test
    @DisplayName("값 308000")
    void t2() {
        assertThat(new Solution().solution(25, 6)).isEqualTo(308000);
    }
    @Test
    @DisplayName("값 126000")
    void t3() {
        assertThat(new Solution().solution(10, 4)).isEqualTo(126000);
    }
    @Test
    @DisplayName("값 768000")
    void t4() {
        assertThat(new Solution().solution(64, 6)).isEqualTo(768000);
    }
    @Test
    @DisplayName("값 768000")
    void t5() {
        assertThat(new Solution().solution(20, 6)).isEqualTo(248000);
    }
    @Test
    @DisplayName("값 768000")
    void t6() {
        assertThat(new Solution().solution(3, 1)).isEqualTo(38000);
    }
}
