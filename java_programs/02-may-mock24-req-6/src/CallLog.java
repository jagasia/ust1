import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class CallLog {
	private List<Call> callList;
	
	public CallLog() {
		this.callList=new ArrayList<Call>();
	}

	public CallLog(List<Call> callList) {
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
		//what input we have?		callList is the input
		//what output we find?		contact that has done more calls
		
		Map<Contact, Integer> map=new LinkedHashMap<Contact, Integer>();
		for(Call call : callList)
		{
			Contact contact = call.getContact();
			//check if this contact already present in the map
			Integer count = map.get(contact);	//equals should be overriden
			if(count==null)
				count=0;
			count++;
			map.put(contact, count);
		}
		//find the largest count in the map
		int max=0;
		Contact maxContact=null;
		for(Entry<Contact, Integer> e:map.entrySet())
		{
			int count=e.getValue();
			if(count>max)
			{
				max=count;
				maxContact=e.getKey();
			}
		}
		return maxContact;
		
		//using stream api
//		Optional<Integer> result = map.values().stream()
//		.max((a,b)->a-b);
//		
//		int count=0;
//		if(result!=null)
//			count=result.get();
//		
//		//count will contain the max count. we need to find key when value is count
//		
		
//		return null;
	}
}
