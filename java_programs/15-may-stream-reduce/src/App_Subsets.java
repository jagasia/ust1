import java.util.HashSet;

public class App_Subsets {

	private static boolean isPrime(int number) {
		if (number <= 3)
			return true;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		HashSet<String> hset = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
//				System.out.println("single digit subset:"+arr[i]);
				hset.add(arr[i] + "");
			}
			HashSet<Integer> set2 = new HashSet<Integer>();
			String str2 = "";
			for (int j = 0; j < arr.length; j++) {
				if (isPrime(arr[i]) && isPrime(arr[j])) {
//					System.out.println("two digits subset:"+arr[i]+","+arr[j]);
					set2.add(arr[i]);
					set2.add(arr[j]);
					str2+=arr[i];
					str2+=arr[j];
					if(str2.length()==set2.size())
						hset.add(arr[i] + "," + arr[j]);
				}
				HashSet<Integer> set = new HashSet<Integer>();
				String str = "";
				for (int k = 0; k < arr.length; k++) {
					if (isPrime(arr[i]) && isPrime(arr[j]) && isPrime(arr[k])) {
//					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
						set.add(arr[i]);
						set.add(arr[j]);
						set.add(arr[k]);
						str += arr[i];
						str += arr[j];
						str += arr[k];
						if (set.size() == str.length()) {
//						System.out.println("three digit  subset:"+set);
							hset.add(str);
						}
					}
				}
			}
		}
		
		for(String x:hset)
			System.out.println(x);
	}

}
