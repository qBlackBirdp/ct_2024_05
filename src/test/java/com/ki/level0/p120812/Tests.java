package com.ki.level0.p120812;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("값 7")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 3, 3, 4})).isEqualTo(3);
    }
    @Test
    @DisplayName("값 7")
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 1, 2, 2})).isEqualTo(-1);
    }
    @Test
    @DisplayName("값 7")
    void t3() {
        assertThat(new Solution().solution(new int[]{1})).isEqualTo(1);
    }
    @Test
    @DisplayName("값 7")
    void t4() {
        assertThat(new Solution().solution(new int[]{3, 3, 3, 3, 3})).isEqualTo(3);
    }
}
