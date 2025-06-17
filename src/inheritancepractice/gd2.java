package inheritancepractice;

class p {
	int a = 10, b = 90;

	void data1() {
		System.out.println(a > b);
	}
}

class c extends p {
	void data2() {
		System.out.println(a < b);
	}
}

public class gd2 {
	public static void main(String[] args) {
		c obj = new c();
		obj.data1();
		obj.data2();
	}

}
