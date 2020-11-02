package primary;

public class GuestCustomer implements Customer{

	@Override
	public void usageArea() {
		System.out.println("Guest use opened");
	}

}
