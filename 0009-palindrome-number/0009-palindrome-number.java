class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int d=0;
        while(x!=0){
        d=d*10+x%10;
        x=x/10;
        }
        if(d==y&&y>0)
        return true;
        else
        return false;    
    }
    //in
}