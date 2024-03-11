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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPowerId() {
		return powerId;
	}
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + employeeId + " " + password + " " + powerId;
	}
	

}
