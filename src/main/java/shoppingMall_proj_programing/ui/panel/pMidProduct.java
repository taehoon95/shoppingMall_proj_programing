package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import shoppingMall_proj_programing.daoImpl.saleDaoImpl;
import shoppingMall_proj_programing.dto.sale;

public class pMidProduct extends JPanel {
	private JTable tableProduct;
	
	public pMidProduct() {
		setBounds(175, 175, 850, 230);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		tableProduct = new JTable();
		tableProduct.setBackground(new Color(255, 200, 0));
		tableProduct.setModel(getModel());
		scrollPane.setViewportView(tableProduct);
	}

	public DefaultTableModel getModel() {
		return new DefaultTableModel(getData(),getColumn());
	}

	public Object[][] getData() {
		List<sale> list = saleDaoImpl.getInstance().selectProduct();
		Object[][] arr = new Object[list.size()][];
		for(int i = 0; i < list.size(); i++) {
			sale sale = list.get(i);
			arr[i] = new Object[] {
					sale.getDate(),
					sale.getProcode().getProcode(),
					sale.getProcode().getProname(),
					sale.getSaleamount(),
					sale.getProcode().getProprice(),
					sale.getSales(),
					sale.getProfit()
			};
		}
		return arr;
	}

	public String[] getColumn() {
		return new String[] {
			"날짜", "제품코드", "제품명", "주문수량", "단가", "판매액", "이익금액"
		};
	}

}
