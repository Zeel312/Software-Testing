package day8;

public class immMutate {
	public static void main(String[] args) {
		String s="ankush";
		String s1 = s.concat(" jain ");
		System.out.println(s1);
		s.concat("gupta");
	}

}
