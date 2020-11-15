class Solution {
    public int solution(int[] citations) {
        int i, j;
        int cursor = 0;
        int under = 0;
        int upper = 0;
        int answer = 0;
        
        for (i = 0; i < citations.length; i++) {
            cursor = citations[i];
            for (j = 0; j < citations.length; j++) {
                if (cursor >= citations[j]) {
                    under++;
                }
                if (cursor <= citations[j]) {
                    upper++;
                }
            }
            if (under == upper) {
                answer = cursor;
            }
            under = 0;
            upper = 0;
        }
        return answer;
    }
}