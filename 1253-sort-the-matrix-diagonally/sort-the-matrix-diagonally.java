class Solution {
    public int[][] diagonalSort(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;

        for(int i=0;i<n;i++)
        {
            sortmatrix(nums,i,0);
        }

        for(int j=1;j<m;j++)
        {
            sortmatrix(nums,0,j);
        }
        return nums;
    }

    private void sortmatrix(int[][]nums,int i,int j)
    {
        List<Integer>list=new ArrayList<>();

        int row=i;
        int col=j;

        while(row < nums.length && col<nums[0].length)
        {
            list.add(nums[row][col]);

            row++;
            col++;
        }

        Collections.sort(list);

        row=i;
        col=j;

        int ind=0;

        while(row < nums.length && col < nums[0].length)
        {
            nums[row][col]=list.get(ind);

            ind++;
            row++;
            col++;
        }
    }
}