class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;//row
        int m = matrix[0].length;//column
        int col[] = new int[m];
        int row[]= new int[n];
        for(int i= 0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    col[j] = 1;
                    row[i] = 1;
                }
            }
        }
          for(int i= 0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if( col[j] ==  1 || row[i] == 1)
                {
                    matrix[i][j]=0;
                   
                }
            }
        }
    }
}