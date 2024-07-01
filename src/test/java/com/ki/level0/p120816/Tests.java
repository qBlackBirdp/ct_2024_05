package com.ki.level0.p120816;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 2")
    void t1() {
        assertThat(new Solution().solution(7, 10)).isEqualTo(2);
    }
    @Test
    @DisplayName("값 5")
    void t2() {
        assertThat(new Solution().solution(4, 12)).isEqualTo(3);
    }
//    @Test
//    @DisplayName("값 2")
//    void t3() {
//        assertThat(new Solution().solution(4)).isEqualTo(2);
//    }
}
