package tr.com.ih.types;

public class EmployeeContract {

	private int id;
	private String nameLastName;
	private String email;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdsoyad() {
		return nameLastName;
	}

	public void setAdsoyad(String adsoyad) {
		this.nameLastName = adsoyad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + nameLastName + " " + email;
	}

}
