package com.ki.level0.p120802;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("값 2")
    void t1() {
        assertThat(new Solution().solution(1,1)).isEqualTo(2);
    }
    @Test
    @DisplayName("값 2000")
    void t2() {
        assertThat(new Solution().solution(2,3)).isEqualTo(5);
    }
}

