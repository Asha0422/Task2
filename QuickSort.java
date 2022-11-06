import java.util.*;
public class QuickSort{ // DIVIDE AND CONQUER ALGORITHM
	int split(int[] a, int low,int high)
	{
		int pivot=a[high];
		int i=(low-1);
		for(int j=low;j<high;j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return i+1;
	}
	void sortArray(int[] a,int low,int high)
	{
		if(low<high)
		{
			int m=split(a,low,high);
			sortArray(a,low,m-1);
			sortArray(a,m+1,high);
		}
	}
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("\t\t\t QUICK SORT ");
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
		QuickSort qs=new QuickSort();
		qs.sortArray(a,0,a.length-1);
		System.out.println("  The Sorted array is :");
		for(int elm:a)
		{
			System.out.println(elm +"    ");
		}
		}
	}
}

