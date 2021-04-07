package eduardo.jorge.nicolau;

import java.util.Enumeration;

import java.io.IOException;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

@WebServlet("/exercicio1")
public class Exercicio1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException {

	PrintWriter out = res.getWriter();

	out.print(""
		  + "<html>"
		  + "<body>");

	out.print("<ul>");
	Enumeration<String> headerNames = req.getHeaderNames();
	while (headerNames.hasMoreElements()) {

	    String headerName = headerNames.nextElement();
	    out.print("<li>" + headerName + ": ");

	    Enumeration<String> headerValues = req.getHeaders(headerName);
	    while (headerValues.hasMoreElements()) {
		out.print(headerValues.nextElement()
			  + (headerValues.hasMoreElements() ? ", " : ""));
	    }

	    out.print("</li>");
	}
	out.print("</ul>");


	out.print(""
		  + "</html>"
		  + "</body>");

	out.flush();
    }
}
