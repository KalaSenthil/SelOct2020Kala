package week1.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,7,6,8};
		
		int length = arr.length;
		
		
		System.out.println("Array Length: "+length);
		System.out.println("Print Original Array");
		for(int i=0;i<length;i++)
			System.out.print(arr[i]+",");
		System.out.println();
		Arrays.sort(arr);	
		System.out.println("Print Sorted Array");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
		for(int i=1;i<length;i++)
		{
			if((i)!=arr[i-1])
			{
				System.out.println("Missing Element: "+i);
				break;
			}			
			
		}
				
	}

}
