package day9;

public class Mo {
	void Add(int a) {
		System.out.println(a);
}
	void Add(int a ,int b) {
		System.out.println(a<b);
	}
	public static void main(String[] args) {
		Mo obj =new Mo();
		obj.Add(10);
		obj.Add(29,67);
	}}