package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.PostModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hibernate CRUD
 * @author Chase
 *
 */
public class HibernateUtils {
	
	private static SessionFactory sessionFactory;

    private HibernateUtils(){}

    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }
    /**
     * New post
     * @param object
     * @return 
     */
    public static boolean creatRecord(Object object){
    	try {
    		Session session = sessionFactory.openSession();
        	Transaction ts = session.beginTransaction();
        	session.save(object);
        	ts.commit();
        	session.close();
        	return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
    }
    
    /**
     * Get one post by ID
     * @param id
     * @return One post
     */
    public static PostModel retrieveSingleByID(int id){
    	try {
    		Session session = sessionFactory.openSession();
        	PostModel pm = session.get(PostModel.class, id);
        	session.close();
        	return pm;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("something wrong fetching data");
			return null;
		}	
    }
    
    /**
     * Delete one post by ID
     * @param id
     * @return true if deleted, false if not
     */
    public static boolean deletePostById(int id){
    	try {
    		PostModel pm = retrieveSingleByID(id);
        	Session session = sessionFactory.openSession();
        	Transaction ts = session.beginTransaction();
        	session.delete(pm);
        	ts.commit();
        	session.close();
        	return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("something wrong deleting data");
			return false;
		}
    }
    
    /**
     * Update post
     * @param object
     * @return true if updated, false if not
     */
    public static boolean updatePost(Object object){
    	try {
    		Session session = sessionFactory.openSession();
        	Transaction ts = session.beginTransaction();
        	session.update(object);
        	ts.commit();
        	session.close();
        	return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("something wrong updating data");
			return false;
		}
    }
    
    
    
    
    
    /**
     * Return all posts: select * from table
     * @return A list of posts
     */
	@SuppressWarnings("unchecked")
	public static List<PostModel> retrieveAllPosts(){
    	try {
    		List<PostModel> list = (ArrayList<PostModel>)sessionFactory.openSession().createCriteria(PostModel.class).list();
        	Collections.reverse(list);
        	return list;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("something wrong fetching list");
			return null;
		}
    }

}
