package tr.com.ih.types;

public class PowersContract {

	private int id;
	private String name;

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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name;
	}
	
}
