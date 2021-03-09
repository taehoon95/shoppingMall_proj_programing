package shoppingMall_proj_programing.ui.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import shoppingMall_proj_programing.daoImpl.saleDaoImpl;
import shoppingMall_proj_programing.dto.sale;

import java.awt.Font;
import java.awt.Color;

public class pBottomMain extends JPanel {
	private JTextField tfTotalOrder;
	private JTextField tfTotalSales;
	private DecimalFormat df = new DecimalFormat("0,000");
	
	public pBottomMain() {
		initialize();
		setDataTfTotalOrder();
		setDataTfTotalSales();
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
		tfTotalOrder.setFont(new Font("굴림", Font.BOLD, 20));
		tfTotalOrder.setHorizontalAlignment(SwingConstants.CENTER);
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
		tfTotalSales.setFont(new Font("굴림", Font.BOLD, 20));
		tfTotalSales.setHorizontalAlignment(SwingConstants.CENTER);
		tfTotalSales.setBackground(Color.ORANGE);
		tfTotalSales.setColumns(10);
		add(tfTotalSales);
	}
	
	private void setDataTfTotalOrder() {
		List<sale> saleList = saleDaoImpl.getInstance().selectMain();
		int totalOrder=saleList
				.parallelStream()
				.mapToInt(sale::getSaleamount)
				.sum();
		tfTotalOrder.setText(totalOrder+"");
	}
	
	private void setDataTfTotalSales() {
		List<sale> saleList = saleDaoImpl.getInstance().selectMain();
		int totalSales=saleList
				.parallelStream()
				.mapToInt(sale::getSales)
				.sum();
		tfTotalSales.setText(df.format(totalSales));
	}
}
