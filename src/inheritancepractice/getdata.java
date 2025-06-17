package inheritancepractice;

class e {
	int a = 10, b = 90;
}

class f extends e {
	void data() {
		System.out.println(a < b);
	}
}

public class getdata {
	public static void main(String[] args) {
		f obj = new f();
		obj.data();
	}
}
