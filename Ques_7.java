import java.util.*;
public class Ques_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		swapPairs(arr.length,arr);
	}
	
	static void swapPairs(int a, int arr1[])
	{
		int temp=0;
		for(int i=0; i<=a-2; i=i+2)
		{
			temp=arr1[i];
			arr1[i]=arr1[i+1];
			arr1[i+1]=temp;
		}
		
		for(int i=0;i<a;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}