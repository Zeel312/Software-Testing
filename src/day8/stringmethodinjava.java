package day8;

public class stringmethodinjava {
	public static void main(String[] args) {
		String name = "Hello this is my java class";
		System.out.println(name.length());
		
		String name1 = "Hiiii";
		System.out.println(name1.length());
		System.out.println(name1.concat("this is my second java class"));
		System.out.println(name1.charAt(0)); //position
		
		String name2 = "Heelllooo";
		System.out.println(name2.length());
		System.out.println(name2.concat("this is my third java class"));
		System.out.println(name.charAt(0)); //position
		System.out.println(name.equals(name2));
		
		String name4 ="helloooooo";
		String name3 = "";
		System.out.println(name4.length());
		System.out.println(name4.concat("this is my fourth java class"));
		System.out.println(name4.charAt(0));
		
		System.out.println(name4.equals(name3));
		System.out.println(name4.contains("0"));
		System.out.println(name4.isEmpty());
		
		String nnn = "heyy";
		String nn= "HE";
		
		System.out.println(nnn.length());
		System.out.println(nnn.concat("this is my first lecture"));
		System.out.println(nnn.charAt(0)); //position
		System.out.println(nnn.equals(nn));
		System.out.println(nnn.contains("0"));
		System.out.println(nn.isEmpty());
		System.out.println(nnn.equalsIgnoreCase(nn));
		
		String zeel = "heyaa";
		String shivani = "holaa";
		
		System.out.println(zeel.length());
		System.out.println(zeel.concat("this is my second lecture"));
		System.out.println(zeel.charAt(0)); //position
		System.out.println(zeel.equals(shivani));
		System.out.println(zeel.contains("0"));
		System.out.println(shivani.isEmpty());
		
		System.out.println(zeel.equalsIgnoreCase(shivani));
		System.out.println(zeel.replace("h", "s"));
		System.out.println(zeel.toUpperCase());
		System.out.println(zeel.toLowerCase());
		
	}

}

