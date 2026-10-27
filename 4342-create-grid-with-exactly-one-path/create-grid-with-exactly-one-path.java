class Solution {
    public String[] createGrid(int m, int n) {
        char[][]arr=new char[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(arr[i],'#');
        }

        for(int i=0;i<m;i++)
        {
            arr[i][0]='.';
        }

        for(int i=0;i<n;i++)
        {
            arr[m-1][i]='.';
        }

        String[]s1=new String[m];
        for(int i=0;i<m;i++)
        {
            s1[i]=new String(arr[i]);
        }
        return s1;
    }
}