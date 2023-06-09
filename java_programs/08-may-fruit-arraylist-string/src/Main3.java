
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



public class Main3 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		UserMainCode3 user3=new UserMainCode3();

		

		Scanner sc=new Scanner(System.in);


		int m=sc.nextInt();

		List<String> list1=new ArrayList<>();

		for(int i=0;i<m;i++)

		{
			String input=sc.nextLine();
			if(input.equals(""))
				input=sc.nextLine();
			list1.add(input);

		}

		

		int n=sc.nextInt();

		List<String> list2=new ArrayList<>();

		for(int i=0;i<n;i++)

		{
			String input=sc.nextLine();
			if(input.equals(""))
				input=sc.nextLine();
			list2.add(input);


		}



		

		String[] array=user3.fruitSelector(list1,list2);

		

		for(int i=0;i<array.length;i++)

		{

			System.out.println(array[i]);

		}

		

	}



}



