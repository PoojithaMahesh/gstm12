package gstm12;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TNServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext context=getServletContext();
	String cgst=context.getInitParameter("cgst");
	double cgst1=Double.parseDouble(cgst);
	System.out.println("cgst iss   :::"+cgst1);
	ServletConfig config=getServletConfig();
	String sgstoftn=config.getInitParameter("sgstoftn");
	System.out.println(sgstoftn);
	
	String sgstofkar=config.getInitParameter("sgstofkar");
	System.out.println("Yes im trying to access sgst of kar in tn and the sgst of kar value is::"+sgstofkar);
	
	
}
}
