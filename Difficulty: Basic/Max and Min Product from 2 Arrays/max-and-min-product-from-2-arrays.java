
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        int max = arr1[0];
        int min = arr2[0];
      
     for(int i = 1; i<arr1.length; i++){
         if(arr1[i]>max){
             max = arr1[i];
         }
       
     }
    
         for(int j = 1; j<arr2.length; j++){
         if(arr2[j]<min){
             min= arr2[j];
         }
       
     }
     
     return (long) max*min;
     
        
    }
}