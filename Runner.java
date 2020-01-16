import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your matrix dimension");
		int dim=sc.nextInt();
		int a[][]=new int[dim][dim];
		int b[][]=new int[dim][dim];
		System.out.println("enter first matrix");
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				System.out.println(" enter "+i+" th "+" row "+j+" th "+" coloumn elem ");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter second matrix");
		for (int i=0;i<b.length;i++)
		{
			for (int j=0;j<b.length;j++)
			{
				System.out.println(" enter "+i+" th "+" row "+j+" th "+" coloumn elem ");
				b[i][j]=sc.nextInt();
			}
		}
		AddMatrix obj=new AddMatrix();
		obj.add(a, b);
//		for (int i=0;i<a.length;i++)
//		{
//			for (int j=0;j<a.length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		 
	}

}
