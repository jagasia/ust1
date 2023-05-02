import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//
		int count=0;
		int finalCount=0;
		int startIndex=-1;
		int finalStartIndex=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				//even number
				count++;
				if(count==1)
				{
					startIndex=i;					
				}
				if(count>finalCount)
				{
					finalCount=count;
					finalStartIndex=startIndex;
				}
			}else
			{
				count=0;
			}
		}
		System.out.println("final count:"+finalCount);
		System.out.println("final start index:"+finalStartIndex);
	}

}
