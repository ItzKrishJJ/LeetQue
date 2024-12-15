class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        int[][] board = new int[n][n];
        solveQueen(board, 0 , n, list, new ArrayList<>());
        return list;
    }
    private void solveQueen(int[][] board, int row, int n, List<List<String>> list, List<String> ds)
    {
        if(row>=n)
        {
            list.add(constructSolution(board, n));
            return;
        }
        for(int col = 0; col < n; col++)
        {
            if(isSafe(board, row ,col, n))
            {
                board[row][col] = 1;
                solveQueen(board, row+1, n , list, ds);
                board[row][col] = 0;
            }
        }
    }

    public boolean isSafe(int[][] board, int row, int col, int n)
    {
        for(int i =0; i< row ; i++)
        {
            if(board[i][col]==1)
            {
                return false;
            }
        }

        for(int i= row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }

        for(int i=row, j=col; i>=0 && j<n;i--,j++)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }

        return true;
    }

    private List<String> constructSolution(int [][]board, int n)
    {
        List<String> solution= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==1)
                {
                    sb.append('Q');
                }
                else{
                    sb.append('.');
                }
            }
            solution.add(sb.toString());
        }
        return solution;
    }
}