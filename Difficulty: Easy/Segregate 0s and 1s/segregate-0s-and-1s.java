class Solution {
    void segregate0and1(int[] arr) {
        int zeroscount = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i]==0){
                zeroscount++;
            }
        }
        for( int i = 0; i<n; i++){
            if(i<zeroscount){
                arr[i] =0;
            }
            else{
                arr[i]=1;
            }
            
        
        
        
    }
}
}
