class Solution {
    public static int[] prefix (int [] arr){
        int n = arr.length;
        for(int i =1 ; i<n; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }
    public ArrayList<Integer> prefSum(int[] arr) {
    
    int n = arr.length;
    
    int [] prefixArray = new int[n];
     
     
     prefixArray = prefix(arr);
      ArrayList<Integer>ans = new ArrayList<>();
      for(int i = 0; i<n; i++){
          ans.add(prefixArray[i]);
      }
        
        return ans ; 
      }
        
    }
