class Solution {
    public int[] separateDigits(int[] nums) {
    //first tu total kandu pudikanum
      int total=0;

      for(int num:nums)
      {
        int temp=num;

        while(temp>0)
        {
            total++;
            temp=temp/10;
        }
      }
      //ippo digits edukkanum

      int[]arr=new int[total];

      int index=0;

      for(int num:nums)
      {
        int temp=num;
        int digits=0;

        while(temp>0)
        {
            digits++;
            temp=temp/10;
        }

        //divisiors kandu pudikkanum

        int div=1;

        for(int i=1;i<digits;i++)
        {
            div=div*10;

        }

        while(div>0)
        {
            digits=num/div;

            arr[index]=digits;
            index++;

            num=num%div;

            div=div/10;

        }
      } 
      return arr;
    }
}