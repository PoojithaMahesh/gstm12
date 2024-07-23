package gstm12;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KarnatakaServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name=req.getParameter("name");
	String color=req.getParameter("color");
	ServletContext context=getServletContext();
	String cgst=context.getInitParameter("cgst");
	double cgst1=Double.parseDouble(cgst);
	
	ServletConfig config=getServletConfig();
	String sgstofkar=config.getInitParameter("sgstofkar");
	double sgstofkar1=Double.parseDouble(sgstofkar);
	System.out.println("CGST IS"+cgst1);
	System.out.println("SGST IS"+sgstofkar1);
//	hii
}
}
