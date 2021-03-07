package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class pMidProduct extends JPanel {
	private JTable tableProduct;
	
	public pMidProduct() {
		setBounds(175, 175, 850, 230);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		tableProduct = new JTable();
		tableProduct.setBackground(new Color(255, 200, 0));
		tableProduct.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"날짜", "제품코드", "제품명", "주문수량", "단가", "판매액", "이익금액"
			}
		));
		scrollPane.setViewportView(tableProduct);
	}

}
