package day13;

public class Error {
	public static void main(String[] args) {
		int a = 10 , b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		int a1[] = {1,2,3,4};
		try {
			for(int i=0;i<=4;i++)
			{
				System.out.println(a1[i]);
			}
	}
		catch (Exception e) {
			System.out.println(e);
		}

}

}
