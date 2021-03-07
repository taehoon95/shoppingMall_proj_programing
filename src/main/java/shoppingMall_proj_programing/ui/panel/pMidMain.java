package shoppingMall_proj_programing.ui.panel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

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
		tableMain.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"날짜", "회원번호", "회원명", "휴대 전화", "제품코드", "주문 수량", "판매액"
			}
		));
		scrollPane.setViewportView(tableMain);
	}

}
