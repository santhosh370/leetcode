class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Map<Integer, Integer> e = new HashMap<Integer, Integer>();
        for (int i: nums) {
            if (e.containsKey(i)) {
                e.put(i, e.get(i) + 1);
            }
            else {
                e.put(i, 1);
            }
        }
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        List<Integer> first = new ArrayList<Integer>();
        a.add(first);
        for (Integer n: e.keySet()) {
            a = duplicatesubsets(n, a, e.get(n));
        }




        
        
        return a;
    }

    public List<List<Integer>> duplicatesubsets(int i, List<List<Integer>> current, int freq) {
        List<List<Integer>> newList = new ArrayList<List<Integer>>();
        for (List<Integer> curr: current) {
            for (int j = 0; j <= freq; j++) {
                List<Integer> a = dupList(curr);
                for (int k = 0; k < j; k++) {
                    a.add(i);
                }
                newList.add(a);
            }
        }
        return newList;
    }

    // Counts number of times number i appears in a list
    public int countList(int i, List<Integer> current) {
        int count = 0;
        for (int a: current) {
            if (a == i) {
                count++;
            }
        }
        return count;
    }

    // Returns a duplicated list
    public List<Integer> dupList(List<Integer> current) {
        List<Integer> retList = new ArrayList<Integer>();
        for (int i: current) {
            retList.add(i);
        }
        return retList;
    }
}