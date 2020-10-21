public class TextStatement extends Statement {
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
