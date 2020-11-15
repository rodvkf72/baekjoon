import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int count = 0;
        int result = 0;
        for(int i = 0; i < computers.length-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (computers[i][j] == (computers[i+1][j])) {
                    count++;
                }
            }
            if (count != 0) {
                result++;
            }
            count = 0;
        }
        return n - result;
    }
}