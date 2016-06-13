package sqliteDao;

import dao.GuitarIdao;
import dao.Idaofactory;

public class sqliteFactory implements Idaofactory {
 

	@Override
	public GuitarIdao createIdao() {
		// TODO Auto-generated method stub
		 return new sqliteDao();
	}

}