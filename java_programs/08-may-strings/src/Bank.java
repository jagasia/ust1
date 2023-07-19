class WithdrawLimitExceededException extends RuntimeException
{
	public WithdrawLimitExceededException()
	{
		
	}
	public WithdrawLimitExceededException(String message)
	{
		super(message);
	}
}

public class Bank {
	public void withdraw(int amount)// throws WithdrawLimitExceededException
	{
		if(amount>30000)
		{
//			throw new ArithmeticException("Amount "+amount+" is > 30k");
			throw new WithdrawLimitExceededException("amount is large");
		}else
		{
			System.out.println("Remember to collect the cash");
		}
	}
}
