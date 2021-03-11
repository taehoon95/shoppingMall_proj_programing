package shoppingMall_proj_programing.ui.Abstractpanel;

import javax.swing.AbstractButton;
import javax.swing.SwingConstants;

import shoppingMall_proj_programing.dto.sale;

public class PAbsMidMain extends AbstractCustomTablePanel<sale> {
	public PAbsMidMain() {
	}

	@Override
	public void setAlignAndWidth() {
		// 컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4);
		setTableCellAlign(SwingConstants.RIGHT, 5, 6);

		// 컬럼별 너비 조정
		setTableCellWidth(150, 100, 100, 100, 70, 70, 100);

//		// 조건에 맞는 셀 색조절
//		setTableCellCondition(2, 3, 4, 5, 6);
	}

	@Override
	public Object[] toArray(sale s) {
		return new Object[] { s.getDate(), s.getCusno().getCusno(), s.getCusno().getCusname(), s.getCusno().getCallno(),
				s.getProcode().getProcode(), s.getSaleamount(), s.getSales()

		};
	}

	@Override
	public String[] getColumnNames() {
		return new String[] { "날짜", "회원번호", "회원명", "휴대 전화", "제품코드", "주문 수량", "판매액" };
	}


}
