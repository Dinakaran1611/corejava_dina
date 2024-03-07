package Day_3;

public class Executor {
	public static void main (String[] args) {
		Customer c1= new Customer();
		c1.setCid(112);
		c1.setName("dina");
		c1.setAddress("pondy");
		System.out.println("customer id is "+c1.getCid()+" customer name "+c1.getName()+" customer address "+c1.getAddress());
	}

}
