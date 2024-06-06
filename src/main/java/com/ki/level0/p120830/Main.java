package com.ki.level0.p120830;

//머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
// 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지
// return 하도록 solution 함수를 완성해보세요.
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n, int k) { // 양꼬치 = n , 음료수 = k
        int nPrice = 12000; // 양꼬치의 가격
        int kPrice = 2000; // 음료의 가격
        int nOrderPrice, kCount, kSrvCount, kOrderPrice;

        // 양꼬치 총 가격 계산
        nOrderPrice = n * nPrice;

        // 서비스 음료 개수 계산
        kSrvCount = n / 10;

        // 실제로 지불해야 하는 음료 개수
        kCount = k - kSrvCount;
        if (kCount < 0) {
            kCount = 0; // 음료 개수가 음수가 될 경우 0으로 계산
        }

        // 음료 총 가격 계산
        kOrderPrice = kCount * kPrice; // 실제 지불해야 하는 음료 개수를 사용

        return nOrderPrice + kOrderPrice;
    }
}
