package com.ki.level0.p120803;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("2, 3 => -1")
    void t1() {
        assertThat(new Solution().solution(15,3)).isEqualTo(12);
    }
    @Test
    @DisplayName("3, 3 => 0")
    void t2() {
        assertThat(new Solution().solution(3,3)).isEqualTo(0);
    }
    @Test
    @DisplayName("10, 3 => 7")
    void t3() {
        assertThat(new Solution().solution(10,3)).isEqualTo(7);
    }
}
