import java.util.Arrays;

public class NQueensII {
    public int totalNQueens(int n) 
    {
        char matrix[][] = new char[n][n];
        for(char[] row: matrix)
        {
            Arrays.fill(row, '.');
        }

        return dfs(matrix, 0);
    }

    private int dfs(char[][] matrix,int row)
    {
        if(row == matrix.length)
        {
            return 1;
        }

        int count = 0;
        for(int col = 0;col < matrix[0].length; col++)
        {
            if(isValid(matrix, row, col))
            {
                matrix[row][col] = 'Q';
                count += dfs(matrix, row + 1);
                matrix[row][col] = '.';
            }
        }

        return count;
    }

    private boolean isValid(char[][] matrix, int row, int col)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            if(matrix[i][col] == 'Q')
            {
                return false;
            }
        }

        for(int i = row - 1, j = col - 1;i >= 0 && j >= 0;i--, j--)
        {
            if(matrix[i][j] == 'Q')
            {
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < matrix[0].length; i--, j++)
        {
            if(matrix[i][j] == 'Q')
            {
                return false;
            }
        }

        return true;
    }
}
