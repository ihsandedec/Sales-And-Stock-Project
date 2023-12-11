package tr.com.ih.types;

import java.sql.Date;

public class ProductsContract {

	private int id;
	private String name;
	private int categoryId;
	private Date date;
	private float price;

	public float getFiyat() {
		return price;
	}

	public void setFiyat(float fiyat) {
		this.price = fiyat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return name;
	}

	public void setAdi(String adi) {
		this.name = adi;
	}

	public int getKatagoriId() {
		return categoryId;
	}

	public void setKatagoriId(int katagoriId) {
		this.categoryId = katagoriId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + categoryId + " " + date + " " + price;
	}
	
}
