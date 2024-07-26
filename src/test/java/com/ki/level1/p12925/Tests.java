package com.ki.level1.p12925;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 2")
    void t1() {
        assertThat("2").isEqualTo(2);
    }

    @Test
    @DisplayName("값 -2")
    void t2() {
        assertThat("-2").isEqualTo(-2);
    }
    @Test
    @DisplayName("값 1234")
    void t3() {
        assertThat("1234").isEqualTo(1234);
    }
    @Test
    @DisplayName("값 -1234")
    void t4() {
        assertThat("-1234").isEqualTo(-1234);
    }
}
