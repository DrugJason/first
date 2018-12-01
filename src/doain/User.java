package doain;

public class User{
	private Integer id;
	private String username;
	private String password;
	private String email;
	//设置主键
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	//获取表单中的账号
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//获取表单中的密码
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
}
