// program demonstrating entity 
package Day_3;

public class Customer {
	
	private int cid;
	private String name;
	private String address;
	
	// getter and setter 
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + "]";
	}
	
	//default constructor
	public Customer() {
		this.cid=0;
		this.name="no name entered";
		this.address="invalid or not entered";
		
	}
	//parameter constructor
	public Customer(int cid,String name,String address) {
		this.cid=cid;
		this.name=name;
		this.address=address;
		
	}

}
