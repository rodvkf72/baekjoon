import java.util.*;

//문제가 이해가 안되어 일단은 for문으로 구현함
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    count++;
                } else {
                    if (count == 0) {
                        count = 1;
                    }
                    break;
                }
            }
            answer[i] = count;
            count = 0;
        }
        return answer;
    }
}