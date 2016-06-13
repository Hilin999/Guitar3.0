package sqliteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.GuitarIdao;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;
import util.DbUtil;

public class sqliteDao implements GuitarIdao {

	@Override
	public void addGuitar(String serialNumber, String price, GuitarSpec spec) throws Exception {
		// TODO Auto-generated method stub
		Guitar guitar=new Guitar(serialNumber, price, spec);
		String sql = "insert into inventory (price,serialNumber) values (?,?) ";
		Connection conn=DbUtil.getConnection("mysql");
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, guitar.getPrice());
		ptmt.setString(2, guitar.getSerialNumber());
		ptmt.close();     
	}

	@Override
	public List<Guitar> searchGuitar(String serialNumber) throws Exception {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			String sql = "select * from inventory where 1=1 ";
			Connection conn=DbUtil.getConnection("mysql");
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			Inventory inventory=new Inventory();
			while (rs.next()) {
					inventory.addGuitar(rs.getString("serialNumber"),rs.getString("price"), 
						new GuitarSpec(rs.getString("builder"), rs.getString("type"), rs.getString("numStrings"), 
					                     rs.getString("backwood"), rs.getString("topwood")));
						
						}
			ptmt.close();
			return null;
		}
	
	@Override
	public void delGuitar(String serialNumber) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from inventory where id=? ";
		Connection conn = null;
		try {
			conn = DbUtil.getConnection("mysql");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, serialNumber);	 
		ptmt.close();
	}

}
