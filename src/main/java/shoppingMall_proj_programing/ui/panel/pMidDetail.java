package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class pMidDetail extends JPanel {
	private JTable tableDetail;

	public pMidDetail() {
		setBackground(Color.ORANGE);
		setBounds(175, 175, 850, 230);
		setLayout(new GridLayout(0, 1, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.ORANGE);
		add(scrollPane);

		tableDetail = new JTable();
		tableDetail.setBackground(new Color(255, 200, 0));
		tableDetail.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "번호", "날짜", "제품코드", "제품명", "회원명", "주문 수량", "단가", "판매액", "이익금액" }));
		scrollPane.setViewportView(tableDetail);
	}

}
