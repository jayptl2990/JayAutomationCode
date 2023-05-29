package string_7th_may_2023;

public class String_Assignment {

	public static void main(String[] args) {

		// subsequence()
		String s1 = "i am learning string";
		System.out.println(s1.subSequence(0, 8));

		// replace()
		String s2 = "i am learning string";
		System.out.println(s2.replace("i", "u"));

		// repaceAll()
		String s3 = "This is java";
		System.out.println(s3.replaceAll(s3, s2));

		// String Searching category
		// indexOf() - returns the position of the first occurrence of specified character(s) in a string
		String s4 = "Hello how are you";
		System.out.println(s4.indexOf("are"));

		// lastIndexOf() - returns the position of the last occurrence of specified
		// character(s) in a string.
		String s5 = "Hello how are you";
		System.out.println(s5.lastIndexOf("w"));

		// contains() - Returns true if the characters exist and false if not.
		String s6 = "Automation World";
		System.out.println(s6.contains("jay"));

		// charAt() -returns the character at the specified index in a string.
		String s7 = "Automation World";
		System.out.println(s7.charAt(9));

		// endsWith() - checks whether a string ends with the specified character(s).
		String s8 = "Automation World";
		System.out.println(s8.endsWith("d"));

		// startsWith() - checks whether a string starts with the specified character(s).
		String s9 = "Automation World";
		System.out.println(s9.startsWith("u"));

		// Case conversion methods
		// toLowerCase()
		// toUpperCase()
		String s10 = "Hello World";
		System.out.println(s10.toUpperCase());
		System.out.println(s10.toLowerCase());

		// Type conversion methods

		int a = 1234;
		int b = -1234;

		// Converting integer to string
		// using toString() method
		String s11 = Integer.toString(a);
		String s12 = Integer.toString(b);
		System.out.println("String str1 = " + s11);
		System.out.println("String str2 = " + s12);

		// valueOf()
		double d = 1042489939.939;
		boolean b1 = true;
		long l = 15682874;
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		System.out.println("Return Value : " + String.valueOf(d));
		System.out.println("Return Value : " + String.valueOf(b1));
		System.out.println("Return Value : " + String.valueOf(l));
		System.out.println("Return Value : " + String.valueOf(arr));

		// toCharArray()
		String s13 = "Automation";
		char[] a1 = s13.toCharArray();
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

	}

}
