import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        int flag = 0;
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            if (flag == 0) {
                for (int j = i + 1; j < phone_book.length; j++) {
                    if (phone_book[j].startsWith(phone_book[i])) {
                        flag = 1;
                        answer = false;
                    }
                }
            }
        }
        return answer;
    }
}