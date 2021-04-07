package eduardo.jorge.nicolau;

import java.util.Enumeration;

import java.io.IOException;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

@WebServlet("/exercicio2")
public class Exercicio2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException {

	PrintWriter out = res.getWriter();

	out.print(""
		  + "<html>"
		  + "<body>");

	try {
	    int multiplier = Integer.parseInt(req.getParameter("number"));

	    out.print("<ul>");
	    for (int multiplicand = 1; multiplicand < 11; multiplicand++) {
		out.printf("<li>%dx%d = %d</li>", multiplier, multiplicand, multiplier * multiplicand);
	    }
	    out.print("</ul>");
	}
	catch (NumberFormatException e) {
	    out.print("<span>Please add 'number=_your integer here_' as a query to the URL.</span>");
	}

	out.print(""
		  + "</html>"
		  + "</body>");

	out.flush();
    }
}
