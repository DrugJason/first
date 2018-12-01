package Action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.UserDao;
import doain.User;

public class Register extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	private UserDao userdao;
	//使用模型驱动，创建user的get方法
	public User getModel() {
		return user;
	}
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	public String execute() throws Exception {
		Boolean flage=userdao.RegisterDao(user);
		if(flage==true) {
			return "success";
		}
		else {
			return "error";
		}
	} 
}
