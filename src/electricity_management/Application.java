package electricity_management;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Input consumer no");
		int con_no = sc.nextInt();
		
		System.out.println("input consumer name");
		String consumer_name = sc.next();
		
		System.out.println("Input last rading");
		double read = sc.nextDouble();
		
		System.out.println("Input previous reading");
		double last_read = sc.nextDouble();
		
		System.out.println("Consumer type DOM or COM");
		String type =sc.next();
		
		Electricity_bill bill = new Electricity_bill(con_no , consumer_name , read , last_read , type);
		
		Bill_manager mn1 = new Bill_manager();
		double amt =  mn1.calculate_bill(bill);
		System.out.println(amt);
		
		Bill_manager mn = new Bill_manager(new Electricity_bill(12,"sdas" , 234.21 , 200.0 , "com"));
		double amt1 = mn.calculate_bill();
		System.out.println(amt1);
		
		sc.close();
	}

}
