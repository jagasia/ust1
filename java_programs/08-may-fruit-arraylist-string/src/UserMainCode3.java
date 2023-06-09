import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;



public class UserMainCode3 {



	static String[] fruitSelector(List<String> list1, List<String> list2) {

		list1.removeIf((a)->a.toLowerCase().endsWith("a") || a.toLowerCase().endsWith("e"));		
		list2.removeIf((a)->a.toLowerCase().startsWith("m") || a.toLowerCase().startsWith("a"));
		list1.addAll(list2);		
		String []array=new String[list1.size()];
		return array;				

	}



}