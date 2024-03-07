// simple entity program
package Day_3;

public class consumer {
		
		private int id;
		private String name;
		private String product;
		// tostring method
		@Override
		public String toString() {
			return "consumer [id=" + id + ", name=" + name + ", product=" + product + "]";
			
		}
		//default constructor
		public consumer() {
			this.id =0;
			this.name="no data entered";
			this.product="no data entered";
			
		}	
		//parameterized constructor
		public consumer(int id,String name,String product) {
			this.id=id;
			this.name=name;
			this.product=product;
		}
		
	
}
