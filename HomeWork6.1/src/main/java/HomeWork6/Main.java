package HomeWork6;

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister saveUser = new Persister(user);
		saveUser.save();
		ReportUser reportUser = new ReportUser(user);
		reportUser.report();

	}
}