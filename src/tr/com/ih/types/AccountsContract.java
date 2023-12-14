package tr.com.ih.types;

public class AccountsContract {
	
	private int id;
	private String password;
	private int powerId;
	private int employeeId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSifre() {
		return password;
	}
	public void setSifre(String sifre) {
		this.password = sifre;
	}
	public int getYetkiId() {
		return powerId;
	}
	public void setYetkiId(int yetkiId) {
		this.powerId = yetkiId;
	}
	public int getPersonelId() {
		return employeeId;
	}
	public void setPersonelId(int personelId) {
		this.employeeId = personelId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + employeeId + " " + password + " " + powerId;
	}
	

}
