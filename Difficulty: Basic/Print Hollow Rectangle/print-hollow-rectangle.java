import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(); // number of rows 
        int c = sc.nextInt(); // number of columns 
        
        // index for rows - i // index for col -j

       for( int i =0; i<r; i++ ){
           for(int  j =0; j<c; j++){
               if(i==0 || i==r-1 || j==0 ||j==c-1){
                   System.out.print("*");
               }
               else{
                    System.out.print(" ") ;
               }
           }
           System.out.println() ;
           
       }
        
    }
}