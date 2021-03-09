package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import shoppingMall_proj_programing.daoImpl.saleDaoImpl;
import shoppingMall_proj_programing.dto.sale;

public class pBottomProduct extends JPanel {
	private JTextField tfTotalOrder;
	private JTextField tfTotalProfit;
	private DecimalFormat df = new DecimalFormat("0,000");
	
	public pBottomProduct() {
		initialize();
		setDataTfTotalOrder();
		setDataTfTotalProfit();
	}

	private void initialize() {
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
		tfTotalOrder.setFont(new Font("굴림", Font.BOLD, 20));
		tfTotalOrder.setHorizontalAlignment(SwingConstants.CENTER);
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
		tfTotalProfit.setHorizontalAlignment(SwingConstants.CENTER);
		tfTotalProfit.setFont(new Font("굴림", Font.BOLD, 20));
		tfTotalProfit.setBackground(Color.ORANGE);
		tfTotalProfit.setColumns(10);
		add(tfTotalProfit);		
	}

	private void setDataTfTotalProfit() {
		List<sale> saleList = saleDaoImpl.getInstance().selectProduct();
		int totalOrder = saleList.parallelStream().mapToInt(sale::getSaleamount).sum();
		tfTotalOrder.setText(totalOrder+"");
	}

	private void setDataTfTotalOrder() {
		List<sale> saleList = saleDaoImpl.getInstance().selectProduct();
		int totalProfit = saleList.parallelStream().mapToInt(sale::getProfit).sum();
		tfTotalProfit.setText(df.format(totalProfit));
	}
}
