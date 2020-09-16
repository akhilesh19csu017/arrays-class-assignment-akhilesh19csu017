import java.util.*;
public class Ques_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int count=0, count2=0;
		for(int i=0;i<n-1; i++)
		{
			if(arr[i]==6 && arr[i+1]==6)
			{
				count=count+1;
			}
			else if(arr[i]==6 && arr[i+1]==7)
			{
				count2=count2+1;
			}
		}
		
		System.out.println("The occurance of number of consecutive 6's is: "+count);
		System.out.println("The number of times 7 can after 6 is: "+count2);

	}

}