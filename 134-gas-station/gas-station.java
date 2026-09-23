class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas=0;
        int total_cost=0;
        int n=gas.length;
        for(int i=0;i<n;i++)
        {
            total_gas+=gas[i];
            total_cost+=cost[i];
        }
        if(total_gas<total_cost)
        {
            return -1;
        }
        int cal=0;
        int index=0;

        for(int i=0;i<n;i++)
        {
            cal+=gas[i]-cost[i];
            //condition
            if(cal<0)
            {
                index=i+1;
                cal=0;
            }
        }
        return index;
    }
}