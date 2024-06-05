package com.ki.level0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("적의 hp가 23이면 5마리의 개미가 필요해")
    void t1() {
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }
    @Test
    @DisplayName("적의 hp가 24면 6마리의 개미가 필요해")
    void t2() {
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }
    @Test
    @DisplayName("적의 hp가 564면 6마리의 개미가 필요해")
    void t4() {
        assertThat(new Solution().solution(564)).isEqualTo(114);
    }
    @Test
    @DisplayName("적의 hp가 999면 201마리의 개미가 필요해")
    void t3() {
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }
}