package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class pTopProduct extends JPanel implements ActionListener {
	private JTextField tfSelect;
	private JButton btnNewButton;

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
		
		JLabel lblTitleProduct = new JLabel("제품별 조회");
		lblTitleProduct.setFont(new Font("굴림", Font.BOLD, 22));
		lblTitleProduct.setBackground(Color.ORANGE);
		pLeftTop.add(lblTitleProduct);
		
		JPanel pLeftBottom = new JPanel();
		pLeftBottom.setBackground(Color.ORANGE);
		pLeftBottom.setBorder(new EmptyBorder(15, 18, 15, 18));
		pLeft.add(pLeftBottom);
		pLeftBottom.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblProInfo = new JLabel("검색조건");
		lblProInfo.setFont(new Font("굴림", Font.BOLD, 20));
		pLeftBottom.add(lblProInfo);
		
		JComboBox cbbProInfo = new JComboBox();
		pLeftBottom.add(cbbProInfo);
		
		tfSelect = new JTextField();
		tfSelect.setHorizontalAlignment(SwingConstants.CENTER);
		tfSelect.setFont(new Font("굴림", Font.BOLD, 15));
		tfSelect.setBackground(Color.ORANGE);
		pLeftBottom.add(tfSelect);
		tfSelect.setColumns(10);
		
		JPanel pRight = new JPanel();
		pRight.setBackground(Color.ORANGE);
		pRight.setBorder(new EmptyBorder(80, 50, 20, 160));
		add(pRight);
		pRight.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button = new JButton("검색");
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		pRight.add(button);
		
		btnNewButton = new JButton("초기화");
		btnNewButton.addActionListener(this);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		pRight.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			btnNewButtonActionPerformed(e);
		}
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		tfSelect.setText("");
	}
}
