package javaCampDay5Hw1.core;

import javaCampDay5Hw1.googleLogger.googleLoggerManager;

public class GoogleManagerAdapter implements LoggerService {

	@Override
	public void logToSystem() {
		googleLoggerManager googleLoggerManager = new googleLoggerManager();
		googleLoggerManager.log();
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		googleLoggerManager googleLoggerManager = new googleLoggerManager();
		googleLoggerManager.register();
		
	}

}
