package electricity_management;

public class Electricity_bill {
	
	
	private
	int consumer_no;
	String consumer_name;
	double last_reading;
	double current_reading;
	String consumer_type;
	public Electricity_bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electricity_bill(int consumer_no, String consumer_name,double current_reading, double last_reading, 
			String consumer_type) {
		super();
		this.consumer_no = consumer_no;
		this.consumer_name = consumer_name;
		this.last_reading = last_reading;
		this.current_reading = current_reading;
		this.consumer_type = consumer_type;
	}
	public int getConsumer_no() {
		return consumer_no;
	}
	public void setConsumer_no(int consumer_no) {
		this.consumer_no = consumer_no;
	}
	public String getConsumer_name() {
		return consumer_name;
	}
	public void setConsumer_name(String consumer_name) {
		this.consumer_name = consumer_name;
	}
	public double getLast_reading() {
		return last_reading;
	}
	public void setLast_reading(double last_reading) {
		this.last_reading = last_reading;
	}
	public double getCurrent_reading() {
		return current_reading;
	}
	public void setCurrent_reading(double current_reading) {
		this.current_reading = current_reading;
	}
	public String getConsumer_type() {
		return consumer_type;
	}
	public void setConsumer_type(String consumer_type) {
		this.consumer_type = consumer_type;
	}
	
	
	
	
	

}
