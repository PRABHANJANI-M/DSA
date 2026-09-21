class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int dig;
        int org=x;
        if(x<0)
        return false;
        else{
        while(x!=0)
        {
              dig=x%10;
              rev=rev*10+dig;
              x/=10;
        }
        if(rev==org)
        {
        return true;
        
        }
        return false;
        }
}
}