
public class Main {

	public static void main(String[] args) {
		CusttomerManager customerManager=new CusttomerManager(new DatabaseLogger());
        customerManager.add();
	}

}
