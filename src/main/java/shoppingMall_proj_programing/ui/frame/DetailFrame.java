package shoppingMall_proj_programing.ui.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import shoppingMall_proj_programing.ui.panel.pBottomDetail;
import shoppingMall_proj_programing.ui.panel.pMidDetail;
import shoppingMall_proj_programing.ui.panel.pTopDetail;

public class DetailFrame extends JFrame {

	private JPanel contentPane;

	
	public DetailFrame() {
		setTitle("상세 조회");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 50, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pTopDetail pTop = new pTopDetail();
		pTop.setOpaque(false);
		contentPane.add(pTop, BorderLayout.NORTH);
		
		pMidDetail pMain = new pMidDetail();
		pMain.setOpaque(false);
		contentPane.add(pMain, BorderLayout.CENTER);
		
		pBottomDetail pBottom = new pBottomDetail();
		pBottom.setOpaque(false);
		contentPane.add(pBottom, BorderLayout.SOUTH);
	}

}
