package dao;

import java.sql.SQLException;
import java.util.List;

import model.Guitar;
import model.GuitarSpec;

public interface GuitarIdao {
	public void addGuitar(String serialNumber, String price,
            GuitarSpec spec) throws Exception;
	public List<Guitar> searchGuitar(String serialNumber) throws SQLException, Exception;
	public void delGuitar(String serialNumber) throws SQLException;
}
