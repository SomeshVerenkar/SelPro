package ReverseString;

public class ReverseChar {

	public static void main(String[] args) {

		String str = "ABCD";
		String str1 = " ";
		
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			str1 = str1 + str.charAt(i);
			
		}
		System.out.println(str1);
	}

}
