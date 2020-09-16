import java.util.*;
public class Ques_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the string elements");
		String[] arr=new String[n];
		for(int i=0; i<n ;i++)
		{
			arr[i]=sc1.nextLine();
		}
		boolean palindrome=true;
		for(int i=0; i<n/2; i++)
		{
			if(arr[i].equals(arr[n-i-1]))
			{
				palindrome=true;
			}
			else
			{
				palindrome=false;
				break;
			}
		}
		if(palindrome==true)
		{
			System.out.println("The above array is a palindrome");
		}
		else
		{
			System.out.println("The above array is not a palindrome");
		}
	
	
	}

}