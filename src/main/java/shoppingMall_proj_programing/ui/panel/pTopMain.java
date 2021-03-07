package shoppingMall_proj_programing.ui.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class pTopMain extends JPanel {

	public pTopMain() {
		initialize();
	}
	private void initialize() {
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
		
		JButton btnProduct = new JButton("\uC81C\uD488\uBCC4 \uC870\uD68C");
		btnProduct.setFont(new Font("굴림", Font.BOLD, 15));
		btnProduct.setForeground(Color.WHITE);
		btnProduct.setBackground(Color.BLACK);
		pLeftTop.add(btnProduct);
		
		JButton btnDetail = new JButton("\uC0C1\uC138\uC870\uD68C");
		btnDetail.setFont(new Font("굴림", Font.BOLD, 15));
		btnDetail.setBackground(Color.BLACK);
		btnDetail.setForeground(Color.WHITE);
		pLeftTop.add(btnDetail);
		
		JPanel pLeftBottom = new JPanel();
		pLeftBottom.setBackground(Color.ORANGE);
		pLeftBottom.setBorder(new EmptyBorder(15, 18, 15, 18));
		pLeft.add(pLeftBottom);
		pLeftBottom.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblWeather = new JLabel("\uB0A0\uC9DC\uBCC4 \uC870\uD68C            ");
		lblWeather.setHorizontalAlignment(SwingConstants.TRAILING);
		pLeftBottom.add(lblWeather);
		
		JComboBox cbbWeather = new JComboBox();
		pLeftBottom.add(cbbWeather);
		
		JPanel pRight = new JPanel();
		pRight.setBackground(Color.ORANGE);
		pRight.setBorder(new EmptyBorder(80, 30, 20, 250));
		add(pRight);
		pRight.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button = new JButton("검색");
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		pRight.add(button);
	}

}
