package shoppingMall_proj_programing.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import shoppingMall_proj_programing.daoImpl.saleDaoImpl;
import shoppingMall_proj_programing.dto.sale;
import shoppingMall_proj_programing.ui.frame.DetailFrame;
import shoppingMall_proj_programing.ui.frame.ProductFrame;

public class pTopMain extends JPanel implements ActionListener {
	private JButton btnProduct;
	private JButton btnDetail;
	private JButton btnSelect;
	private JDateChooser jdcDate;
	private JPanel pRight;
	private JPanel pLeftBottom;
	private JPanel pLeftTop;
	private JPanel pLeft;
	private JLabel lblDate;

	public JPanel getpLeft() {
		return pLeft;
	}

	public void setpLeft(JPanel pLeft) {
		this.pLeft = pLeft;
	}

	public JPanel getpRight() {
		return pRight;
	}

	public void setpRight(JPanel pRight) {
		this.pRight = pRight;
	}

	public JPanel getpLeftBottom() {
		return pLeftBottom;
	}

	public void setpLeftBottom(JPanel pLeftBottom) {
		this.pLeftBottom = pLeftBottom;
	}

	public JPanel getpLeftTop() {
		return pLeftTop;
	}

	public void setpLeftTop(JPanel pLeftTop) {
		this.pLeftTop = pLeftTop;
	}

	public JButton getBtnProduct() {
		return btnProduct;
	}

	public void setBtnProduct(JButton btnProduct) {
		this.btnProduct = btnProduct;
	}

	public JButton getBtnDetail() {
		return btnDetail;
	}

	public void setBtnDetail(JButton btnDetail) {
		this.btnDetail = btnDetail;
	}

	public JButton getBtnSelect() {
		return btnSelect;
	}

	public void setBtnSelect(JButton btnSelect) {
		this.btnSelect = btnSelect;
	}


	public JDateChooser getJdcDate() {
		return jdcDate;
	}

	public void setJdcDate(JDateChooser jdcDate) {
		this.jdcDate = jdcDate;
	}

	public JLabel getLblDate() {
		return lblDate;
	}

	public void setLblDate(JLabel lblDate) {
		this.lblDate = lblDate;
	}

	public pTopMain() {
		initialize();
	}

	private void initialize() {
		setBackground(Color.ORANGE);
		setBounds(50, 50, 850, 125);
		setLayout(new GridLayout(1, 0, 0, 0));

		pLeft = new JPanel();
		add(pLeft);
		pLeft.setLayout(new GridLayout(0, 1, 0, 0));

		pLeftTop = new JPanel();
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

		pLeftBottom = new JPanel();
		pLeftBottom.setBackground(Color.ORANGE);
		pLeftBottom.setBorder(new EmptyBorder(15, 18, 15, 18));
		pLeft.add(pLeftBottom);
		pLeftBottom.setLayout(new GridLayout(0, 2, 0, 0));

		lblDate = new JLabel("날짜별 조회");
		lblDate.setFont(new Font("굴림", Font.BOLD, 15));
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		pLeftBottom.add(lblDate);

		jdcDate = new JDateChooser();
		pLeftBottom.add(jdcDate);

		pRight = new JPanel();
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
		Date searchDate = jdcDate.getDate();
		SimpleDateFormat searchDateFormat = new SimpleDateFormat("yyyy.MM.dd");
		String date = searchDateFormat.format(searchDate);
		sale searchByDate = new sale(date);
		saleDaoImpl.getInstance().selectMainByDate(searchByDate);
	}
}
