package task_1;

public class User {

	private final String username;
	private String password;
	
	public User (String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	public String get_username() {
		return username;
	}
	
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	public void setPassword(String currentPassword, String newPassword) {
		if (this.checkPassword(currentPassword)) {
			this.password=newPassword;
			System.out.println("Password is successfully changed");
			
		}
		else {
			System.out.println("Error:Invalid Password");
		}
	}
}
