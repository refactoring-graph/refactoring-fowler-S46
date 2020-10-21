import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
		return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
	}
	public String s2(Rental each){
		return each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
	}
	public String s3(Customer aCustomer){
		return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
			"On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
	}
}
