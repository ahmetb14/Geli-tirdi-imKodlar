package inheritance;

public class Main {

	public static void main(String[] args) {

		�ndividualCustomer ahmet = new �ndividualCustomer();
		ahmet.customerNumber = "123456";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "654123";

		UnionCustomer abc = new UnionCustomer();
		abc.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();

		Customer[] customers = { ahmet, hepsiBurada, abc };

		customerManager.addMultiple(customers);
		
	}

}
