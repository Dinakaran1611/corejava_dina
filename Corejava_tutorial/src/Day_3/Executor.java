package Day_3;

public class Executor {
	public static void main (String[] args) {
		
		Customer c1= new Customer();
		c1.setCid(112);
		c1.setName("dina");
		c1.setAddress("pondy");
		System.out.println("customer id is "+c1.getCid());
		System.out.println("customer name "+c1.getName());
		System.out.println("customer address "+c1.getAddress());
				
				
		Customer c2= new Customer();
		c2.setName("dhiviya");
		c2.setAddress("jammu kashmir");
		System.out.println(c2);//tostring method
		
		Customer c3= new Customer();
		c3.setCid(113);
		c3.setName("diya");
		c3.setAddress("goa");
		System.out.println(c3);//tostring method
		
		Customer c4=new Customer(114,"dhiran","malvides");
		System.out.println(c4);
	}
}
