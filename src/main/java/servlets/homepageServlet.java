package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class homepageServlet
 */
@WebServlet("/2112.html")
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
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
		out.println(a);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
