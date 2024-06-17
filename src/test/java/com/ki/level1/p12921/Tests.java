package com.ki.level1.p12921;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("값 4")
    void t1() {
        assertThat(new com.ki.level1.p12921.Solution().solution(10)).isEqualTo(4);
    }
    @Test
    @DisplayName("값 3")
    void t2() {
        assertThat(new com.ki.level1.p12921.Solution().solution(5)).isEqualTo(3);
    }
    @Test
    @DisplayName("값 25")
    void t3() {
        assertThat(new com.ki.level1.p12921.Solution().solution(100)).isEqualTo(25);
    }
}
