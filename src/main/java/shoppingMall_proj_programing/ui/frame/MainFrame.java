package shoppingMall_proj_programing.ui.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.GridLayout;
import shoppingMall_proj_programing.ui.panel.pTopMain;
import shoppingMall_proj_programing.ui.panel.pMidMain;
import shoppingMall_proj_programing.daoImpl.saleDaoImpl;
import shoppingMall_proj_programing.dto.sale;
import shoppingMall_proj_programing.ui.panel.pBottomMain;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private pTopMain pTop;
	private pMidMain pMain;
	private pBottomMain pBottom;

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

		pTop = new pTopMain();
		pTop.getBtnSelect().addActionListener(this);
		pTop.setOpaque(false);
		contentPane.add(pTop, BorderLayout.NORTH);

		pMain = new pMidMain();
		pMain.setOpaque(false);
		contentPane.add(pMain, BorderLayout.CENTER);
//		pMain.getTableMain().setModel(getModel());

		pBottom = new pBottomMain();
		pBottom.setOpaque(false);
		contentPane.add(pBottom, BorderLayout.SOUTH);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pTop.getBtnSelect()) {
			pTopBtnSelectActionPerformed(e);
		}
	}
	
	protected void pTopBtnSelectActionPerformed(ActionEvent e) {
		sale searchByDate = searchDate();
		saleDaoImpl.getInstance().selectMainByDate(searchByDate);
		pMain.getTableMain().setModel(getModel());
	}
	
	public DefaultTableModel getModel() {
		return new DefaultTableModel(getData(), getColumn());
	}
	
	public Object[][] getData() {
		try {
			sale searchByDate = searchDate();
			List<sale> list = saleDaoImpl.getInstance().selectMainByDate(searchByDate);
			Object[][] arr = new Object[list.size()][];
			for (int i = 0; i < list.size(); i++) {
				sale sale = list.get(i);
				arr[i] = new Object[] { 
						sale.getDate(), 
						sale.getCusno().getCusno(), 
						sale.getCusno().getCusname(),
						sale.getCusno().getCallno(), 
						sale.getProcode().getProcode(), 
						sale.getSaleamount(),
						sale.getSales() };
			}
			return arr;
		}catch (NumberFormatException e) {}
		return null;
	}



	public sale searchDate() {
		SimpleDateFormat searchDateFormat = new SimpleDateFormat("yyyy.MM.dd");
		Date searchDate = pTop.getJdcDate().getDate();
		String date = searchDateFormat.format(searchDate);
		sale searchByDate = new sale(date);
		return searchByDate;
	}

	public String[] getColumn() {
		return new String[] { "??????", "????????????", "?????????", "?????? ??????", "????????????", "?????? ??????", "?????????" };
	}
}
