package tr.com.ih.types;

import java.sql.Date;

public class StockContract {

	private int id;
	private int employeeId;
	private int productId;
	private Date date;
	private int piece;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAdet() {
		return piece;
	}

	public void setAdet(int piece) {
		this.piece = piece;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + employeeId + " " + productId + " " + piece + " " + date;
	}

}
