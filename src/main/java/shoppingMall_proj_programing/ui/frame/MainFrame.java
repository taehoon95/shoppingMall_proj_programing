package shoppingMall_proj_programing.ui.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import shoppingMall_proj_programing.ui.panel.pTopMain;
import shoppingMall_proj_programing.ui.panel.pMidMain;
import shoppingMall_proj_programing.ui.panel.pBottomMain;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	public MainFrame() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 50, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pTopMain pTop = new pTopMain();
		pTop.setOpaque(false);
		contentPane.add(pTop, BorderLayout.NORTH);
		
		pMidMain pMain = new pMidMain();
		pMain.setOpaque(false);
		contentPane.add(pMain, BorderLayout.CENTER);
		
		pBottomMain pBottom = new pBottomMain();
		pBottom.setOpaque(false);
		contentPane.add(pBottom, BorderLayout.SOUTH);
	}

}
