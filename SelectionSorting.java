import java.util.*;
public class SelectionSorting //FIND THE MINIMUM ELEMENT AND PLACE IT IN THE BEGINNING OF THE ARRAY
	{
		void sort(int[] a)
		{
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
					int temp=a[min];
					a[min]=a[i];
					a[i]=temp;
				}
			}
		}

		}
	public static void main(String[] args)
	{
		System.out.println("\t\t\t SELECTION SORT ");
		int[] a={2,0,9,-13,5,4,7};
		System.out.println("Array before sorting :");
		System.out.println();
		for(int i=0;i<a.length;i++)
			System.out.print("  "+a[i]);
		System.out.println();
		SelectionSorting ss=new SelectionSorting();
		ss.sort(a);
		System.out.println("  The Sorted array is :");
		System.out.println();
		for(int k:a)
		{
			System.out.print("  "+k);
		}
	}
}

