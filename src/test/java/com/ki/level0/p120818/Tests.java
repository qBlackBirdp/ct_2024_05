package com.ki.level0.p120818;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("값 142500")
    void t1() {
        assertThat(new Solution().solution(150000)).isEqualTo(142500);
    }

    @Test
    @DisplayName("값 464000")
    void t2() {
        assertThat(new Solution().solution(580000)).isEqualTo(464000);
    }

//    @Test
//    @DisplayName("값 90000")
//    void t3() {
//        assertThat(new Solution().solution(100000)).isEqualTo(90000);
//    }
}
