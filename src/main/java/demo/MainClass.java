package demo;

import java.util.List;

import com.niit.daoimpl.UserDAOImpl;
import com.niit.model.User;

public class MainClass
{
	public static void main(String[] args) {
		UserDAOImpl udi=new UserDAOImpl();
		List<User> users=udi.displayUsers();
		
	
		for (User user : users) {
			System.out.println(user.getUserid());
			System.out.println(user.getUsername());
		}
	}
}
