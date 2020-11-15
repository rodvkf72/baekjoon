import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = devide(numbers, target, 0, 0);
        return answer;
    }
    public int devide(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        return devide(numbers, target, index + 1, sum + numbers[index]) + devide(numbers, target, index+1, sum-numbers[index]);
    }
}