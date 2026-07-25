import java.util.*;

class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 1. n oda ellam list ah eduthu list la podu
        while(n > 0) {
            list.add(n % 10);
            n = n / 10;
        }
        
        // 2. Sort pannu - chinna la irundhu periya varaikum
        Collections.sort(list);
        
        // 3. Kadasi 2 elements ah eduthu multiply pannu
        int size = list.size();
        return list.get(size - 1) * list.get(size - 2);
    }
}