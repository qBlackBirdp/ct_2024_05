package com.ki.level0.p120819;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
        @Test
        @DisplayName("값 1, 0")
        void t1() {
            assertThat(new Solution().solution(5500)).isEqualTo(new int[]{1, 0});
        }

        @Test
        @DisplayName("값 2, 4000")
        void t2() {
            assertThat(new Solution().solution(15000)).isEqualTo(new int[]{2, 4000});
        }
    @Test
    @DisplayName("값 0, 500")
    void t3() {
        assertThat(new Solution().solution(500)).isEqualTo(new int[]{0, 500});
    }

}
