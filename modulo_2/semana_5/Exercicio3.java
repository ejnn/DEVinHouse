package eduardo.jorge.nicolau;

import java.util.Enumeration;

import java.io.IOException;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

@WebServlet("/exercicio3")
public class Exercicio3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException {

	PrintWriter out = res.getWriter();

	out.print(""
		  + "<html>"
		  + "<body>");

	out.print(""
		  + "<table>"
		  + "<caption>Multiplication table</caption>");

	out.print(""
		  + "<tr>"
		  + "<td>x</td>");
	for (int n = 1; n < 11; n++) {
	    out.printf("<th scope='col'>%d</th>", n);
	}
	out.printf("</tr>");

	for (int i = 1; i < 11; i++) {
	    out.printf(""
		       + "<tr>"
		       + "<th scope='row'>%d</th>", i);
	    for (int j = 1; j < 11; j++) {
		out.printf("<td>%d</td>", i * j);
	    }
	    out.print("</tr>");
	}

	out.print(""
		  + "</table>");

	out.print(""
		  + "</html>"
		  + "</body>");

	out.flush();
    }
}
