import java.util.*;

class pgm2{
 public static void main(String args[]){
   int mat1[][] = new int[10][10];
   int mat2[][] = new int[10][10];
   int mat3[][] = new int[10][10];
   int n;
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the size of the first matrix:");
   n = input.nextInt();
   System.out.println("Enter the elements of the first matrix:");
   for(int i = 0;i<n;i++){
   for( int j =0;j<n;j++){
   mat1[i][j] = input.nextInt();
   }
  }
   System.out.println("Enter the size of the second matrix:");
   n = input.nextInt();
   System.out.println("Enter the elements of the second matrix:");
   for(int i = 0;i<n;i++){
   for( int j =0;j<n;j++){
   mat2[i][j] = input.nextInt();
   }
  }
   for(int i = 0;i<n;i++){
   for( int j =0;j<n;j++){
   mat3[i][j] = mat1[i][j]+mat2[i][j];
   }
  }
  System.out.println("Sum of matrices:");
   for(int i = 0;i<n;i++){
    for( int j =0;j<n;j++){
     System.out.print(mat3[i][j]+" ");
     }
     System.out.println("\n");
     }
   }
}     
