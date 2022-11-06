import java.util.*;
class DuplicatesInArray 
{
	public static void main(String[] args) 
	{
	
	int k=0;
	int count=0;
	int q=0;
	Scanner sc1=new Scanner(System.in);
	System.out.println("\t\t\t Program To Find The Duplicates ");
	System.out.println("Enter the size of the array: ");
	int size=sc1.nextInt();
	int[] num=new int[size];
	int[] d=new int[size];
	int[] b=new int[size];
	int[] c=new int[size];
	if(size<=0)
		System.out.println("Please enter a number greater than zero");
	else
		{
	System.out.println("Enter "+size+ " elements : ");
		for(int i=0;i<size;i++)
			{
			num[i]=sc1.nextInt();
			}
			System.out.println();
		System.out.println("The elements are : ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print("  "+num[i]);
			}
	System.out.println();		
	for(int i=0;i<num.length;i++)
		{
		b[i]=num[i];
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if((num[i]==num[j]) && j!=i)
				{
					d[j]=num[j];
					count=count+1;
				}
			}
		}
		System.out.println();
		if(count == 0)
		System.out.println("There are no duplicates");
		else
		{
			System.out.println("Duplicate numbers with their corresponding location :");
			for(int i=0;i<size;i++)
			{
				if(b[i]==d[i])
					System.out.println("Location[" +(i+1)+ "] = " +d[i]);
			}
		}
		System.out.println();
		System.out.println("NO.of occurences");
		int L[]=new int[num.length];
		int visited=-1;
		for(int i=0;i<num.length;i++)
			{
			int q1=1;
			for(int j=i+1;j<num.length;j++)
				{
				if(num[i]==num[j])
				{
					q1++;
				L[j]=visited;
				}
			}
			if(L[i]!=visited)
				L[i]=q1;
			}
			for(int i=0;i<L.length;i++)
			{
				if(L[i]!=visited)
					System.out.println("  "+num[i]+ " occurs "+L[i]+" time");
			}
		
			sc1.close();
		}	
	}
}