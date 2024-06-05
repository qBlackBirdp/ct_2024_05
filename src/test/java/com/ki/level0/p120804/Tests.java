package com.ki.level0.p120804;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("2, 3 => 6")
    void t1() {
        assertThat(new Solution().solution(2,3)).isEqualTo(6);
    }
    @Test
    @DisplayName("3, 3 => 9")
    void t2() {
        assertThat(new Solution().solution(3,3)).isEqualTo(9);
    }
    @Test
    @DisplayName("35, 3 => 105")
    void t3() {
        assertThat(new Solution().solution(35,3)).isEqualTo(105);
    }
}
