package Day_13;
class payment {
	double amount;
	public payment(double amount) {
		this.amount= amount;
	}
	public String pay() {
		return "paid amount: " + amount + "using UPI";
		
	}
}
class debitcard extends payment{
	public debitcard(double amount) {
		super (amount);
	}
	@Override
	public String pay() {
		
		return "paid amount: " + amount + "using UPI";
	}
	
}
class paymentprocess {
	public static<t extends payment> void paymentprocess(t payment) {
		System.out.println(payment.pay());
	}
}
public class payme {
	public static void main(String[] args) {
		debitcard d = new debitcard(65.00);
		paymentprocess.paymentprocess(d);
	}

}
