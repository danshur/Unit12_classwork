import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {

	private static Logger logger = Logger.getLogger(LoggingExample.class.getName());

	public static void main(String[] args) {
		logger.setLevel(Level.WARNING);
		logger.log(Level.SEVERE, "SEVERE");
		logger.log(Level.WARNING, "WARNING");
		logger.log(Level.INFO, "INFO");
		logger.log(Level.CONFIG, "CONFIG");
		logger.log(Level.FINE, "FINE");
		logger.log(Level.FINER, "FINER");
		logger.log(Level.FINEST, "FINEST");

	}
}
