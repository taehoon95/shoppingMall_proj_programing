package shoppingMall_proj_programing.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import shoppingMall_proj_programing.daoImpl.saleDaoImpl;
import shoppingMall_proj_programing.dto.sale;

public class saleDaoTest {

	private saleDao dao = saleDaoImpl.getInstance(); 
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testSelectMain() {
		System.out.println("testSelectMain");
		List<sale> list = dao.selectMain();
		Assert.assertNotNull(list);
		for(sale a : list) {
			System.out.println(a);
		}
	}

	@Test
	public void testSelectProduct() {
		System.out.println("testSelectProduct");
		List<sale> list = dao.selectProduct();
		Assert.assertNotNull(list);
		for(sale s : list) {
			System.out.println(s.toString2());
		}
	}

	@Test
	public void testDetailInfo() {
		System.out.println("testDetailInfo");
		List<sale> list = dao.selectDetailInfo();
		Assert.assertNotNull(list);
		for(sale s : list) {
			System.out.println(s.toString3());
		}
	}

}
