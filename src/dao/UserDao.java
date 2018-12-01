package dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import Action.Register;
import doain.User;
@Transactional
public class UserDao {
	SessionFactory sessionfactory=null;
	Session session=null;
	Transaction t=null;
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//登入操作
	public List<User> LoginDao(User user) {
		List<User> list=(List<User>) hibernateTemplate.find("from User where username=?",user.getUsername());
		return list;
		/*List<User> list = null;
		try {
			sessionfactory=HibernateUtils.getSessionfactory();
			session=sessionfactory.openSession();
			t=session.beginTransaction();
			//创建Query对象进行查询操作
			Query query=session.createQuery("from User where username='"+user.getUsername()+"'");
			//得到查询的值
			list=query.list();
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}finally {
			session.close();
		}
		return list;*/
	}
	//注册
	public Boolean RegisterDao(User user) {
		Boolean flage=null;
		if(user.getUsername()==null || user.getUsername()=="") {
			flage=false;
		}
		else if(user.getPassword()==null || user.getPassword()=="") {
			flage=false;
		}
		else {
			flage=true;
			hibernateTemplate.save(user);
		}
		/*try {
			sessionfactory=HibernateUtils.getSessionfactory();
			session=sessionfactory.openSession();
			t=session.beginTransaction();
			if(user.getUsername()==null || user.getUsername()=="") {
				flage=false;
			}
			else if(user.getPassword()==null || user.getPassword()=="") {
				flage=false;
			}
			else {
				flage=true;
				session.save(user);
			}
			t.commit();
		}catch(Exception e) {
			flage=false;
			t.rollback();
		}finally {
			session.close();
		}*/
		return flage;
	}
}
