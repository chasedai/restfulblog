package utils;

import java.util.List;

import model.PostModel;
import model.userTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory;

    //私有化构造器
    private HibernateUtils(){}

    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    public static void creatRecord(Object object){
    	Session session = sessionFactory.openSession();
    	Transaction ts = session.beginTransaction();
    	session.save(object);
    	ts.commit();
    	session.close();
    }
    
    public static PostModel retrieveSingleByID(int id){
    	Session session = sessionFactory.openSession();
    	return session.get(PostModel.class, id);	
    }
    
    /**
     * 返回所有blog select * from table
     * @return All Posts records in database
     */
    public static List<PostModel> retrieveAllPosts(){
    	return sessionFactory.openSession().createCriteria(PostModel.class).list();
    }

}
