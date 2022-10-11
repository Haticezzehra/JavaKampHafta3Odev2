package Abstract;

public class CustomerManager {
	BaseDatabaseManager baseDatabaseManager;

	public void getCustomers() {
		baseDatabaseManager.getData();
	}
}
