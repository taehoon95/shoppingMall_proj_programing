package shoppingMall_proj_programing.ui.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class pBottomMain extends JPanel {
	private JTextField tfTotalOrder;
	private JTextField tfTotalSales;

	public pBottomMain() {
		initialize();
	}
	private void initialize() {
		setBounds(455, 455, 850, 55);
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblTotalOrder = new JLabel("총 주문수량 : ");
		lblTotalOrder.setBackground(Color.ORANGE);
		lblTotalOrder.setOpaque(true);
		lblTotalOrder.setFont(new Font("굴림", Font.BOLD, 20));
		lblTotalOrder.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblTotalOrder);
		
		tfTotalOrder = new JTextField();
		tfTotalOrder.setBackground(Color.ORANGE);
		add(tfTotalOrder);
		tfTotalOrder.setColumns(10);
		
		JLabel lblSales = new JLabel("총 판매량 : ");
		lblSales.setOpaque(true);
		lblSales.setBackground(Color.ORANGE);
		lblSales.setFont(new Font("굴림", Font.BOLD, 20));
		lblSales.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblSales);
		
		tfTotalSales = new JTextField();
		tfTotalSales.setBackground(Color.ORANGE);
		tfTotalSales.setColumns(10);
		add(tfTotalSales);
	}

}
