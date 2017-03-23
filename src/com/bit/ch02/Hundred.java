package com.bit.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HundredServelt")
public class Hundred extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Hundred() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		response.setContentType("text/html;charset=euc-kr"); // 인코딩
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>1부터 100까지 더하는 서블릿</title></head>");
		out.println("<body>");
		out.printf("1부터 100까지의 합: %d", total);
		out.println("</body>");
		out.println("</html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
