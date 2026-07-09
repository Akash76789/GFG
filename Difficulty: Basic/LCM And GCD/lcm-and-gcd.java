class Solution {
    public static int[] lcmAndGcd(int a, int b) {
    int num1 = a;
       int num2 = b; 
    while(b!=0){
      
       // gcd ( a , b) = gcd ( b , a%b)
        int OriginalValueOfb = b; 
        b = a%b;
        a  = OriginalValueOfb;
    }
    int Gcd = a;
    // Lcm = a*b/gcd or a
    int Lcm = (num1 * num2) / Gcd;
    return new int[]{Lcm , Gcd};
        
    }
}