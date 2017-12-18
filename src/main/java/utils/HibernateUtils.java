package utils;

import java.util.ArrayList;
import java.util.List;

import model.PostModel;

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
    	PostModel pm = session.get(PostModel.class, id);
    	session.close();
    	return pm;	
    }
    
    /**
     * 返回所有blog select * from table
     * @return All Posts records in database
     */
//    @SuppressWarnings("unchecked")
	public static List<PostModel> retrieveAllPosts(){
		
    	List<PostModel> list = (ArrayList<PostModel>)sessionFactory.openSession().createCriteria(PostModel.class).list();
    	return list;
    }

}
