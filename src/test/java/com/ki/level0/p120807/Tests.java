package com.ki.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//System.out.println(new Solution().solution(2, 3));
//System.out.println(new Solution().solution(3, 3));

public class Tests {
    @Test
    @DisplayName("2, 3 => -1")
    void t1() {
        assertThat(new Solution().solution(2,3)).isEqualTo(-1);
    }
    @Test
    @DisplayName("2, 3 => -1")
    void t2() {
        assertThat(new Solution().solution(3,3)).isEqualTo(1);
    }
    @Test
    @DisplayName("2, 3 => -1")
    void t3() {
        assertThat(new Solution().solution(4,3)).isEqualTo(-1);
    }
}
