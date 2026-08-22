class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum=0;
        int mul=1;

        while(n>0)
        {
            int digit=n%10;
            sum+=digit;
            mul*=digit;
            n/=10;
        }
        int san=sum+mul;

        return original%san ==0;
    }
}