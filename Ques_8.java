import java.util.*;
public class Ques_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>0 && arr[i]<=99)
			{
				
			}
			else
			{
				System.out.println("Wrong input enter no between 0 and 99");
				arr[i]=sc.nextInt();
			}
		}
		System.out.println("Your median for the above array is: "+median(arr.length,arr));
	}
	
	static float median(int a, int arr1[])
	{
		float median=0;
		for (int i = (arr1.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j<=i; j++)
		      {
		         if (arr1[j-1] > arr1[j])
		         {
		              int temp = arr1[j-1];
		              arr1[j-1] = arr1[j];
		              arr1[j] = temp;
		         } 
		      } 
		   }
		if(arr1.length%2!=0)
		{
			median=arr1[arr1.length/2];
		}
		else
		{
			median=((float)arr1[(arr1.length/2)-1]+(float)arr1[(arr1.length/2)])/2;
		}
		
		return median;
	}

}