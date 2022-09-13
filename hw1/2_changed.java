import java.util.Random;
import java.util.Scanner;


public class square {
	public static void main(String []args)
    {
      int r1 = 100, r2 = 200,c1 = 200,c2 = 300,i,j,k,sum;
      long startTime = System.currentTimeMillis();
      if(c1==r2)
      {
 
        int mat1[][] = new int[r1][c1]; 
        int mat2[][] = new int[r2][c2]; 
 	    int res[][] = new int[r1][c2];
 
        i= 0 ;
        while( i < r1 )
        {   
    
             j= 0 ;
            while( j < c1)
             
	        {
                 mat1[i][j] = (int)((Math.random())*10);
	            j++ ;             
	        }
            i++; 
      }
    
 
        i= 0 ;
        while( i < r2 )
        {   
    
             j= 0 ;
                while( j < c2)
             
	            {
                    mat2[i][j] = (int)((Math.random())*10);
	                j++ ;             
	            }
                 i++; 
      }
        i= 0 ;
	    while( i < r1 )
        {
        
            j= 0 ;
    	    while( j <c2)
          	{
 		        sum=0;
                k= 0 ; 
		        while(k <r2)
  		        {
                    sum +=mat1[i][k]*mat2[k][j];
		            k++ ;
                }
                    res[i][j]=sum;
                    j++;
            }
        i++;
      }
      
    long endTime = System.currentTimeMillis();
	    System.out.println("Program runs time:"+(endTime - startTime)+"ms");
    }
    
    
    int R1 = 100, R2 = 200,C1 = 200,C2 = 300,I,J,K,SUM;
      long startTime1 = System.currentTimeMillis();
      if(C1==R2)
      {
 
        double MAT1[][] = new double[R1][C1]; 
        double MAT2[][] = new double[R2][C2]; 
 	    double RES[][] = new double[R1][C2];
        Random ran = new Random();
        I= 0 ;
        while( I < R1 )
        {   
    
             J= 0 ;
            while( J < C1)
             
	        {
                 MAT1[I][J] = ran.nextDouble();
	            J++ ;             
	        }
            I++; 
       }
    
 
        I= 0 ;
        while( I < R2 )
        {   
    
             J= 0 ;
                while( J < C2)
             
	            {
                    MAT2[I][J] = ran.nextDouble();
	                J++ ;             
	            }
                 I++; 
       }
        I= 0 ;
	    while( I < R1 )
        {
        
            J= 0 ;
    	    while( J <C2)
          	{
 		        SUM=0;
                K= 0 ; 
		        while(K <R2)
  		        {
                    SUM +=MAT1[I][K]*MAT2[K][J];
		            K++ ;
                }
                    RES[I][J]=SUM;
                    J++;
            }
        I++;
      }
      
    long endTime1 = System.currentTimeMillis();
	    System.out.println("Program runs time:"+(endTime1 - startTime1)+"ms");
    }
   
   
   }
   
   
   
}