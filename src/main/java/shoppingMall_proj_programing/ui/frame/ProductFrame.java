package shoppingMall_proj_programing.ui.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import shoppingMall_proj_programing.ui.panel.pBottomProduct;
import shoppingMall_proj_programing.ui.panel.pMidProduct;
import shoppingMall_proj_programing.ui.panel.pTopProduct;


public class ProductFrame extends JFrame {

	private JPanel contentPane;
	
	public ProductFrame() {
		setTitle("제품별 조회");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 50, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pTopProduct pTop = new pTopProduct();
		pTop.setOpaque(false);
		contentPane.add(pTop, BorderLayout.NORTH);
		
		pMidProduct pMain = new pMidProduct();
		pMain.setOpaque(false);
		contentPane.add(pMain, BorderLayout.CENTER);
		
		pBottomProduct pBottom = new pBottomProduct();
		pBottom.setOpaque(false);
		contentPane.add(pBottom, BorderLayout.SOUTH);
	}

}
