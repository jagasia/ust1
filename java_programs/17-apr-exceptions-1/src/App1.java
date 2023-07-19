import java.io.FileNotFoundException;
import java.io.IOException;

class InvalidAmountException extends Exception
{
	public InvalidAmountException(String message)
	{
		super(message);
	}
}

class Bank
{
	public void withdraw(int amount) throws InvalidAmountException //throws IOException
	{
		if(amount>20000)
//			throw new NumberFormatException("Amount is > 20k so we cannot dispense that cash");
//			throw new IOException("Amount is > 20k so we cannot dispense that cash");
			throw new InvalidAmountException("This message is typed by me");
		else
			System.out.println("Remember to collect the cash");
		System.out.println("Happy day");
	}
}

public class App1 {

	public static void main(String[] args) {
		Bank sbi=new Bank();
		try
		{
			sbi.withdraw(51000);
			System.out.println("Line after withdraw within try block");
		}		
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe.getMessage());
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Welcome back");
	}

}
