package AnotherTypeofEmployee;

public class Commision extends Hourly{
	private double totalSales;
	private double commissionRate;
	
	public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commisionRate ;
	}
	
	public void addSales(double totalSales) {
		this.totalSales += totalSales;
	}
	
	@Override
	public double pay() {
		double payment = super.pay() + totalSales*(1.0 + commissionRate);
		totalSales = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + totalSales;
		return result;
	}

}
