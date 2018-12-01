package Action;

import java.util.List;

import org.junit.Test;

import dao.UserDao;
import doain.User;

public class text {
	private User user=new User();
	//创建user对象的get方法
	public User getModel() {
		return user;
	}
	@Test
	public void test(){
		UserDao userdao=new UserDao();
		List<User> list=userdao.LoginDao(user);
		for(User user1:list) {
			System.out.println(user1);
		}
	}
}
