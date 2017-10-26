package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularController
 */
@WebServlet("/calcular")
public class CalcularController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PrintWriter out = null;
	private static String msg = "Error";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String resultado = "";
		
		//recoger params
		String op1 = request.getParameter("operador1");
		String op2 = request.getParameter("operador2");
		String operacion = request.getParameter("operacion");
		/*
		try {
			out = response.getWriter();
			
			switch (operacion) {
			case "Suma":
				Sumar(request);
				break;
				
			case "Resta":
				Restar(request);
				break;
				
			case "Division":
				Dividir(request);
				break;
				
			case "Multiplicacion":
				Multiplicar(request);
				break;
				
			default:
				out.write("No existe esa opción");
				break;
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			out.write(" Exception " +  e.getMessage());
		}finally {
			//request.setAttribute("msg", msg);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		*/
			// enviar atributo a la vista
			request.setAttribute("operacion", operacion );
			request.setAttribute("resultado", resultado );
			request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
/*
	private void Sumar(HttpServletRequest request) {


	}
	
	*/

}
