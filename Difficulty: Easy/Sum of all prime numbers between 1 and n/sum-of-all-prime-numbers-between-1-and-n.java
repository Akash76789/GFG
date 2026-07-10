class Solution {
    
     public boolean isprime(int num){
         if (num <= 1) {
    return false;
}
   
        for(int i =2; i*i<=num; i++){
        if(num%i==0){
            return false;
        }
    }
        return true;
    }

    
    public int prime_Sum(int n) {
        int sum =0;
       for(int i =2; i<=n; i++){
           if(isprime(i)){
               sum = sum+i;
           }
       }
       return sum;
        
    }
    
}
