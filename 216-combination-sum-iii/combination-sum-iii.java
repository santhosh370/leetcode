class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>list1=new ArrayList<>();
        List<Integer>list=new ArrayList<>();

        back(1,n,k,list1,list);

        return list1;
    }

    public static void back(int start,int n,int k,List<List<Integer>>list1,List<Integer>list)
    {
        if(list.size()==k)
        {
            if(n==0)
            {
                list1.add(new ArrayList<>(list));
            }
            return;
        }
        
        for(int i=start;i<=9;i++)
        {
            list.add(i);
            back(i+1,n-i,k,list1,list);
            list.remove(list.size()-1);
        }

    }
}