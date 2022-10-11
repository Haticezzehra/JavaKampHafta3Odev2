
public class CusttomerManager {
	private BaseLogger baseLogger;
	
public CusttomerManager(BaseLogger baseLogger) {
		super();
		this.baseLogger = baseLogger;
	}

public void add()
{
	System.out.println("Müşteri eklendi");
	baseLogger.log("Loglama mesaji");
}
}
