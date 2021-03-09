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

public class pBottomDetail extends JPanel {
	private JTextField tfCountOrder;
	private JTextField tfTotalOrder;
	private JTextField tfTotalSales;
	private JTextField tfTotalProfit;
	private DecimalFormat df = new DecimalFormat("0,000");
	
	public pBottomDetail() {
		initialize();
		setDataTfCountOrder();
		setDataTfTotalProfit();
		setDataTfTotalOrder();
		setDataTfTotalSales();
	}

	private void initialize() {
		setBounds(455, 455, 850, 55);
		setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblCountOrder = new JLabel("총 주문건수 : ");
		lblCountOrder.setBackground(Color.ORANGE);
		lblCountOrder.setOpaque(true);
		lblCountOrder.setFont(new Font("굴림", Font.BOLD, 15));
		lblCountOrder.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblCountOrder);

		tfCountOrder = new JTextField();
		tfCountOrder.setFont(new Font("굴림", Font.BOLD, 15));
		tfCountOrder.setHorizontalAlignment(SwingConstants.CENTER);
		tfCountOrder.setBackground(Color.ORANGE);
		add(tfCountOrder);
		tfCountOrder.setColumns(10);

		JLabel lblTotalOrder = new JLabel("총 주문수량 : ");
		lblTotalOrder.setOpaque(true);
		lblTotalOrder.setBackground(Color.ORANGE);
		lblTotalOrder.setFont(new Font("굴림", Font.BOLD, 15));
		lblTotalOrder.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblTotalOrder);

		tfTotalOrder = new JTextField();
		tfTotalOrder.setFont(new Font("굴림", Font.BOLD, 15));
		tfTotalOrder.setHorizontalAlignment(SwingConstants.CENTER);
		tfTotalOrder.setBackground(Color.ORANGE);
		tfTotalOrder.setColumns(10);
		add(tfTotalOrder);

		JLabel lblTotalSales = new JLabel("총 판매액 : ");
		lblTotalSales.setOpaque(true);
		lblTotalSales.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTotalSales.setFont(new Font("굴림", Font.BOLD, 15));
		lblTotalSales.setBackground(Color.ORANGE);
		add(lblTotalSales);

		tfTotalSales = new JTextField();
		tfTotalSales.setHorizontalAlignment(SwingConstants.CENTER);
		tfTotalSales.setFont(new Font("굴림", Font.BOLD, 15));
		tfTotalSales.setColumns(10);
		tfTotalSales.setBackground(Color.ORANGE);
		add(tfTotalSales);

		JLabel lblTotalProfit = new JLabel("총 이익금액 : ");
		lblTotalProfit.setOpaque(true);
		lblTotalProfit.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTotalProfit.setFont(new Font("굴림", Font.BOLD, 15));
		lblTotalProfit.setBackground(Color.ORANGE);
		add(lblTotalProfit);

		tfTotalProfit = new JTextField();
		tfTotalProfit.setFont(new Font("굴림", Font.BOLD, 15));
		tfTotalProfit.setHorizontalAlignment(SwingConstants.CENTER);
		tfTotalProfit.setColumns(10);
		tfTotalProfit.setBackground(Color.ORANGE);
		add(tfTotalProfit);
	}

	private void setDataTfCountOrder() {
		List<sale> saleList = saleDaoImpl.getInstance().selectDetailInfo();
		tfCountOrder.setText(saleList.size()+"");
	}
	
	private void setDataTfTotalOrder() {
		List<sale> saleList = saleDaoImpl.getInstance().selectDetailInfo();
		int totalOrder = saleList
				.parallelStream()
				.mapToInt(sale::getSaleamount)
				.sum();
		tfTotalOrder.setText(totalOrder+"");
	}
	
	private void setDataTfTotalSales() {
		List<sale> saleList = saleDaoImpl.getInstance().selectDetailInfo();
		int totalSales=saleList
				.parallelStream()
				.mapToInt(sale::getSales)
				.sum();
		tfTotalSales.setText(df.format(totalSales));
	}

	private void setDataTfTotalProfit() {
		List<sale> saleList = saleDaoImpl.getInstance().selectProduct();
		int totalProfit = saleList.parallelStream().mapToInt(sale::getProfit).sum();
		tfTotalProfit.setText(df.format(totalProfit));
	}
}
