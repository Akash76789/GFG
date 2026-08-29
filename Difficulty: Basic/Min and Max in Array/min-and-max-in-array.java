class Solution {
    
       
      public static int max(int[] arr){
         int n = arr.length;
         int max = Integer.MIN_VALUE;
         for(int i = 0; i<n; i++){
             if(arr[i] > max  ){
                 max = arr[i];
         }
     
     }
         return max;
        
    }
    
    
     public static int min(int[] arr){
         int n = arr.length;
         int min = Integer.MAX_VALUE;
         for(int i = 0; i<n; i++){
             if(arr[i] < min  ){
                 min = arr[i];
         }
     
     }
         return min;
        
    }
    public ArrayList<Integer> getMinMax(int[] arr) {
     
     int minValue = min(arr);
     int maxValue = max(arr);

     // Create ArrayList
     ArrayList<Integer> ans = new ArrayList<>();

     // Add minimum and maximum
     ans.add(minValue);
     ans.add(maxValue);

     return ans;
    

    
}
}
