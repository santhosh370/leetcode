class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=reverse(n);

        int min=Math.min(n,r);
        int max=Math.max(n,r);

        int sum=0;

        for(int i=min;i<=max;i++)
        {
            if(isPrime(i))
            {
                sum+=i;
            }
        }
        return sum;
    }

    public boolean isPrime(int n) {
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
            
        }
        return true;
    }

    public int reverse(int n)
    {
        int rem=0;
        while(n>0)
        {
            
            rem=rem*10+(n%10);
            n/=10;
        }
    
    return rem;
    }
}