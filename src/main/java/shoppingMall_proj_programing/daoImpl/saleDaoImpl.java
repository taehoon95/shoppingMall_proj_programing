package shoppingMall_proj_programing.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import shoppingMall_proj_programing.dao.saleDao;
import shoppingMall_proj_programing.dto.sale;
import shoppingMall_proj_programing_util.JdbcUtil;

public class saleDaoImpl implements saleDao {

	@Override
	public List<sale> selectMain() {
		String sql = "";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<sale> selectProduct() {
		return null;
	}

	@Override
	public List<sale> detailInfo() {
		return null;
	}

}
