import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int start_row = 0;
        int end_row = matrix.length - 1;
        int start_column = 0;
        int end_column = matrix[0].length - 1;

        while (start_row <= end_row && start_column <= end_column) {
            for (int j = start_column; j <= end_column; j++) {
                result.add(matrix[start_row][j]);
            }

            for (int i = start_row + 1; i <= end_row; i++) {
                result.add(matrix[i][end_column]);
            }

            if (start_row < end_row) {
                for (int j = end_column - 1; j >= start_column; j--) {
                    result.add(matrix[end_row][j]);
                }
            }

            if (start_column < end_column) {
                for (int i = end_row - 1; i > start_row; i--) {
                    result.add(matrix[i][start_column]);
                }
            }

            start_row++;
            end_row--;
            start_column++;
            end_column--;
        }

        return result;
    }
}
