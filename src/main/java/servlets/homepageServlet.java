package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PathParam;

import model.PostModel;
import utils.HibernateUtils;

/**
 * Servlet implementation class homepageServlet
 */
@WebServlet("/posts/*")
public class homepageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public homepageServlet() {
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		String a = "他家就";
//		String docType =
//		"<!DOCTYPE HTML >";
//		out.println(docType +
//		"<HTML>\n" + 
//		"<HEAD><meta charset='UTF-8' /><TITLE>哈哈啊哈</TITLE></HEAD>\n" +
//		"<BODY BGCOLOR=\"#FDF5E6\">\n" +
//		"<H1>Hello</H1>\n" + "<Script>alert('文本')</Script>" + 
//		"</BODY></HTML>");
//		out.close();
		System.out.println(a);
		System.out.println(request.getServletPath());
		System.out.println(request.getPathInfo());
		System.out.println(request.getPathInfo().substring(1, request.getPathInfo().length()));
		//url不变
		request.getRequestDispatcher("../allposts/postDetail.jsp").forward(request, response);
		//out.println(a);
		//out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
