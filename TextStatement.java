import java.util.Enumeration;

public class TextStatement extends Statement {
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

	public String s1(Customer aCustomer){
		return "Rental Record for " + aCustomer.getName() + "\n";
	}
	public String s2(Rental each){
		return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
	}
	public String s3(Customer aCustomer){
		return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
			"You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
	}
}
