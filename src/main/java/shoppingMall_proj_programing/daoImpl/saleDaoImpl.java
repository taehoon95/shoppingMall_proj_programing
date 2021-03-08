package shoppingMall_proj_programing.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shoppingMall_proj_programing.dao.saleDao;
import shoppingMall_proj_programing.dto.customer;
import shoppingMall_proj_programing.dto.product;
import shoppingMall_proj_programing.dto.sale;
import shoppingMall_proj_programing_util.JdbcUtil;

public class saleDaoImpl implements saleDao {

	private static final saleDaoImpl instance = new saleDaoImpl();
	
	private saleDaoImpl() {};
	
	public static saleDaoImpl getInstance() {
		return instance;
	}
	

	private sale getSale(ResultSet rs) throws SQLException {
		int profit = 0;
		String date = rs.getString("date");
		
		customer cusno = new customer(rs.getInt("cusno"));
		
		try{
			cusno.setCusname(rs.getString("cusName"));	
		}catch (SQLException e) {}
		try{
			cusno.setCallno(rs.getString("callno"));
		}catch (SQLException e) {}
		product procode = new product(rs.getString("procode"));
		try {
			procode.setProname(rs.getString("proName"));
			procode.setProprice(rs.getInt("proPrice"));
		}catch (SQLException e) {}
		int saleamount = rs.getInt("saleamount");
		int sales = rs.getInt("sales");
		try {
			profit = rs.getInt("profit");
		}catch (SQLException e) {}
		return new sale(date, cusno, procode, saleamount, sales, profit);
	}
	
	@Override
	public List<sale> selectMain() {
		String sql = "select date,cusNo,cusName,callNo,procode,saleamount,sales from vw_main";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if(rs.next()) {
				ArrayList<sale> list = new ArrayList<sale>();
				do {
					list.add(getSale(rs));
				}while(rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public List<sale> selectProduct() {
		String sql = "select cusNo,date,procode,proName,saleamount,proprice,sales,profit from vw_product;";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if(rs.next()) {
				ArrayList<sale> list = new ArrayList<sale>();
				do {
					list.add(getSale(rs));
				}while(rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<sale> selectDetailInfo() {
		String sql = "select `date`,procode,proName,cusName,saleamount,proPrice,sales,profit,cusno from vw_detail";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if(rs.next()) {
				ArrayList<sale> arrList = new ArrayList<sale>();
				do {
					arrList.add(getSale(rs));
				}while(rs.next());
				return arrList;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
