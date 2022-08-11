package innovation_test;

import java.util.Arrays;

public class Problem1 {
    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {
        int[][] answer;
        answer = new int [arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (signs[i][j]) {
                    answer[i][j] = (arr1[i][j] + arr2[i][j]);
                } else {
                    answer[i][j] = -1 * (arr1[i][j] + arr2[i][j]);
                }
            }
        }
        return answer;
    }

    private static boolean[][] getSigns(boolean[][] signs) {
        return signs;
    }

    // 실행 및 검증
    public static void main(String[] args) {
        Problem1 method = new Problem1();
        int[][] arr1 = {{5,7,1},{2,3,5}};
        int[][] arr2 = {{5,1,6},{7,5,6}};
        boolean[][] signs={{true,true,false},{false,true,false}};
        System.out.println(Arrays.deepToString(method.solution(arr1, arr2, signs)));
    }
}