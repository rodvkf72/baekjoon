class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int flag = 0;
        int have = n - lost.length;
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (((lost[j] == reserve[i]-1) || (lost[j] == reserve[i]+1)) && (flag != reserve.length)) {
                    have++;
                    flag++;
                }
            }
        }
        if (n < have) {
            have = n;
        }
        return have;
    }
}