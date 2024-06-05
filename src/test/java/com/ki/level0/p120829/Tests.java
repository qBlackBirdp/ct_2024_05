package com.ki.level0.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("값 1")
    void t1() {
        assertThat(new Solution().solution(89)).isEqualTo(1);
    }
    @Test
    @DisplayName("값 2")
    void t2() {
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }
    @Test
    @DisplayName("값 3")
    void t3() {
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }
    @Test
    @DisplayName("값 4")
    void t4() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
}