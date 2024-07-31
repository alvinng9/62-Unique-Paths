package org.example;

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                array[i][j] = array[i + 1][j] + array[i][j + 1];
            }
        }
        return array[0][0];
    }
}
