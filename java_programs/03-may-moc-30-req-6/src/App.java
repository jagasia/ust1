import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of user scores:");
		int n=sc.nextInt();
		List<User> uList = User.prefill();
		List<Course> cList = Course.prefill();
		List<UserScore> usl=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
//			95.2,Harry,JavaScript
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
			Double completionPercentage=Double.valueOf(arr[0]);
			String userName=arr[1];
			User user=null;
			for(User u : uList)
			{
				if(u.getName().equals(userName))
					user=u;
			}
			String courseName=arr[2];
			Course course=null;
			for(Course c : cList)
			{
				if(c.getName().equals(courseName))
					course=c;
			}
			UserScore us=new UserScore();
			us.setCompletionPercentage(completionPercentage);
			us.setUser(user);
			us.setCourse(course);
			usl.add(us);
		}
		Map<String, UserScore> result = UserScore.getTopPerformer(usl);
		System.out.format("%-15s %s\n","Course","Top performer");
		for(Entry<String, UserScore> e:result.entrySet())
		{
			String courseName=e.getKey();
			UserScore us = e.getValue();
			User user=us.getUser();
			String userName=user.getName();
			System.out.format("%-15s %s\n",courseName,userName);
		}
	}

}
