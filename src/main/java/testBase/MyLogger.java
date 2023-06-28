package testBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class MyLogger {

	private static Logger logger = LogManager.getLogger();
	
	public static synchronized void startTestCase(String sTestCaseName) {
		sTestCaseName = sTestCaseName.replaceAll("[^a-zA-Z0-9]", "_").replaceAll("_+", "_");
		startLog(System.getProperty("user.dir"), sTestCaseName);
		info("\n\n**************** Execution Started: " + sTestCaseName + "****************\n");
	}
}
