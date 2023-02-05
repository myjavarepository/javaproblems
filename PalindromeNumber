class Solution {
    public boolean isPalindrome(int x) {
int orginalVal=x;
        if(x<0){
            return false;
        }
        if(x==0)
            return true;
            
        int reverse=0;
        int remainder;
        while (x!=0)
        {
            remainder=x%10;
            reverse= reverse*10+remainder;
            x=x/10;
        }

            return (Integer.valueOf(reverse).equals(Integer.valueOf(orginalVal)));
        
    }
}
