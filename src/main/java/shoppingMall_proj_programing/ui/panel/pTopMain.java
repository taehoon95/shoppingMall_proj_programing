package shoppingMall_proj_programing.ui.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

import shoppingMall_proj_programing.ui.frame.DetailFrame;
import shoppingMall_proj_programing.ui.frame.ProductFrame;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JDateChooser;

public class pTopMain extends JPanel implements ActionListener {
	private JButton btnProduct;
	private JButton btnDetail;
	private JButton btnSelect;
	private JDateChooser jdcWeather;

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
		
		btnProduct = new JButton("제품별 조회");
		btnProduct.addActionListener(this);
		btnProduct.setFont(new Font("굴림", Font.BOLD, 15));
		btnProduct.setForeground(Color.WHITE);
		btnProduct.setBackground(Color.BLACK);
		pLeftTop.add(btnProduct);
		
		btnDetail = new JButton("상세 조회");
		btnDetail.addActionListener(this);
		btnDetail.setFont(new Font("굴림", Font.BOLD, 15));
		btnDetail.setBackground(Color.BLACK);
		btnDetail.setForeground(Color.WHITE);
		pLeftTop.add(btnDetail);
		
		JPanel pLeftBottom = new JPanel();
		pLeftBottom.setBackground(Color.ORANGE);
		pLeftBottom.setBorder(new EmptyBorder(15, 18, 15, 18));
		pLeft.add(pLeftBottom);
		pLeftBottom.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblWeather = new JLabel("날짜별 조회");
		lblWeather.setFont(new Font("굴림", Font.BOLD, 15));
		lblWeather.setHorizontalAlignment(SwingConstants.CENTER);
		pLeftBottom.add(lblWeather);
		
		jdcWeather = new JDateChooser();
		pLeftBottom.add(jdcWeather);
		
		JPanel pRight = new JPanel();
		pRight.setBackground(Color.ORANGE);
		pRight.setBorder(new EmptyBorder(80, 30, 20, 250));
		add(pRight);
		pRight.setLayout(new GridLayout(0, 2, 0, 0));
		
		btnSelect = new JButton("검색");
		btnSelect.addActionListener(this);
		btnSelect.setBackground(Color.BLACK);
		btnSelect.setForeground(Color.WHITE);
		pRight.add(btnSelect);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSelect) {
			buttonActionPerformed(e);
		}
		if (e.getSource() == btnDetail) {
			btnDetailActionPerformed(e);
		}
		if (e.getSource() == btnProduct) {
			btnProductActionPerformed(e);
		}
	}
	protected void btnProductActionPerformed(ActionEvent e) {
		ProductFrame frame = new ProductFrame();
		frame.setVisible(true);
	}
	protected void btnDetailActionPerformed(ActionEvent e) {
		DetailFrame frame = new DetailFrame();
		frame.setVisible(true);
	}
	protected void buttonActionPerformed(ActionEvent e) {
		IDateEditor d = jdcWeather.getDateEditor();
		System.out.println(d);
	}
}
