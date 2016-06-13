package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Idaofactory;
import model.Guitar;
import model.GuitarSpec;
import mysqlDao.mysqlFactory;

/**
 * Servlet implementation class addGuitar
 */
@WebServlet("/addGuitar")
public class addGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		//response.setCharacterEncoding("utf-8");
		String price=request.getParameter("price");
		String serialNumber=request.getParameter("serialNumber");
	 
		Guitar guitar=new Guitar(serialNumber, serialNumber, null); 		
			guitar.setPrice(price);	
			guitar.setSerialNumber(serialNumber);	
			
			Idaofactory iDaoFactory=new mysqlFactory();
			try {
				GuitarSpec spec = null;
				iDaoFactory.createIdao().addGuitar(guitar);	   
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
