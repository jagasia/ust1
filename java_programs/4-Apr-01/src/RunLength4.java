import java.util.Scanner;

public class RunLength4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		int maxCount=0;
		int startIndex=-1;
		int maxStartIndex=-1;
		//display all elements
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
				if(count==1)
					startIndex=i;
				if(count>maxCount)
				{
					maxCount=count;
					maxStartIndex=startIndex;
				}
			}else
			{
				count=0;
			}
			System.out.println("Count="+count);
			System.out.println("MaxCount="+maxCount);
			System.out.println("StartIndex="+startIndex);
			System.out.println("MaxStartIndex="+maxStartIndex);
		}
	}

}
