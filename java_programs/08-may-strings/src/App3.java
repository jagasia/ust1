
public class App3 {

	public static void main(String[] args) throws InterruptedException {
		Bank sbi=new Bank();
		try {
		sbi.withdraw(100000);
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		Thread.sleep(1000);
	}

}
