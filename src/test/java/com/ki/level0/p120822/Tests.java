package com.ki.level0.p120822;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 noraj")
    void t1() {
        assertThat(new Solution().solution("jaron")).isEqualTo("noraj");
    }

    @Test
    @DisplayName("값 daerb")
    void t2() {
        assertThat(new Solution().solution("bread")).isEqualTo("daerb");
    }

    @Test
    @DisplayName("값 tra")
    void t3() {
        assertThat(new Solution().solution("art")).isEqualTo("tra");
    }
}
