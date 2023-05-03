import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String emailId;
	private String contactNumber;
	private List<UserScore> userScoreList;
	
	public User() {}

	public User(String name, String emailId, String contactNumber, List<UserScore> userScoreList) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.userScoreList = userScoreList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<UserScore> getUserScoreList() {
		return userScoreList;
	}

	public void setUserScoreList(List<UserScore> userScoreList) {
		this.userScoreList = userScoreList;
	}
	
	public static List<User> prefill(){
        List<User> list = new ArrayList<>();
        list.add(new User("Harry","harry@gmail.com","9874585258",new ArrayList<UserScore>()));
        list.add(new User("Oliver","oliver@gmail.com","9515951263",new ArrayList<UserScore>()));
        list.add(new User("Danny","danny@gmail.com","8745874585",new ArrayList<UserScore>()));
        list.add(new User("Matt","matt@gmail.com","9636925686",new ArrayList<UserScore>()));
        list.add(new User("James","james@gmail.com","8454585263",new ArrayList<UserScore>()));
        list.add(new User("Rob","rob@gmail.com","8475216953",new ArrayList<UserScore>()));
        list.add(new User("Brandon","brandon@gmail.com","8457548965",new ArrayList<UserScore>()));
        list.add(new User("Winn","winn@gmail.com","9231252136",new ArrayList<UserScore>()));
        list.add(new User("Barry","barry@gmail.com","9568956235",new ArrayList<UserScore>()));
        list.add(new User("Joe","joe@gmail.com","8525623568",new ArrayList<UserScore>()));
        list.add(new User("John","john@gmail.com","8454575412",new ArrayList<UserScore>()));
        list.add(new User("Slade","slade@gmail.com","9584758652",new ArrayList<UserScore>()));
        return list;
    }

}
