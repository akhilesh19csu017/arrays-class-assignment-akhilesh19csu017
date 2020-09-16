import java.util.*;
public class Ques_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the elements of array");
		for(int i=0; i<10; i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Elements at even index are");
		System.out.println(arr[0]+","+arr[2]+","+arr[4]+","+arr[6]+","+arr[8]);
		System.out.println("Odd elements are:");
		for(int i=0; i<10; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Elements in reverse order is:");
		for(int i=9; i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("First element: "+arr[0]+" Last element: "+arr[9]);
	}

}