package shoppingMall_proj_programing.ui.Abstractpanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public abstract class AbstractCustomTablePanel<T> extends JPanel {
	private JTable table;

	public AbstractCustomTablePanel() {

		initialize();
	}

	private void initialize() {
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
	}

	public Object[][] getData() {
		return new Object[][] {};
	}

	public void setList(List<T> list) { //list 넘겨 받아서 Object2차배열 생성하고 그 길이 만큼 돌리면서 테이블 생성
		Object[][] data = new Object[list.size()][];
		for (int i = 0; i < data.length; i++) {
			data[i] = toArray(list.get(i));
		}
		
		CustomTableModel model = new CustomTableModel(data, getColumnNames());
		table.setModel(model);
		
		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
		table.setRowSorter(sorter);
		
		setAlignAndWidth();
	}

	/*
	 *컬럼내용 정렬 
	 *setTableCellAlign(SwingConstants.CENTER, 0, 1); 
	 *
	 *컬럼별 너비 조정
	 *setTableCellWidth(100, 250, 100);
	 *조건에 맞는 셀 색조절
	 *setTableCellCondition(2, 3, 4, 5, 6);
	 */
	
	public abstract void setAlignAndWidth();
	
	protected void setTableCellWidth(int... width) {
		TableColumnModel tcm = table.getColumnModel();
		
		for(int i = 0; i < width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);
		}
	}

	protected void setTableCellAlign(int align, int... idx) {
		TableColumnModel tcm = table.getColumnModel();
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		for(int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}

	public void setTableCellCondition(int... idx) {
		ConditionTableCellRenderer ctcr = new ConditionTableCellRenderer();
		TableColumnModel tcm = table.getColumnModel();
		for (int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(ctcr);
		}
	}
	
	private class ConditionTableCellRenderer extends JLabel implements TableCellRenderer{

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			setText(value == null ? "" : value.toString());
			setOpaque(true);
			int total = (int)table.getValueAt(row, column); // 
			if(total < 200) {
				setBackground(Color.pink);
			} else {
				setBackground(Color.orange);
			}
			setHorizontalAlignment(SwingConstants.RIGHT);
			return this;
		}
		
	}
	
	public abstract Object[] toArray(T t); // 하위 클래스에서 데이터 입력
	
	public abstract String[] getColumnNames(); // 하위 클래스에서 컬럼명 입력
	
	private class CustomTableModel extends DefaultTableModel{ // 클릭해서 수정 불가능

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}
		
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}
}
