import java.util.*;
public class MergeSort //SUB ARRAYS, SORT AND MERGE TWO ARRAYS
{
	void mergeArray(int[] a, int l,int m, int r)
	{
		int s1=(m-l)+1;
		int s2=r-m;
		int[] L=new int [s1];
		int[] R=new int[s2];
		for(int i=0;i<s1;++i)
			L[i]= a[l+i];
		for(int j=0;j<s2;++j)
			R[j]=a[m+1+j];
		int i=0,j=0,k=l;
		while(i<s1 && j<s2)
		{
			if(L[i] <= R[j])
			{
				a[k]=L[i];
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<s1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<s2)
		{
			a[k]=R[j];
			j++;
			k++;
		}
	}
	void sortArray(int a[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			sortArray(a,l,m);
			sortArray(a,m+1,r);
			mergeArray(a,l,m,r);
		}
	}
	public static void main(String[] args) 
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("\t\t\t MERGE SORT ");
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
		MergeSort ms=new MergeSort();
		ms.sortArray(a,0,a.length-1);
		System.out.println("  The Sorted Array :");
		for(int elm: a)
		{
			System.out.print(elm +" ");
		}
		}
	}
}
