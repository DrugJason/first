package Action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.HibernateUtils;
import dao.UserDao;
import doain.User;

public class Login extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	String password=null;
	private UserDao userdao;
	
	public String execute() throws Exception {
		ActionContext context=ActionContext.getContext();
		List<User> list = userdao.LoginDao(user);
		for(User user1:list) {
			password=user1.getPassword();
		}
		if(list==null) {
			return "error";
		}
		else if(user.getPassword().equals(password)) {
			context.getSession().put("user", user);
			return "success";
		}
		else {
			context.put("mgs", "你输入的信息有错，请重新输入");
			return "error";
		}
	}
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	//创建user对象的get方法
	public User getModel() {
		return user;
	}
	
}
