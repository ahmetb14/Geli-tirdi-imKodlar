package interfaces;

public class Utils {

	public static void runLoggers(Logger[] loggers, String message) {

		for (Logger logger : loggers) {
			logger.log(message);
		}

	}

}
//Java da ana,d�� class static yap�lamaz. Ana d�� class i�erisine olu�turulan,
//classa static verilebilir.
//Utils = Ara�lar demektir C#da utilities e kar����k gelir.