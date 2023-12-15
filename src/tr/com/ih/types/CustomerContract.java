package tr.com.ih.types;

public class CustomerContract {
	
	private int id;
	private String nameLastName;
	private String phone;
	private String address;
	private String cityId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdSoyad() {
		return nameLastName;
	}

	public void setAdSoyad(String adSoyad) {
		this.nameLastName = adSoyad;
	}

	public String getTelefon() {
		return phone;
	}

	public void setTelefon(String telefon) {
		this.phone = telefon;
	}

	public String getAdres() {
		return address;
	}

	public void setAdres(String adres) {
		this.address = adres;
	}

	public String getSehirId() {
		return cityId;
	}

	public void setSehirId(String sehirId) {
		this.cityId = sehirId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + nameLastName + " " + cityId + " " + address + " " + phone;
	}

}
