class Solution {
    static boolean armstrongNumber(int n) {
      int sum = 0;
    // store the original value of n before modifying it.
    int originalValueOfn = n;
      while(n!=0){
          int digit = n%10;
          int cubeOfDigit = digit*digit*digit;
          sum = sum + cubeOfDigit;
          n = n/10;
      }
      if(sum==originalValueOfn){
          return true;
      }
      else{
          return false;
      }
                
        

        
    }
}