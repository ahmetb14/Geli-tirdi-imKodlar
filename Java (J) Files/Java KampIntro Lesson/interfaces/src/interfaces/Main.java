package interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = { new SmsLogger(), new EmailLogger(), new FileLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer ahmet = new Customer(1, " >Ahmet Berkay", "Y�lmaz");

		customerManager.add(ahmet);

	}

}
