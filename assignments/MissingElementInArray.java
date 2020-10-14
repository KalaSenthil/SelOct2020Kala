package week1.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,7,6,8};
		int total = 0;
		int missnum;
		int largestnum;
		int length = arr.length;
		int[] newArray = arr.clone();
		
		int newLength = newArray.length;
		System.out.println("New Cloned Array");
		for(int i=0;i<length;i++)
			System.out.print(newArray[i]+",");
		System.out.println();
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
		largestnum = arr[length-1];
		
		System.out.println();
		System.out.println("largest number: "+largestnum);
		
		
		for(int i=1;i<length;i++)
		{
			if((i)!=arr[i-1])
			{
				System.out.println("Missing Element: "+i);
				break;
			}			
			
		}
		/*for(int i=0;i<length;i++)
		{
			total=total+arr[i];
			
		}
		
		System.out.println("Array Total: "+total);	
		
		
		missnum = ((largestnum*(largestnum+1))/2)-total;
		
		System.out.println("Missing Number: "+missnum);
		*/
		
				
		
	}

}
