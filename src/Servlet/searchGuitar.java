package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Idaofactory;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;
import mysqlDao.mysqlFactory;
import util.DbUtil;

/**
 * Servlet implementation class searchGuitar
 */
@WebServlet("/searchGuitar")
public class searchGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
 
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String type=request.getParameter("type");
		String builder=request.getParameter("builder");
		String numStrings=request.getParameter("numStrings");
		String backWood=request.getParameter("backWood");
		String topWood=request.getParameter("topWood");
		Idaofactory iDaoFactory=new mysqlFactory();
		
			String sql = "select * from Guitar";
			List<Guitar> guitarList = new ArrayList<Guitar>();
			
			try {
				Connection conn = null;
				try {
					conn = DbUtil.getConnection("mysql");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				PreparedStatement ptmt = conn.prepareStatement(sql);
				ResultSet rs = ptmt.executeQuery();
				while(rs.next()){
					Guitar guitar = new Guitar(rs.getString("serialNumber"), rs.getString("price"), 
							new GuitarSpec(rs.getString("builder"),rs.getString("model"),
									rs.getString("type"),rs.getString("backWood"),
									rs.getString("topWood")));
					guitarList.add(guitar);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} 
	    
	}
   

