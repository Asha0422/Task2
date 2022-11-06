import java.util.*;
class SubsetArray 
{
	public static void main(String[] args) 
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the size of the 1st array: ");
	int size1=sc1.nextInt();
	int[] a=new int[size1];
	
	
	int k=0;
	int count=0;
	System.out.println("Enter "+size1+ " elements for the 1st array : ");
		for(int i=0;i<size1;i++)
			{
			
			a[i]=sc1.nextInt();
			}
			System.out.println("Enter the size of the 2nd array: ");
	int size2=sc1.nextInt();
		System.out.println("Enter "+size2+ " elements for the 2nd array : ");
		int[] b=new int[size2];
		for(int i=0;i<size2;i++)
			{
			
			b[i]=sc1.nextInt();
			}
		System.out.println("The elements of 1st array are : ");
		for(int i=0;i<size1;i++)
		{
			System.out.print(+a[i] +" ");
		}
		System.out.println();
				System.out.println("The elements of 2nd array are : ");
		for(int i=0;i<size2;i++)
		{
			System.out.print(+b[i] +" ");
		}
		System.out.println();
		if(size1>size2)
			System.out.println("First array has more elements, Let us check whether 2nd array is the subset");
		else
			System.out.println("Second array has more elements, Let us check whether 1st array is the subset");
		if(size1>size2)
		{
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(b[i]==a[j])
						count++;
				}
			}
			if(count==size2)
				System.out.println("Yes, 2nd array is the subset");
			else
				System.out.println("2nd array is not the subset");
		}
		else
			{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
						count++;
				}
			}
			if(count==size1)
				System.out.println("Yes, 1st array is the subset");
			else
				System.out.println("1st array is not the subset");
		}
	}
}