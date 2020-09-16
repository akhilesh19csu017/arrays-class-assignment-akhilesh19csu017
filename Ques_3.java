import java.util.*;
public class Ques_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int[] arr=new int[5];
		System.out.println("Enter the elements of array");
		for(int i=0; i<5; i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<5; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of all element is:"+sum);
		
		int sum2=0, sum3=0;
		
		for(int i=0; i<5; i++)
		{
			if(i%2==0)
			{
				sum2=sum2+arr[i];
			}
			else
			{
				sum3=sum3+arr[i];
			}
		}
		
		System.out.println("Sum of even index is: "+sum2);
		System.out.println("Sum of odd index is: "+sum3);
		
		for (int i = (arr.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j<=i; j++)
		      {
		         if (arr[j-1] > arr[j])
		         {
		              int temp = arr[j-1];
		              arr[j-1] = arr[j];
		              arr[j] = temp;
		   } 
		         } 
		      }
		
		System.out.println("Secon highest element is: "+arr[3]);
	}

}