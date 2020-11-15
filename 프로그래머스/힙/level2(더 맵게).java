import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int mix = 0;
        int answer = 0;
        
        for (int i = 0; mix < K; i++) {
            Arrays.sort(scoville);
            mix = (scoville[i] + scoville[i+1] * 2);
            scoville[0] = mix;
            for (int j = 1; j < scoville.length - 1; j++) {
                scoville[j] = scoville[j + 1];
            }
            answer++;
        }
        return answer;
    }
}