package electricity_management;

public class Bill_manager {
	
	private Electricity_bill  bill;
	
	
	
	public Bill_manager() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Bill_manager(Electricity_bill bill) {
		super();
		this.bill = bill;
	}



	public double calculate_bill(Electricity_bill bill){
		double amount = 0;
		
		double unit_consumed = bill.getCurrent_reading() - bill.getLast_reading();
		if(bill.getConsumer_type().equalsIgnoreCase("DOM")){
			if(unit_consumed<200)
			{
				amount = unit_consumed * 2.0;
			}
			else{
				amount = unit_consumed * 1.5;
			}
		}
		
		if(bill.getConsumer_type().equalsIgnoreCase("COM")){
			if(unit_consumed<400)
			{
				amount = unit_consumed * 4.0;
			}
			else{
				amount = unit_consumed * 2.5;
			}
		}

		return amount;
	}
//overloaded method
	public double calculate_bill(){
		
		// Overloaded method calling the other method within the class
		double amount = calculate_bill(bill);
		return amount;
		
		
	}
	
}
