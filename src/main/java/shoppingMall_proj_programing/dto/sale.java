package shoppingMall_proj_programing.dto;

public class sale {
	private int orderno;
	private String date;
	private customer cusno;
	private product procode;
	private int saleamount;
	private int sales;
	

	public int getSales() {
		return (int)(procode.getProprice()*saleamount*1.1);
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public sale(String date, customer cusno, product procode, int saleamount) {
		this.date = date;
		this.cusno = cusno;
		this.procode = procode;
		this.saleamount = saleamount;
	}

	public sale(String date, int orderno, customer cusno, product procode, int saleamount) {
		this.date = date;
		this.orderno = orderno;
		this.cusno = cusno;
		this.procode = procode;
		this.saleamount = saleamount;
	}

	public sale() {}

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public customer getCusno() {
		return cusno;
	}

	public void setCusno(customer cusno) {
		this.cusno = cusno;
	}

	public product getProcode() {
		return procode;
	}

	public void setProcode(product procode) {
		this.procode = procode;
	}

	public int getSaleamount() {
		return saleamount;
	}

	public void setSaleamount(int saleamount) {
		this.saleamount = saleamount;
	}

	@Override
	public String toString() {
		return String.format("sale [orderno=%s, date=%s, cusno=%s, procode=%s, saleamount=%s]", orderno, date, cusno,
				procode, saleamount);
	}

}
