class Solution {
    public static int largest(int[] arr) {
      
      int n = arr.length;
     
     int maximumValue = Integer.MIN_VALUE;
     
     for(int i = 0; i<n; i++){
         if(arr[i]>maximumValue){
             maximumValue = arr[i];
         }
     }
     return maximumValue;
        
    }
}
