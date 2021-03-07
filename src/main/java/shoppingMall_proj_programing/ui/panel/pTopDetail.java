package shoppingMall_proj_programing.ui.panel;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class pTopDetail extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	public pTopDetail() {
		initialize();
	}
	private void initialize() {
		setBounds(50, 50, 850, 125);
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pLeft = new JPanel();
		add(pLeft);
		pLeft.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pLeftLeft = new JPanel();
		pLeftLeft.setBackground(Color.ORANGE);
		pLeft.add(pLeftLeft);
		pLeftLeft.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC0C1\uC138 \uC870\uD68C");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		pLeftLeft.add(lblNewLabel);
		
		JPanel pLeftRight = new JPanel();
		pLeftRight.setBackground(Color.ORANGE);
		pLeft.add(pLeftRight);
		
		JPanel pRight = new JPanel();
		add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pRightTop = new JPanel();
		pRightTop.setBorder(new EmptyBorder(15, 0, 15, 0));
		pRightTop.setBackground(Color.ORANGE);
		pRight.add(pRightTop);
		pRightTop.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uC81C\uD488\uBCC4 \uAC80\uC0C9");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		pRightTop.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		pRightTop.add(comboBox);
		
		textField = new JTextField();
		pRightTop.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uAC80\uC0C9");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		pRightTop.add(btnNewButton);
		
		JPanel pRightBottom = new JPanel();
		pRightBottom.setBorder(new EmptyBorder(15, 0, 15, 0));
		pRightBottom.setBackground(Color.ORANGE);
		pRight.add(pRightBottom);
		pRightBottom.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel label = new JLabel("\uD68C\uC6D0\uBCC4 \uAC80\uC0C9");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		pRightBottom.add(label);
		
		JComboBox comboBox_1 = new JComboBox();
		pRightBottom.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		pRightBottom.add(textField_1);
		
		JButton button = new JButton("\uAC80\uC0C9");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.BLACK);
		pRightBottom.add(button);
	}

}
