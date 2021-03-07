package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class pBottomProduct extends JPanel {
	private JTextField tfTotalOrder;
	private JTextField tfTotalProfit;
	
	public pBottomProduct() {
		setBounds(455, 455, 850, 55);
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
		
		JLabel lblSales = new JLabel("총 이익금액 : ");
		lblSales.setOpaque(true);
		lblSales.setBackground(Color.ORANGE);
		lblSales.setFont(new Font("굴림", Font.BOLD, 20));
		lblSales.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblSales);
		
		tfTotalProfit = new JTextField();
		tfTotalProfit.setBackground(Color.ORANGE);
		tfTotalProfit.setColumns(10);
		add(tfTotalProfit);
	}

}
