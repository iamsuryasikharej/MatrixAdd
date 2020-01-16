
public class AddMatrix {
	public void add(int a[][],int[][] b)
	{
		int result[][]=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for (int j = 0; j < a.length; j++) {
				result[i][j]=a[i][j]+b[i][j];
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for (int j = 0; j < a.length; j++) {
				System.out.print(result[i][j]);			
			}
			System.out.println();
		}
	}

}
