import java.util.*;
public class Ques_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of pairs you want to enter in array");
		int a=sc.nextInt();
		int n=2*a;
		int[] arr=new int[n];
		int q=1;
		for(int i=0; i<n; i=i+2)
		{
			System.out.println("Enter pair no."+q);
			arr[i]=sc.nextInt();
			arr[i+1]=sc.nextInt();
			q=q+1; 
		}
		
		swap(arr.length,arr);

	}
	
	static void swap(int n, int arr[])
	{
		int temp=0;
		for(int i=0; i<n; i=i+2)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println("Array after comparing pairs is");
		for(int i=0; i<n ;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}