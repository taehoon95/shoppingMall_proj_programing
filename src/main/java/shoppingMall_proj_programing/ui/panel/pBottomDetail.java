package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class pBottomDetail extends JPanel {
	private JTextField tfTotalOrder;
	private JTextField tfTotalSales;
	private JTextField textField;
	private JTextField textField_1;
	public pBottomDetail() {
		initialize();
	}
	private void initialize() {
		setBounds(455, 455, 850, 55);
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblTotalOrder = new JLabel("\uCD1D \uC8FC\uBB38\uAC74\uC218 : ");
		lblTotalOrder.setBackground(Color.ORANGE);
		lblTotalOrder.setOpaque(true);
		lblTotalOrder.setFont(new Font("굴림", Font.BOLD, 15));
		lblTotalOrder.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblTotalOrder);
		
		tfTotalOrder = new JTextField();
		tfTotalOrder.setBackground(Color.ORANGE);
		add(tfTotalOrder);
		tfTotalOrder.setColumns(10);
		
		JLabel lblSales = new JLabel("\uCD1D \uC8FC\uBB38\uC218\uB7C9 : ");
		lblSales.setOpaque(true);
		lblSales.setBackground(Color.ORANGE);
		lblSales.setFont(new Font("굴림", Font.BOLD, 15));
		lblSales.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblSales);
		
		tfTotalSales = new JTextField();
		tfTotalSales.setBackground(Color.ORANGE);
		tfTotalSales.setColumns(10);
		add(tfTotalSales);
		
		JLabel label = new JLabel("\uCD1D \uD310\uB9E4 \uC561 : ");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("굴림", Font.BOLD, 15));
		label.setBackground(Color.ORANGE);
		add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.ORANGE);
		add(textField);
		
		JLabel label_1 = new JLabel("\uCD1D \uC774\uC775\uAE08\uC561 : ");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setFont(new Font("굴림", Font.BOLD, 15));
		label_1.setBackground(Color.ORANGE);
		add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.ORANGE);
		add(textField_1);
	}

}
