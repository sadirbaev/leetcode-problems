class Solution {
  public void rotate(int[][] matrix) {
    int n = matrix.length;
    for (int j = 0; j < Math.floor(n / 2); j++) {
      for (int i = j; i < n - 1 - j; i++) {
        int temp = matrix[j][i];
        matrix[j][i] = matrix[n - 1 - i][j];
        matrix[n - 1 - i][j] = matrix[n - 1 - j][n - 1 - i];
        matrix[n - 1 - j][n - 1 - i] = matrix[i][n - 1 - j];
        matrix[i][n - 1 - j] = temp;
      }
    }
  }
}