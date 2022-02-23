package week1.assignments;

public class Mycalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
	int addition = cal.add(10, 20, 30);
	int subtraction = cal.sub(30, 10);
	double multiply = cal.mul(10.50, 20.60);
	float division = cal.div(150.50f, 100.50f);
	
	System.out.println(addition);
	System.out.println(subtraction);
	System.out.println(multiply);
	System.out.println(division);
		
		
		
	}
	
}
