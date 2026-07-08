class Solution {
    public boolean isPalindrome(int n) {
        int reverse = 0;
        int Orginalvalueofn =n;
        while(n!=0){
            int digit = n%10;
            reverse = reverse *10 + digit;
            n = n/10;
        }
        if(reverse ==   Orginalvalueofn){
            return true;
        }
        else{
            return false;
        }
    }
}