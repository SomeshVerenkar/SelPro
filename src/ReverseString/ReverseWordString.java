package ReverseString;

public class ReverseWordString {

	public static void main(String[] args) {

		String str = "My name is Somesh";
		//convert this string into string Array
		String a[]=str.split(" ");//using split method - after every string give space
		//using for loop to print the element
		for(int i=0; i<a.length; i++)
		{
		    System.out.print(a[i] + " ");//using a[i] to print the value
		}
		
			for(int i=a.length-1; i>=0; i--)
		{

			System.out.println(a[i] + " ");		
		}
		
	}

}
