package tr.com.ih.types;

public class CategoryContract {
	
	private int id;
	private String name;
	private int parentId;
	
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
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return id + " " + name + " " + parentId;
	}

}
