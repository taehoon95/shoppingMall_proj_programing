package shoppingMall_proj_programing.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import shoppingMall_proj_programing.ui.frame.DetailFrame;
import shoppingMall_proj_programing.ui.frame.MainFrame;
import shoppingMall_proj_programing.ui.frame.ProductFrame;

import java.awt.GridLayout;
import java.io.File;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class shoppingMall_proj_programing_strat extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private JButton btnMain;
	private JButton btnProduct;
	private JButton btnDetail;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shoppingMall_proj_programing_strat frame = new shoppingMall_proj_programing_strat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public shoppingMall_proj_programing_strat() {
		initialize();
	}
	private void initialize() {
		setTitle("쇼핑몰");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1000, 980);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		imgPanel pImg = new imgPanel();
		contentPane.add(pImg);
		GridBagLayout gbl_pImg = new GridBagLayout();
		gbl_pImg.columnWidths = new int[]{0, 0};
		gbl_pImg.rowHeights = new int[]{0, 0};
		gbl_pImg.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pImg.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pImg.setLayout(gbl_pImg);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		pImg.add(panel, gbc_panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		
		btnMain = new JButton("메인");
		btnMain.addActionListener(this);
		btnMain.setFont(new Font("굴림", Font.BOLD, 30));
		btnMain.setBackground(Color.ORANGE);
		panel_7.add(btnMain);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		
		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8);
		
		btnProduct = new JButton("제품별 조회");
		btnProduct.addActionListener(this);
		btnProduct.setFont(new Font("굴림", Font.BOLD, 30));
		btnProduct.setBackground(Color.ORANGE);
		panel_8.add(btnProduct);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		
		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9);
		
		btnDetail = new JButton("상세 조회");
		btnDetail.addActionListener(this);
		btnDetail.setFont(new Font("굴림", Font.BOLD, 30));
		btnDetail.setBackground(Color.ORANGE);
		panel_9.add(btnDetail);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDetail) {
			btnDetailActionPerformed(e);
		}
		if (e.getSource() == btnProduct) {
			btnProductActionPerformed(e);
		}
		if (e.getSource() == btnMain) {
			btnMainActionPerformed(e);
		}
	}
	protected void btnMainActionPerformed(ActionEvent e) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
	protected void btnProductActionPerformed(ActionEvent e) {
		ProductFrame frame = new ProductFrame();
		frame.setVisible(true);
	}
	protected void btnDetailActionPerformed(ActionEvent e) {
		DetailFrame frame = new DetailFrame();
		frame.setVisible(true);
	}
}
