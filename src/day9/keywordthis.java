package day9;

public class keywordthis {
	int a;
	
	public keywordthis(int a)
	{
		this.a = a;
		
	}
    void Displayvalue()
{
	System.out.println(a);
	;
}
public static void main(String[] args) {
	keywordthis obj = new keywordthis(10);
	obj.Displayvalue();
}
}
