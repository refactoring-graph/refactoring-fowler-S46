import java.util.Enumeration;

abstract public class Statement {
	public String value(Customer aCustomer) {
		Enumeration rentals = aCustomer.getRentals();
		String result = s1(aCustomer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += s2(each);
		}
		result += s3(aCustomer);
		return result;
	}
	abstract public String s1(Customer aCustomer);
	abstract public String s2(Rental rental);
	abstract public String s3(Customer aCustomer);
}
