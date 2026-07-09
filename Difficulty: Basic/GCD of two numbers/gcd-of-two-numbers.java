class Solution {
    public static int gcd(int a, int b) {
        // gcd ( a, b ) = gcd ( b , a%b)
        // replace b with a%b
        // replace a with b ( original value pof b)

       while(b!=0){
         int oldValueOfb = b;
           b =a%b;
           a = oldValueOfb; 
       }
       return a;

    }
}
