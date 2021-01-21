import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int size = brown + yellow;
        int[] answer = new int[2];
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (i * j == size) {
                    if ((i * 2) + ((j - 2) * 2) == brown) {
                        answer[0] = i;
                        answer[1] = j;
                    }
                }
            }
        }
        return answer;
    }
}