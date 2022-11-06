import java.util.*;
public class BubbleSort //SWAPPING OF ADJACENT ELEMENTS IF THEY ARE IN WRONG ORDER
	{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("\t\t\t BUBBLE SORT ");
	System.out.println("  Enter the size of the array: ");
	int size=sc1.nextInt();
	int[] a=new int[size];
	if(size<=0)
		System.out.println("  Please enter a number greater than zero");
	else
		{
	System.out.println("  Enter "+size+ " elements : ");
		for(int i=0;i<size;i++)
			{
			a[i]=sc1.nextInt();
			}
		
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("  The Sorted array is :");
		for(int k:a)
		{
			System.out.println(k+ " ");
		}
		}
	}
}

