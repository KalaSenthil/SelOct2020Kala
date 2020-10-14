package week1.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		int[] firstArray = {3,2,11,4,6,7};
		int[] secArray = {1,2,8,4,9,7};
		
		for(int i=0;i<firstArray.length;i++)
		{
			for(int j=0;j<secArray.length;j++)
			{
				if(secArray[j]==firstArray[i])
					System.out.println(firstArray[i]);
			}
		}
		
	}

}
