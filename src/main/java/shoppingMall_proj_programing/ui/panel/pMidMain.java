package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import shoppingMall_proj_programing.daoImpl.saleDaoImpl;
import shoppingMall_proj_programing.dto.sale;

public class pMidMain extends JPanel {
	private JTable tableMain;
	public pMidMain() {
		initialize();
	}
	private void initialize() {
		setBackground(Color.ORANGE);
		setBounds(175, 175, 850, 230);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.ORANGE);
		add(scrollPane);
		
		tableMain = new JTable();
		tableMain.setBackground(new Color(255, 200, 0));
		tableMain.setModel(getModel());
		scrollPane.setViewportView(tableMain);
	}
	public DefaultTableModel getModel() {
		return new DefaultTableModel(
			getData(),
			getColumn()
		);
	}
	public Object[][] getData() {
		List<sale> list = saleDaoImpl.getInstance().selectMain();
		Object[][] arr = new Object[list.size()][];
		for(int i = 0; i < list.size(); i++) {
			sale sale = list.get(i);
			arr[i] = new Object[] {
					sale.getDate(),
					sale.getCusno().getCusno(),
					sale.getCusno().getCusname(),
					sale.getCusno().getCallno(),
					sale.getProcode().getProcode(),
					sale.getSaleamount(),
					sale.getSales()
					
			};	
		}
		return arr; 
		
	}
	public String[] getColumn() {
		return new String[] {
			"날짜", "회원번호", "회원명", "휴대 전화", "제품코드", "주문 수량", "판매액"
		};
	}

}
