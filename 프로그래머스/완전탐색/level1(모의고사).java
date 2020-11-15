import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int intone = one(answers);
        int inttwo = two(answers);
        int intthree = three(answers);
        int check = 0;
        
        int[] answer = new int[3];
        if ((intone > inttwo) && (intone > intthree)) {
            check = 1;
            answer[0] = 1;
        } else if ((inttwo > intone) && (inttwo > intthree)) {
            check = 1;
            answer[0] = 2;
        } else if ((intthree > intone) && (intthree > inttwo)) {
            check = 1;
            answer[0] = 3;
        } else if ((intone == inttwo) && (intone > intthree)) {
            check = 2;
            answer[0] = 1;
            answer[1] = 2;
        } else if ((intone == intthree) && (intone > inttwo)) {
            check = 2;
            answer[0] = 1;
            answer[1] = 3;
        } else if ((intone == inttwo) && (inttwo == intthree)) {
            check = 3;
            answer[0] = 1;
            answer[1] = 2;
            answer[2] = 3;
        }
        answer = Arrays.copyOfRange(answer, 0, check);
        return answer;
    }
    
    public int one(int[] answers) {
        int[] test = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == test[i]) {
                count++;
            }
        }
        return count;
    }
    
    public int two(int[] answers) {
        int[] test = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1};
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == test[i]) {
                count++;
            }
        }
        return count;
    }
    
    public int three(int[] answers) {
        int[] test = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == test[i]) {
                count++;
            }
        }
        return count;
    }
}