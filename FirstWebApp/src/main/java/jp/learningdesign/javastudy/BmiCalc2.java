package jp.learningdesign.javastudy;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BmiCalc2
 */
@WebServlet("/bmi")
public class BmiCalc2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BmiCalc2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>����ɂ��́A�T�[�u���b�g�̐��E�ւ悤�����I");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String height_in,weight_in;
		double height, weight, bmi;
		height_in = request.getParameter("height1");
		weight_in = request.getParameter("weight1");
		height = Double.parseDouble(height_in);
		weight = Double.parseDouble(weight_in);
		height /= 100;
		bmi = weight /(height * height);
		
		out.println("<html><body>");
		out.println("���Ȃ���BMI(�̊i�w��)�́A" + bmi + "�ł��B");
	}

}
