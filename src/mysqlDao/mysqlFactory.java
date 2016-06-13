package mysqlDao;

import dao.GuitarIdao;
import dao.Idaofactory;

public class mysqlFactory implements Idaofactory {
 

	@Override
	public GuitarIdao createIdao() {
		// TODO Auto-generated method stub
		 return new mysqlDao();
	}

}