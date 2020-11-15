import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[3];
        int result = 0;
        int i = 0;
        
        for(i = 0; i < commands.length; i++) {
            int[] test = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(test);
            result = test[commands[i][2]-1];
            answer[i] = result;
        }
        return answer;
    }
}