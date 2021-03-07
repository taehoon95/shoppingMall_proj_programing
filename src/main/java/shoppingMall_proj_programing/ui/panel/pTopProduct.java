package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class pTopProduct extends JPanel {
	private JTextField textField;

	public pTopProduct() {
		setBackground(Color.ORANGE);
		setBounds(50, 50, 850, 125);
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pLeft = new JPanel();
		add(pLeft);
		pLeft.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pLeftTop = new JPanel();
		pLeftTop.setBackground(Color.ORANGE);
		pLeftTop.setBorder(new EmptyBorder(18, 15, 18, 30));
		pLeft.add(pLeftTop);
		pLeftTop.setLayout(new GridLayout(1, 0, 40, 20));
		
		JLabel lblTitleProduct = new JLabel("\uC81C\uD488\uBCC4 \uC870\uD68C");
		lblTitleProduct.setFont(new Font("굴림", Font.BOLD, 22));
		lblTitleProduct.setBackground(Color.ORANGE);
		pLeftTop.add(lblTitleProduct);
		
		JPanel pLeftBottom = new JPanel();
		pLeftBottom.setBackground(Color.ORANGE);
		pLeftBottom.setBorder(new EmptyBorder(15, 18, 15, 18));
		pLeft.add(pLeftBottom);
		pLeftBottom.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uAC80\uC0C9\uC870\uAC74");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		pLeftBottom.add(lblNewLabel);
		
		JComboBox cbbWeather = new JComboBox();
		pLeftBottom.add(cbbWeather);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 15));
		textField.setBackground(Color.ORANGE);
		pLeftBottom.add(textField);
		textField.setColumns(10);
		
		JPanel pRight = new JPanel();
		pRight.setBackground(Color.ORANGE);
		pRight.setBorder(new EmptyBorder(80, 50, 20, 160));
		add(pRight);
		pRight.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button = new JButton("검색");
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		pRight.add(button);
		
		JButton btnNewButton = new JButton("\uCD08\uAE30\uD654");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		pRight.add(btnNewButton);
	}

}
