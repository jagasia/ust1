import java.util.List;

public class CallLog {
	private List<Call> callList;
	
	public CallLog() {}

	public CallLog(List<Call> callList) {
		super();
		this.callList = callList;
	}

	public List<Call> getCallList() {
		return callList;
	}

	public void setCallList(List<Call> callList) {
		this.callList = callList;
	}
	
	Contact getFavouriteContact()
	{
		//write your code here
		return null;	
	}
}
