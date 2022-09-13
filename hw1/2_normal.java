import java.util.Random;


public class square {
	public static void main(String []args)
	{
		long startTime = System.currentTimeMillis();
		int[][] a = new int[100][200];
		int[][] b = new int[200][300];
		int[][] c = new int[100][300];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j] = (int)((Math.random())*10);
			}
		}
		for(int i=0; i<b.length; i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				b[i][j] = (int)((Math.random())*10);
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				c[i][j] = 0;
				for(int k=0;k<c.length;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Program runs time:"+(endTime - startTime)+"ms");
		
		long startTime2 = System.currentTimeMillis();
		double[][] A = new double[100][200];
		double[][] B = new double[200][300];
		double[][] C = new double[100][300];
		Random ran = new Random();
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				A[i][j] = ran.nextDouble();
			}
		}
		for(int i=0; i<b.length; i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				B[i][j] = ran.nextDouble();
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				C[i][j] = 0;
				for(int k=0;k<c.length;k++)
				{
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Program runs time:"+(endTime2 - startTime2)+"ms");
		System.out.println("Time difference is:"+((endTime2 - startTime2)-(endTime - startTime))+"");
	}
}