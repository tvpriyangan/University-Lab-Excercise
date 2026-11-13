package task_1;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new  User ("B1","OOP");
		
		String username= u1.get_username();
		String password="OOP";
		String newPassword="newOOP";
		
		System.out.println("UserName:"+ username);
		
		u1.setPassword(password,newPassword);
		System.out.println("New Password changed:"+u1.checkPassword(newPassword));
		

	}

}
