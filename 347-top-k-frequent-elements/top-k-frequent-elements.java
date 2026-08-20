class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int offset=10000;
        int size=20001;

        int[]freq=new int[size];
        for(int num:nums)
        {
            freq[num + offset]++;
        }

        List<Integer>[]list=new List[nums.length+1];

        for(int i=0;i<size;i++)
        {
            if(freq[i]>0)
            {
                int san=freq[i];

                if(list[san]==null)
                {
                    list[san]=new ArrayList<>();
                }
                list[san].add(i-offset);
            }
        }

        int[]arr=new int[k];

        int index=0;
        for(int i=list.length-1;i>=0 && index<k;i--)
        {
            if(list[i]!=null)
            {
                for(int num:list[i])
                {
                    arr[index++]=num;
                    if(index==k) break;
                }
            }
        }
        return arr;
    }
}