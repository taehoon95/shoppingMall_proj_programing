package shoppingMall_proj_programing.dao;

import java.util.List;

import shoppingMall_proj_programing.dto.sale;

public interface saleDao {
	List<sale> selectMain();
	List<sale> selectProduct();
	List<sale> detailInfo();
}
