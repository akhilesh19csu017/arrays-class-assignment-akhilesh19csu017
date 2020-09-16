import java.util.*;
public class Ques_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elemets of your array");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int x=sc.nextInt();
		int freq=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==x)
			{
				freq=freq+1;
			}
		}
		System.out.println("So "+x+" has occured "+freq+" times in the array");

	}
}