package tr.com.ih.types;

public class CustomerContract {
	
	private int id;
	private String nameLastName;
	private String phone;
	private String address;
	private int cityId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameLastName() {
		return nameLastName;
	}

	public void setNameLastName(String nameLastName) {
		this.nameLastName = nameLastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + nameLastName + " " + cityId + " " + address + " " + phone;
	}

}
