
import java.util.*;

class AddMatrices{
 public static void main(String args[]){
 
  Scanner s =new Scanner(System.in);
  System.out.println("Enter No.of rows for a and b");
  int m1=s.nextInt();
  int m2=s.nextInt();
  System.out.println("Enter No.of columns for a and b");
  int n1=s.nextInt();
  int n2=s.nextInt();
 
  int[][] a=new int[m1][n1];
  int[][] b=new int[m2][n2];
  int[][] c=new int[m1][n1];
 
  if(m1!=m2 && n1!=n2)
   System.out.println("Addition not possible");
   
  System.out.println("Enter elements of a");
  for(int i=0;i<m1;i++)
  { for(int j=0;j<n1;j++)
     a[i][j]=s.nextInt();
  }
 
  System.out.println("Enter elements of b");
  for(int i=0;i<m2;i++)
  { for(int j=0;j<n2;j++)
     b[i][j]=s.nextInt();
  }
 
  for(int i=0;i<m1;i++)
  { for(int j=0;j<n1;j++)
     c[i][j]=a[i][j]+b[i][j];
  }
 
  for(int[] m:c)
  System.out.println(Arrays.toString(m));
 }
}
