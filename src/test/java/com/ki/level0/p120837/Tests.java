package com.ki.level0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("적의 hp가 10이면 2마리의 개미가 필요해")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(2);
    }
    @Test
    @DisplayName("적의 hp가 9면 3마리의 개미가 필요해")
    void t2() {
        assertThat(new Solution().solution(9)).isEqualTo(3);
    }
    @Test
    @DisplayName("적의 hp가 8면 2마리의 개미가 필요해")
    void t4() {
        assertThat(new Solution().solution(8)).isEqualTo(2);
    }
    @Test
    @DisplayName("적의 hp가 7면 3마리의 개미가 필요해")
    void t3() {
        assertThat(new Solution().solution(7)).isEqualTo(3);
    }
    @Test
    @DisplayName("적의 hp가 6면 2마리의 개미가 필요해")
    void t5() {
        assertThat(new Solution().solution(6)).isEqualTo(2);
    }
    @Test
    @DisplayName("적의 hp가 5면 1마리의 개미가 필요해")
    void t6() {
        assertThat(new Solution().solution(5)).isEqualTo(1);
    }
    @Test
    @DisplayName("적의 hp가 4면 2마리의 개미가 필요해")
    void t7() {
        assertThat(new Solution().solution(4)).isEqualTo(2);
    }
    @Test
    @DisplayName("적의 hp가 3면 1마리의 개미가 필요해")
    void t8() {
        assertThat(new Solution().solution(3)).isEqualTo(1);
    }
    @Test
    @DisplayName("적의 hp가 2면 2마리의 개미가 필요해")
    void t9() {
        assertThat(new Solution().solution(2)).isEqualTo(2);
    }
    @Test
    @DisplayName("적의 hp가 1면 1마리의 개미가 필요해")
    void t10() {
        assertThat(new Solution().solution(1)).isEqualTo(1);
    }
}