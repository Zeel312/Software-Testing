package day8;

public class MultiD {
	public static void main(String[] args) {
		int a[][] = { {1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<=2;i++)
		{
			for (int j=0;j<=2;j++)
			{
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
