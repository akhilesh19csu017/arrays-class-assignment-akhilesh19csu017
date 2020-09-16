import java.util.*;
public class Ques_12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr = new int[4][5];

		System.out.println("Enter the elements of array");
		for(int i=0; i<4; i++)
        {            
           for(int j=0; j<5; j++)
           {
        	   System.out.println("Enter cost of salseman "+(i+1)+" product "+(j+1));
               arr[i][j]=sc.nextInt();
           }
        }
		System.out.println("ENTERED DATA IS: ");
		System.out.println("   P1P2P3P4P5");
		for(int i=0; i<4; i++)
        {      System.out.print("S"+(i+1)+") ");      
           for(int j=0; j<5; j++)
           {
        	   System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
		System.out.println("ENTER THE TASK YOU WANT TO DO");
		System.out.println("1) Total sales of product 1         6) Salesman 1 total sale");
		System.out.println("2) Total sales of product 2         7) Salesman 2 total sale");
		System.out.println("3) Total sales of product 3         8) Salesman 3 total sale");
		System.out.println("4) Total sales of product 4         9) Salesman 3 total sale");
		System.out.println("5) Total sales of product 5");
		int a=sc.nextInt();
		int x=0;
		int y=0;
		switch(a)
		{
		case 1:
			x=1;
			break;
		case 2:
			x=2;
			break;
		case 3:
			x=3;
			break;
		case 4:
			x=4;
			break;
		case 5:
			x=5;
			break;
		case 6:
			y=1;
			break;
		case 7:
			y=2;
			break;
		case 8:
			y=3;
			break;
		case 9:
			y=4;
			break;	
		default:
			
		
		}
		int sum=0;
		int sum2=0;
		
		if(x!=0)
		{
			for(int i=0; i<4 ;i++)
			{
				sum=sum+arr[i][x-1];
			}
			System.out.println("So total sale of product"+(x)+" is :"+sum);
		}
		else
		{
			for(int j=0; j<5 ;j++)
			{
				sum2=sum2+arr[y-1][j];
			}
			System.out.println("So total sale of salseman "+(y)+" is :"+sum2);
		}
		
		
		

	}

}