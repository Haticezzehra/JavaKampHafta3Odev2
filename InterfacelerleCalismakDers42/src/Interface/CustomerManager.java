package Interface;

public class CustomerManager {
	private ICustomerDal customerDal;

	public void add() {
		customerDal.add();
	}

	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}
}
