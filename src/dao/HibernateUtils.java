package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	static Configuration cfg=null;
	static SessionFactory sessionfactory=null;
	static {
		//加载hibernater.cfg.xml配置
		cfg=new Configuration();
		cfg.configure();
		sessionfactory=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}
}
