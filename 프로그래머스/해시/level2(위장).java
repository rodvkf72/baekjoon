class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        int check = 0;
        int result = 0;
        String[] arr = new String[clothes.length];
        int[] intarr = new int[clothes.length];

        for (int i = 0; i < clothes.length; i++) {
            arr[i] = clothes[i][1];
            answer++;
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j].equals(arr[k])) {
                    check++;
                    if (intarr[j] == 0) {
                        intarr[j] = intarr[j] + 2;
                    } else {
                        intarr[j]++;
                    }
                }
            }
        }
        if (answer != check) {
            for (int k = 0; k < intarr.length; k++) {
                if (result == 0) {
                    result = 1;
                    if (intarr[k] != 0) {
                        result = result * intarr[k];
                    }
                }
            }
        }
        return answer + result;
    }
}